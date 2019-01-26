#include <stdio.h>
#include <sys/types.h>
#include <sys/ipc.h>
#include <sys/sem.h>
#include <sys/shm.h>
#include <stdlib.h>
#include <unistd.h>

#define MUTEX 0
#define FULL 1
#define EMPTY 2

union semun 
{
	int val; 
	struct semid_ds *buf; 
	ushort *array;
};

int count1=15, count2=15, in=0, out=0, data=1, data_out,semid;

int sem_create(int number){
	int id;
	if((id=semget(IPC_PRIVATE, number, IPC_CREAT|0777))==-1){
		perror("Error in semget.\n");
		exit(1);
	}
	return id;
}

void sem_init(int semtype, int val){
	union semun us;
	us.val=val;
	if(semctl(semid,semtype,SETVAL,us)<0){
		perror("Error in semctl.\n");
		exit(1);
	}
}

void wait(int semtype){
	struct sembuf sb;
	sb.sem_num=semtype;
	sb.sem_op=-1;
	sb.sem_flg=0;
	if(semop(semid,&sb,1)<0){
		perror("Error in semop of wait.\n");
		exit(2);
	}
}

void signal(int semtype){
	struct sembuf sb;
	sb.sem_num=semtype;
	sb.sem_op=1;
	sb.sem_flg=0;
	if(semop(semid,&sb,1)<0){
		perror("Error in semop of signal.\n");
		exit(2);
	}
}

void producer(int shmid){
	printf("Producer enters...\n");
	sleep(1);
	int id=semid;
	while(count1--){
		wait(EMPTY);
		wait(MUTEX);

		int *a = shmat(shmid,0,0);
		a[in]=data;
		printf("Producer produced %d.\n", a[in]);
		in = (in+1)%10;
		data = data+1;
		shmdt(a);
		signal(MUTEX);
		signal(FULL);
		sleep(1);
	}
	printf("Producer exits...\n");
	exit(1);
}

void consumer(int shmid){
	int id=semid;
	sleep(1);
	printf("Consumer enters...\n");
	while(count2--){
		wait(FULL);
		wait(MUTEX);

		int *b = shmat(shmid,0,0);
		data_out=b[out];
		printf("Consumer consumed %d.\n", data_out);
		out = (out+1)%10;
		data_out = data_out+1;
		shmdt(b);
		signal(MUTEX);
		signal(EMPTY);
		sleep(2);
	}
	printf("Consumer exits...\n");
	exit(1);
}

int main(){
	int pid,shmid;
	shmid = shmget(IPC_PRIVATE, 10*sizeof(int), 0777);
	semid = sem_create(3);
	sem_init(MUTEX,1);
	sem_init(FULL,0);
	sem_init(EMPTY,10);
	pid=fork();
	if(pid==0)
		producer(shmid);
	else
		consumer(shmid);
	
	return 0;
}