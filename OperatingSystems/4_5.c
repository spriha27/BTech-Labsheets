#include <stdio.h> 
#include <sys/ipc.h> 
#include <sys/shm.h>
#include <sys/wait.h>
#include <unistd.h>
int main()
{
	int shmid,status;
	int *a,*b;
	int inp;
	pid_t pid1=1,pid2=1;
	printf("%d\n", getpid());
	shmid=shmget(IPC_PRIVATE,3*sizeof(int),0777|IPC_CREAT);
	pid_t ppid=getpid();
	a = (int *) shmat(shmid, 0, 0); 
	a[0]=0;
	a[1]=0;
	a[2]=0; 
	inp=getchar();  
	while(inp!=10){
		if (getpid()==ppid){
			if (inp==32)
				continue;
			 
			a[0]=inp-48;
			a[0]*=a[0];
			//printf("inp = %d\n",a[0] );
			if(pid1=fork()==0){
				b = (int *) shmat(shmid, 0, 0); 
				//printf("%d, %d\n",a[0],a[1] );
				//printf("child1 - pid=%d\n",getpid() );
				a[1]+=a[0];
				shmdt(b);
			}
			else{
				wait(&status);
				if(pid2=fork()==0){
					b = (int *) shmat(shmid, 0, 0); 
					//printf("child2 - pid=%d\n",getpid() );
					a[2]++;
					shmdt(b);
				}
				else{
					wait(&status);
				}

			}
		}
		inp=getchar();
	}
	//printf("%d\n",getpid() );
	if (getpid()==ppid){
			int mean=a[1]/a[2];
			//printf("%d - pid=%d\n",mean,getpid() );
			printf("mean = %d\n",mean );	
			shmdt(a); 
			shmctl(shmid, IPC_RMID, 0); 
	}
}
