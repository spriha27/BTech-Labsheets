#include <stdio.h> 
#include <sys/ipc.h> 
#include <sys/shm.h>
#include <sys/types.h>
#include <unistd.h>
#include <stdlib.h>
#include <ctype.h>
void main(){
	int shmid, status=0;
	int *a, *b;

	shmid=shmget(IPC_PRIVATE, 100*sizeof(int), 0777|IPC_CREAT);
	pid_t pid = fork();
	int ready = 0;

	if(pid<0){
	exit(0);
	}
	else if(pid==0){
		b = (int*)shmat(shmid, 0,0);
		int n;
		int i=1;
		while(n!= -1){
				printf("Enter no");
				scanf("%d", &n);
				b[i] = n;
				i++;
		}
		b[0] = i;
		exit(0);
			shmdt(b);
	}
	else{
		int sum=0;
		a = (int*)shmat(shmid,0,0);
		wait(&status);
		for(int i=1;i<a[0]-1;i++){
			printf("parent %d", a[i]);
			sum = sum + a[i];
		}
		printf("sum=%d", sum);

		shmdt(a);
		shmctl(shmid, IPC_RMID, 0); 
	}
}
