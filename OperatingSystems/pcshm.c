#include <stdio.h>
#include <sys/ipc.h>
#include <sys/shm.h>
#include <sys/types.h>
#include <unistd.h>
int main(){
	int shmid,status, count,i=0, c=10, e=10, j=0;
	shmid = shmget(IPC_PRIVATE, 10*sizeof(int), 0777 | IPC_CREAT);
	if(fork()==0){
		int *a;
		a=(int *)shmat(shmid,0,0);
		//produce
		while(c--){
		sleep(1);
		a[i] = count;
		printf("\nItem produced: %d", a[i]);
		count = (count+1)%10;
		i=(i+1)%10;
	}
		shmdt(a);
	}
	else{
		int *b;
		b=(int*)shmat(shmid,0,0);
		while(e--){
			sleep(2);
			printf("\nItem consumed:%d", b[j]);
			j=(j+1)%10;
		}
		shmdt(b);
		shmctl(shmid, IPC_RMID,0);
	}
}