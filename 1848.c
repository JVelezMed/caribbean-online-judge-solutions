#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <stdbool.h>

int main(int argc, const char * argv[]) {
    
    int cases;
    
    scanf("%d", &cases);
    
    if(cases >= 1) {
        //Generate fib numbers
        int fibonaccis[10000];
        
        fibonaccis[0] = 0;
        fibonaccis[1] = 1;
        
        for (int i = 2; i <= 10000; ++i) {
            fibonaccis[i] = (fibonaccis[i-1] + fibonaccis[i-2])%10000;
        }
                
        for (int i = 0; i < cases; ++i) {
            int number;
            scanf("%d", &number);
            
            if(number <= 1) {
                printf("0 0 1\n");
            }
            else {
                printf("%d %d %d\n", fibonaccis[number-2], fibonaccis[number-1], fibonaccis[number]);
            }
        }
    }
    return 0;
}