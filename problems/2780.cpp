#include <iostream>
#include <math.h>
#include <cstdio>

int main(void) {
    int distance;
    
    scanf("%d", &distance);
    
    double ex1, ex2;
    int solutions = 0;
    
    for (int i = 1; ; ++i) {
        ex1 = i * i;
        ex2 = ex1 + distance;
        
        double root = sqrt(ex2);
        
        if(root == floor(root) && (ex2 - ex1) == distance && root <= 500){
            //printf("%f %f\n", ex1, ex2);
            solutions++;
        }
        else if(root > 500)
            break;
    }
    printf("%d\n", solutions);
    return 0;
}