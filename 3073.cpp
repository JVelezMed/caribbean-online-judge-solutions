#include <iostream>
#include <cstdio>
#include <math.h>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <algorithm>

using namespace std;

int main(void) {
    
    int cases, length;
    
    scanf("%d", &cases);
    
    char word[100];
    while (cases--) {
        scanf("%s", word);
        length = (int)strlen(word);
        
        if(length <= 10) {
            printf("%s\n", word);
        }
        else {
            printf("%c%d%c\n", word[0], length-2, word[length-1]);
        }
    }
    
    return 0;
}