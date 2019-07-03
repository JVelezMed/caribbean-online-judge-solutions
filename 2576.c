#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <stdbool.h>
#include <string.h>

int main(int argc, const char * argv[]) {
    
    int names;
    scanf("%d", &names);
    
    char players[30];
    int letterCount[26];
    
    //Initialize letter count
    for (int i = 0; i < 26; ++i) {
        letterCount[i] = 0;
    }
    
    while(names-- > 0) {
        scanf("%s", players);
        letterCount[players[0]-'a']++;
    }
    
    bool teams = false;
    for (int i = 0; i < 26; ++i) {
        if(letterCount[i] >= 5) {
            teams = true;
            printf("%c", (char)('a'+i));
        }
    }
    
    if(!teams) {
        printf("PREDAJA");
    }
    
    printf("\n");
    return 0;
}