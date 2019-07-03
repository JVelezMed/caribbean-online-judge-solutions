#include <iostream>
#include <cstdio>
#include <math.h>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>

using namespace std;

int main(void) {
    int cases;
    
    scanf("%d", &cases);
    
    int length, numOfWins = 0;
    char sequence[1000];
    bool chainDeath;
    
    while(cases--) {
        chainDeath = false;
        scanf("%s", sequence);
        length = strlen(sequence);
        
        for (int i = 1; i < length && !chainDeath; ++i) {
            if(sequence[i-1] == 'C' && sequence[i] == 'D') {
                chainDeath = true;
            }
        }
        
        if(!chainDeath) {
            numOfWins++;
        }
    }
    
    printf("%d\n", numOfWins);
    
    return 0;
}