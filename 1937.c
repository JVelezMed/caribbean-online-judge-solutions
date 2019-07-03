#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(int argc, const char * argv[])
{
    double number;
    int caseNum = 1;
    scanf("%lf", &number);
    while(number != 0) {
        printf("Case %d: %d\n",caseNum, (int)ceil(0.5*(3+sqrt(9+8*number))));
        ++caseNum;
        scanf("%lf", &number);
    }
}