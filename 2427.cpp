#include <iostream>
#include <cstdio>
#include <cstring>
#include <math.h>
#include <stdlib.h>

using namespace std;

int isPrime(int n) {
    int limit = (int)sqrt(n);
    for (int i = 2; i <= limit; ++i) {
        if(n % i == 0) {
            return false;
        }
    }
    return true;
}

//The highest power p is the power of the lowest integer b where b^p = x
int main (void) {
    
    int precalc[1000001];
    precalc[1] = 0;
    
    for (int i = 2; i <= 1000000; ++i) {
        if(isPrime(i)) {
            precalc[i] = precalc[i-1] + 1;
        }
        else {
            precalc[i] = precalc[i-1];
        }
    }
    
    int a, b;
    
    while(scanf("%d %d", &a, &b) && (a || b)) {
        printf("%d\n", precalc[b] - precalc[a-1]);
    }
    
    return 0;
}