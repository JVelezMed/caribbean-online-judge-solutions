#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>

int main(int argc, const char * argv[]) {
    
    double a, b, c;
    
    while(scanf("%lf %lf %lf", &a, &b, &c) != EOF) {
    
        double k = 0.5 * (a + b + c);
    
        double innerRadius = sqrt(k*(k-a)*(k-b)*(k-c))/k;
        double circumRadius = a*b*c / sqrt((a+b+c)*(b+c-a)*(c+a-b)*(a+b-c));
        
        if(isnan(innerRadius) || isnan(circumRadius)) {
            printf("ERROR\n");
        }
        else if(isinf(circumRadius)) {
            printf("%.2lf %.2lf\n", innerRadius, (a + b + c) / 4.0);
        }
        else {
            printf("%.2lf %.2lf\n", innerRadius, circumRadius);
        }
    }
    return 0;
}