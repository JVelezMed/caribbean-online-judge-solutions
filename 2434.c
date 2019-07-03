#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <stdbool.h>

int main(int argc, const char * argv[]) {
    
    int number;
    scanf("%d", &number);
    
    int primes[15] = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47};
    
    while(number != 0) {
        
        unsigned long long product = 1;
        
        if(number >= 47) {
            printf("614889782588491410\n");
        }
        else {
            for (int i = 0; primes[i] <= number ; ++i) {
                product *= primes[i];
            }
            printf("%lld\n", product);
        }
        scanf("%d", &number);
        
    };
    return 0;
}