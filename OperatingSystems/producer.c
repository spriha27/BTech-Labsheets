#include <stdio.h>
#include <sys/types.h>
#include <string.h>
#include <sys/ipc.h>
#include <sys/shm.h>
#include <unistd.h>
#include <ctype.h>
#include <stdlib.h>
void main(int *b){
    for(int i=0;i<10;i++){
        b[i]=rand();
    }
}
