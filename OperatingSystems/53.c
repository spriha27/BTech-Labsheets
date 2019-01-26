#include <stdio.h>
#include <sys/sem.h>
#include <semaphore.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/ipc.h>
#include <unistd.h>

void wait1(struct sembuf sem_op, int semid){
    sem_op.sem_num = 0;
    sem_op.sem_op = -1;
    sem_op.sem_flg = IPC_NOWAIT;
    semop(semid, &sem_op, 1);
}
void signal1(struct sembuf sem_op, int semid){
    sem_op.sem_num = 0;
    sem_op.sem_op = 1;
    sem_op.sem_flg = 0;
    semop(semid, &sem_op, 1);
}
int main()
{
    int val = 0;
    int pid = -1;
    int semid =  semget(IPC_PRIVATE, 1, 0777|IPC_CREAT);
    semctl(semid, 0, SETVAL, 50);
    while (1 && pid != 0)
    {
        printf("Event registration\n");
        printf("1.Register\n");
        printf("2.De-register\n");
        int ch;
        scanf("%d", &ch);

        switch (ch)
        {
        case 1:
               pid = fork();
                if (pid == 0)
                {
                    struct sembuf sem_op;
                    wait1(sem_op, semid);
                    printf("Enter your name\n");
                    char s[10];
                    scanf("%s", s);
                    printf("Hello %s, your registration is confirmed.\n", s);
                    exit(0);
                }
                else{
                    wait(0);
                }
            
            break;

        case 2:
                pid = fork();
                if (pid == 0)
                {
                    struct sembuf sem_op;
                    signal1(sem_op, semid);  
                    printf("You have successfully deregistered.\n");
                   }           }
    }
    return 0;
}