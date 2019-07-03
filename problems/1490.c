#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <stdbool.h>

int main(int argc, const char * argv[]) {
    
    int cases;
    scanf("%d", &cases);
    
    
    for (int i = 0; i < cases; ++i) {
        int number;
        scanf("%d", &number);
        
        if(number%2 == 1) {
            printf("0.500000\n");
        }
        else {
            printf("%.6f\n", ((number+1)/2)/(double)(number+1));
        }
    }
    return 0;
}