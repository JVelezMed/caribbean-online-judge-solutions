#include <iostream>
#include <cstdio>
#include <cstring>
#include <math.h>
#include <stdlib.h>
#include <algorithm>
#include <vector>

using namespace std;

int main (void) {

    long long n;
    scanf("%lld", &n);

    long long F;
    long long V;
    while(n != 0) {
        
        F = 6*n*n;
        V = 1+3*n*(n+1);
        printf("%lld %lld %lld\n", F, V, F+V-1);

        scanf("%lld", &n);
    }
    return 0;
}