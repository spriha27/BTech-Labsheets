#include <stdio.h> 
#include <sys/ipc.h> 
#include <sys/shm.h>
#include <stdlib.h>

#include <unistd.h>
#include <string.h>
#include <sys/types.h>
#include <sys/sem.h>
#include <semaphore.h>
union semun 
{
	int val; /* used for SETVAL only */
	struct semid_ds *buf; /* for IPC_STAT and IPC_SET, not discussed here */
	ushort *array; /* used for GETALL and SETALL */
};
		
void wait(int sem_set_id)
{
    struct sembuf sem_op;

    sem_op.sem_num = 0;
    sem_op.sem_op = -1;
    sem_op.sem_flg = 0;
    semop(sem_set_id, &sem_op, 1);
}

void
signal(int sem_set_id)
{
    struct sembuf sem_op;
    sem_op.sem_num = 0;
    sem_op.sem_op = 1;   
    sem_op.sem_flg = 0;
    semop(sem_set_id, &sem_op, 1);
}

int main(int argc, char **argv)
{
	int pid,sem,*a,shmid;
	sem = semget(IPC_PRIVATE, 1 , 0777);
	shmid = shmget(IPC_PRIVATE, 2*sizeof(int), 0777 | IPC_CREAT);
	union semun arg;
	arg.val=1;
	semctl( sem, 0, SETVAL , arg);
	int count=10;
	a = (int *) shmat(shmid, 0, 0);
	a[0]=30;
	shmdt(a);
	
	pid=fork();
	if(pid==0)
	{
		while(count!=0)
		{
			wait(sem);
			a = (int *) shmat(shmid, 0, 0);
			a[0]=a[0]-1;
			printf("%d\n",a[0]);
			count--;
			shmdt(a);
			signal(sem);
		}				
	}
			
	else
	{
		while(count!=0)
		{
			wait(sem);
			a = (int *) shmat(shmid, 0, 0);
			a[0]=a[0]+1;
			printf("%d\n",a[0]);
			count--;
			shmdt(a);
			signal(sem);
		}
	}	
	return 0;
}

