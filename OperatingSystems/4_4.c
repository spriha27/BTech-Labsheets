#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
#define SIZE 1024
void main(){
    int pfd[2];
    int nread;
    pid_t pid;
    int n;

    pipe(pfd);
    pid = fork();
    if(pid<0){
        printf("Fork error");
        exit(2);
    }

    else if(pid == 0){
        close(pfd[0]);
        while(n!=-1){
            printf("Enter n");
            scanf("%d", &n);
            write(pfd[1], &n, sizeof(n));
        }
        close(pfd[1]);
    }
    else{
        sleep(1);
        close(pfd[1]);
        int sum;
        while(n!=-1){
            read(pfd[0], &n, sizeof(n));
            if(n==-1){continue;
            }
            sum = sum + n;
        }
        printf("Sum=%d", sum);
        close(pfd[0]);
    }
}
