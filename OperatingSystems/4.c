#include <stdio.h>
#include <sys/types.h>
#include <unistd.h>
#include <sys/wait.h>

void Circle(float r){
    execlp("./Circle","",(char *)NULL);
}
void Square(float length){
    execlp("./Square","",(char *)NULL);
}

int main(){

	pid_t pid;
	pid_t pid2;
	float length;
	float r;
	pid = fork();
	if(pid == 0)
		Circle(r);
	else{
		waitpid(0,&pid,0);
		pid2 = fork();
       
		if(pid2 == 0)
			Square(length);
		else
            waitpid(0,&pid2,0);
			printf("Parent Job finished.... \n");
	}
	
	return 0;
	
}

