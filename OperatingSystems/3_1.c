#include  <stdio.h> 
#include  <string.h> 
#include  <sys/types.h> 
#include  <unistd.h> 
#define   MAX_COUNT  200 
#define   BUF_SIZE   100 
void  main() 
{ 
     int pid;
     float side=10.0;
     float rad=7.0;
     printf("I am parent process with pid %d\n", (int) getpid());
     printf(" The area of circle is %f and perimeter is %f.\n", 3.14*rad*rad, 6.28*rad);
     pid=fork();
     if(pid<0){
     	printf("no baccha");
     }
     else if(pid == 0){
     	printf("I am a child process with pid %d\n", (int) getpid());
     	printf(" The area of square is %f and perimeter is %f.\n", side*side, 4*side);
     }
} 