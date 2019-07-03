#include <iostream>
#include <cstdio>
#include <math.h>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>

using namespace std;

int main(void) {
    
    //Precalculating
    long long preCalc[1000010];
    preCalc[1] = 1;
    
    for (int i = 2; i <= 1000000; ++i) {
        preCalc[i] = (preCalc[i-1]*i+1) % 1000003;
    }
    
    int cases;
    
    scanf("%d", &cases);
    
    int num;
    while(cases--) {
        
        scanf("%d", &num);
        printf("%lld\n", preCalc[num]);
    }

    return 0;
}
