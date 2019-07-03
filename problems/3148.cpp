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
    
    char pos[2];
    
    while(cases--) {
        scanf("%s", pos);
        printf("%s\n", (pos[0]+pos[1]-'a'-'1')&1 ? "BLACK": "WHITE");
    }
    
    return 0;
}