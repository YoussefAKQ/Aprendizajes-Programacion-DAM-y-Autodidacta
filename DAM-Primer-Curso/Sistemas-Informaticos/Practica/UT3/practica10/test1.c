#include <stdio.h>
#include <signal.h>
#include <time.h>
#include <unistd.h>

volatile sig_atomic_t stop;

void handle_alarm(int sig) {
    stop = 1;
}

void main() {
    long MAX_INT = 100000000000;
    long acum = 0;
    signal(SIGALRM, handle_alarm);
    alarm(60);
    for(long i=0; i<MAX_INT && !stop; i++){
        acum += 1;
    }
    printf("El valor de la variable acum es: %ld\n", acum);
}

