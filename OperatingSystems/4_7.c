#include <stdio.h>
#include <sys/types.h>
#include <string.h>
#include <sys/ipc.h>
#include <sys/shm.h>
#include <unistd.h>
#include <ctype.h>
#include <sys/wait.h>
void Producer(int *b){
    execlp("./Producer","",(char *)NULL);
}
void Consumer(int *a){
    execlp("./Consumer","",(char *)NULL);
}
void main(){
     int shmid, status;
     int *a, *b;
     int i; 
     pid_t pid;
     shmid = shmget(IPC_PRIVATE, 10*sizeof(int), 0777|IPC_CREAT); 
     pid = fork();
     if (pid == 0){
         b = (int *) shmat(shmid, 0, 0); 
         Producer(b);

         shmdt(b);
     }
     else{
         
         waitpid(0,&pid,0);
         a = (int *) shmat(shmid,0,0);
         Consumer(a);
         

         shmdt(a);
         shmctl(shmid,IPC_RMID,0);
     }

}
