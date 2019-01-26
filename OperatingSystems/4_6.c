#include <stdio.h>
#include <sys/ipc.h>
#include <sys/shm.h>
#include <sys/wait.h>
#include <unistd.h>
#include <stdlib.h>
int main()
{
	int sum=0;
	int count=0;
	int shmid,status;
	int *a,*b;
	int inp;
	pid_t pid1=1,pid2=1;
	int pfd1[2];
	pipe(pfd1);
	pid_t ppid=getpid();

	inp=getchar();
	while(inp!=10){
		if (getpid()==ppid){
			if (inp==32)
				continue;

			inp=inp-48;
			inp*=inp;

			write(pfd1[1],&inp,4);
			write(pfd1[1],&sum,4);

			if(pid1=fork()==0){
				int temp;
				int no;
				read(pfd1[0],&no,4);
				read(pfd1[0],&temp,4);
				temp += no;
				write(pfd1[1],&temp,4);
				exit(0);
			}
			else{
				wait(&status);
				read(pfd1[0],&sum,4);
				write(pfd1[1],&count,4);
				if(pid2=fork()==0){
					int cnt=0;
					read(pfd1[0],&cnt,4);
					cnt++;
					write(pfd1[1],&cnt,4);
					exit(0);
				}
				else{
					wait(&status);
					read(pfd1[0],&count,4);
				}

			}
		}
		inp=getchar();
	}
	int mean=sum/count;
	printf("mean = %d\n",mean );
}
