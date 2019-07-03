#include <iostream>
#include <cstdio>
#include <math.h>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <algorithm>

using namespace std;

int main(void) {
    
    int cases, piles;
    scanf("%d", &cases);
    
    int high, sum;
    while(cases--) {
        scanf("%d", &piles);
        high = sum = 0;
        
        int toys[piles];
        int toys2[piles];
        
        for (int i = 0; i < piles; ++i) {
            scanf("%d %d", &toys[i], &toys2[i]);
            high = max(high, toys[i]+toys2[i]);
            sum += toys[i] + toys2[i];
        }
        
        printf("%d\n", high*piles - sum);
    }
    
    return 0;
}