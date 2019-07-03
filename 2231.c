#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <stdbool.h>

int main(int argc, const char * argv[]) {
    
    char playerA[10], playerB[10];
    
    int cases;
    scanf("%d", &cases);
    
    int pAWins, PBWins;
    pAWins = PBWins = 0;
    for (int i = 0; i < cases; ++i) {
        scanf("%s %s", playerA, playerB);
        
        if(playerA[0] == playerB[0]) {
            pAWins++;
            PBWins++;
        }
        else if(playerA[0] == 'r' && playerB[0] == 'p') {
            PBWins++;
        }
        else if(playerA[0] == 'r' && playerB[0] == 's') {
            pAWins++;
        }
        else if(playerA[0] == 'p' && playerB[0] == 's') {
            PBWins++;
        }
        else if(playerA[0] == 'p' && playerB[0] == 'r') {
            pAWins++;
        }
        else if(playerA[0] == 's' && playerB[0] == 'r') {
            PBWins++;
        }
        else if(playerA[0] == 's' && playerB[0] == 'p') {
            pAWins++;
        }
    }
    
    if(pAWins == PBWins) {
        printf("tied\n");
    }
    else if(pAWins > PBWins) {
        printf("A win");
    }
    else {
        printf("B win");
    }
    
    return 0;
}