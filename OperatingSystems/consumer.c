#include <stdio.h>
#include <sys/types.h>
#include <ctype.h>
#include <stdlib.h>
#include <sys/shm.h>
#include <sys/ipc.h>
#include <unistd.h>
#include <string.h>
void main(int *a){
    int cnte;
    int cnto;
    for(int i=0;i<10;i++){
        if(a[i]%2==0){
            cnte++;
        }
        else{
            cnto++;
        }
    }
    if(cnte>cnto){
        printf("Unlocked");
    }
    else{
        printf("Permission Denied");
    }

}
