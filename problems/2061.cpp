#include <iostream>
#include <cstdio>
#include <math.h>
#include <stdlib.h>
#include <stdio.h>

using namespace std;

long long powMod(long long a, long long b, long long MOD)
{
    long x = 1, y = a;
    while (b > 0)
    {
        if (b & 1) x = (x * y) % MOD;
        y = (y * y) % MOD;
        b >>= 1;
    }
    return x;
}

int main(void) {
    int cases;
    
    scanf("%d", &cases);
    
    long long base, pow;
    long long inverse;
    for (int i = 1; i <= cases; ++i) {
        scanf("%lld %lld", &base, &pow);
        
        if(base == 1) {
            printf("%lld\n", pow+1);
        }
        else {
            inverse = powMod(base-1, 1000000005, 1000000007);
            long long answer = (powMod(base, pow+1, 1000000007)-1)%1000000007;
            printf("%lld\n", (inverse*answer)%1000000007);
        }
    }
    return 0;
}