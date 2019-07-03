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
    
    char word[4];
    int p;
    
    while(cases--) {
        scanf("%*d %s %d", word, &p);
        
        printf("%d\n", (p<<1) - (word[0]=='e'));
        
    }
    return 0;
}