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
    
    int E, F, C;
    while(cases--) {
        scanf("%d %d %d", &E, &F, &C);
        printf("%d\n", C==1 ? 0 : (E+F-1)/(C-1));
    }
    
    return 0;
}