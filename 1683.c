#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <stdbool.h>
#include <string.h>

int main(int argc, const char * argv[]) {
    
    int sums[500];
    for (int i = 1; i <= 500; ++i) {
        int sum = 0;
        for (int j = 1; j < i; ++j) {
            if(i % j == 0) {
                sum += j;
            }
        }
        sums[i] = sum;
    }
    
    int cases;
    scanf("%d", &cases);
    
    while(cases-- > 0) {
        int number;
        scanf("%d", &number);
        
        if(sums[number] > number) {
            printf("Abundant\n");
        }
        else if(sums[number] == number) {
            printf("Perfect\n");
        }
        else {
            printf("Deficient\n");
        }
    }
    return 0;
}