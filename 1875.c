#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <stdbool.h>

int main(int argc, const char * argv[]) {
    
    int cases;
    scanf("%d", &cases);
    
    for (int i = 0; i < cases; ++i) {
        float number;
        scanf("%f", &number);
        
        printf("%.2f\n", 1.5*number*number*sqrt(3));
    }
    
    return 0;
}