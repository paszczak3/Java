#include<stdlib.h>
#include<stdio.h>
#include<unistd.h>
#include"pomiar_czasu.h"

int zmienna_globalna=0;

main(){
    int pid, wynik, i;
    char *arg_command[2];
   
    arg_command[1] = NULL;
    char number_buff[32];
    char *cmd[3];
    char arg[20];
   
    inicjuj_czas();
    for(i=0;i<1000;i++){
        pid = fork();
    
        if(pid==0){
            zmienna_globalna++;
            char *cmd[] = {"2" , "3", (char*)0};
            wynik=execv("./inc",cmd);
            if(wynik==-1)
                printf("Proces potomny nie wykonal programu\n");

            exit(0);
    } else {					
      
      wait(NULL);
      
    }
      
  }
    drukuj_czas();

}

  
