#include <stdio.h>
#include <sys/ipc.h>
#include <sys/types.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/shm.h>
#include <sys/wait.h>
#include <string.h>

int main()
{
	int pfd[2];
	int nread;
	int pid;
	char buff[200];
	
	if(pipe(pfd) == -1){
		perror("pipe failed");
		exit(1);
	}
	if((pid=fork())<0){
		perror("fork failed");
		exit(2);
	}
	if(pid==0){
		close(pfd[0]);
		char arr[100];
		scanf("%s",arr);
		strcpy(buff,arr);
		write(pfd[1],buff,strlen(buff)+1);
		close(pfd[1]);
		
	}
	else{
		close(pfd[1]);
		while((nread=read(pfd[0],buff,1))!=0){
			char temp=buff[0]-32;
			printf("%c",temp);
		}
		close(pfd[0]);
	}
	return 0;
}
