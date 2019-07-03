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
    
    double num;
    while(cases--) {
        
        scanf("%lf", &num);
        printf("%.4lf\n", 1/(num*num));
    }

    return 0;
}