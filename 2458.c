#include <stdio.h>
#include <math.h>

int main(int argc, const char * argv[])
{
    double number;
    
    scanf("%lf", &number);
    while(number != 0) {
        number *= 8;
        printf("%d\n", (int)ceil((0.5 * (-1 + sqrt(1+number)))) );
        
        scanf("%lf", &number);
    } 
    return 0;
}