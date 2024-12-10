#include <stdio.h>
#include <stdlib.h>
#include <signal.h>
#include <unistd.h>

void tic(int sig);
void tac(int sig);

void tic(int sig){
  printf("TIC\n");
  signal(SIGALRM,tac);
  alarm(1);
}

void tac(int sig){
  printf("TAC\n");
  signal(SIGALRM,tic);
  alarm(1);
}

int main(int argc, char *argv[]) {
    signal(SIGALRM,tic);
    alarm(1);

    long int MAXCOUNT = 1000000000000;
    long int cont = 0;
    for(long int i = 0; i < MAXCOUNT ; i++) {
        cont ++;
    }
    return 0;
}

