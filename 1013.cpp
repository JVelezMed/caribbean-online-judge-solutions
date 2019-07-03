#include <iostream>
#include <cstdio>
#include <cstring>
#include <math.h>
#include <stdlib.h>
#include <set>

using namespace std;

long long fastPow(long long a, long long b){
    long long result = 1;

    while (b){
        if (b&1){
            result *= a;
        }
        b >>=1;
        a *= a;
    }

    //printf("Result is %lld\n", result);
    return result;
}

//The highest power p is the power of the lowest integer b where b^p = x
int main (void) {
    long long n;
    
    while (scanf ("%lld", &n) && n) {
        int limit = sqrt(abs(n));
        int maxPow = 1;
        
        if(n < 0) {
            for (int i = -2; i >= -limit; i-- ) {
                long long ans = i;
                int p = 2;
                
                while ( ans > n ) {
                    ans = fastPow(i, p);
                    p++;
                }
                if ( ans == n ) {
                    maxPow = p - 1;
                    break;
                }
            }
        }
        else {
            for (int i = 2; i <= limit; i++ ) {
                long long ans = i;
                int p = 2;
                
                while ( ans < n ) {
                    ans = fastPow(i, p);
                    p++;
                }
                if ( ans == n ) {
                    maxPow = p - 1;
                    break;
                }
            }
        }
        
        
        printf("%d\n", maxPow);
    }
    
    return 0;
}