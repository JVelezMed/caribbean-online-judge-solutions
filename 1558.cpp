#include <iostream>
#include <cstdio>
#include <cstring>
#include <math.h>
#include <stdlib.h>
#include <algorithm>
#include <vector>

using namespace std;

long long fibonnaci [1000001];
int main (void) {
    fibonnaci[0] = 1;
    fibonnaci[1] = 2;
    for (int i = 2; i <= 1000000; ++i) {
        fibonnaci[i] = (fibonnaci[i-1] + fibonnaci[i-2])%1000000007;
    }
    
    int cases;
    scanf("%d", &cases);
    
    int num;
    while(cases--) {
        scanf("%d", &num);
        printf("%lld\n", fibonnaci[num]);
    }
    
    return 0;
}