#include  <stdio.h> 
#include  <string.h> 
#include  <sys/types.h> 
#include  <unistd.h> 
#define   MAX_COUNT  200 
#define   BUF_SIZE   100 
void  main() 
{ 
     int pid;
     float a;
     scanf("%f",&a);
     printf("I am parent process with pid %d\n", (int) getpid());
     pid=fork();
     if(pid<0){
          printf("no baccha");
     }
     if(pid == 0){
          printf("I am a child 1 process with pid %d\n", (int) getpid());
          printf("The area of circle is %f and perimeter is %f.\n", 3.14*a*a, 6.28*a);
          pid=fork();
          if(pid<0){
               printf("no baccha");
          }
          if(pid == 0){
          printf("I am a child 2 process with pid %d\n", (int) getpid());
          printf("The area of square is %f and perimeter is %f.\n", a*a, 4*a);
     }
     }
} 