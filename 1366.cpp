#include <iostream>
#include <cstdio>
#include <math.h>
#include <stdlib.h>
#include <stdio.h>

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

int main(void) {
    int cases;
    
    scanf("%d", &cases);
    
    int number, bit, answer;
    
    while(cases--) {
        scanf("%d", &number);
        bit = answer = 0;
        
        while(1<<bit <= number) {
            if(1<<bit & number) {
                answer += fastPow(5, bit+1);
            }
            bit++;
        }
        printf("%d\n", answer);
    }
    return 0;
}