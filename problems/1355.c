#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <stdbool.h>
#include <string.h>

#define PI 3.141592653589793

int main(int argc, const char * argv[]) {
    
    double number;
    
    while(scanf("%lf", &number) != EOF) {
        double answer = number*number*(6-PI)/9;
        printf("%.4lf\n", answer);
    }
    return 0;
}