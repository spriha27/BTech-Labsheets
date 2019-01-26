#include <stdio.h>
#include <sys/ipc.h>
#include <sys/shm.h>
#include <string.h>

int main(){
	int shmid,status;
	char *a, *b;
	int i;
	shmid=shmget(IPC_PRIVATE, sizeof(int), 0777|IPC_CREAT);
	if(fork()==0){
		b=shmat(shmid,0,0);
		printf("Enter string: ");
		scanf("%s",b);
		printf("Child reads: %s\n",b);
		shmdt(b);
	}
	else{
        wait(&status);
		a = shmat(shmid, 0, 0);
        printf("Parent writes %s in uppercase:\n",a);
        for(int i=0;i<strlen(a);i++){
        	printf("%c",a[i]-32);
        }
        printf("\n");
        shmdt(a);
        shmctl(shmid, IPC_RMID, 0); 
	}
	return 0;
}
