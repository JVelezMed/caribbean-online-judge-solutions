#include <iostream>
#include <cstdio>
#include <cstring>
#include <math.h>
#include <stdlib.h>

using namespace std;

//The highest power p is the power of the lowest integer b where b^p = x
int main (void) {
    
    long long a, b;
    int count;
    int carryOver;
    
    while(scanf("%lld %lld", &a, &b) && (a || b)) {
        count = 0;
        carryOver = 0;
        int num;
        while(a || b) {
            //printf("%lld %lld % d\n", a, b, carryOver);
            
            num = a%10 + b%10 + carryOver;
            carryOver = 0;
            a /= 10;
            b /= 10;
            if(num > 9) {
                carryOver = 1;
                count++;
            }

        }
        
        if(count == 1) {
            printf("1 carry operation.\n");
        }
        else if(count > 1){
            printf("%d carry operations.\n", count);
        }
        else {
            printf("No carry operation.\n");
        }

    }
    
    
    return 0;
}