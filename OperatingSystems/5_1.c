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
	int val; 
	struct semid_ds *buf; 
	ushort *array;
};
		
void wait(int sem_set_id)
{
    struct sembuf sem_op;

    sem_op.sem_num = 0;
    sem_op.sem_op = -1;
    sem_op.sem_flg = 0;
    semop(sem_set_id, &sem_op, 1);
}

void signal(int sem_set_id)
{
    struct sembuf sem_op;
    sem_op.sem_num = 0;
    sem_op.sem_op = 1;   
    sem_op.sem_flg = 0;
    semop(sem_set_id, &sem_op, 1);
}

int main(int argc, char **argv)
{
	int pid,sem,*a,*b,n,shmid;
	sem = semget(IPC_PRIVATE, 1 , 0777);
	shmid = shmget(IPC_PRIVATE, 2*sizeof(int), 0777 | IPC_CREAT);
	union semun arg;
	arg.val=1;
	semctl( sem, 0, SETVAL , arg);
	pid=fork();
	if(pid==0)
	{
			wait(sem);
			a = (int *) shmat(shmid, 0, 0);
			scanf("%d",&n);
			a[0]=n;
			shmdt(a);
			signal(sem);				
		
	}
	
	else
	{
			sleep(1);
			wait(sem);
			b = (int *) shmat(shmid, 0, 0); 
			
			int temp=b[0],i=2,count=0;
			for(i=2;i<temp;i++)
			{
				if(temp%i==0)
				{
					count++;
				}
				if(count>1)
				{
					break;
				}
			}if(count>=1)
			{
				printf("Not prime number");
			}else
			{
				printf("Prime number");
			}
			shmdt(b);
			signal(sem);
	}
	


	return 0;
}