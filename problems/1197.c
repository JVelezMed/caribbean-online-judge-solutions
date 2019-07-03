#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(int argc, const char * argv[])
{
    int num1, num2, num3, num4;
    int snum1, snum2, snum3, snum4;

    scanf("%d.%d.%d.%d",&num1, &num2, &num3, &num4);
    scanf("%d.%d.%d.%d",&snum1, &snum2, &snum3, &snum4);
    long total = (num4-snum4)+1 + (num3-snum3)*256 +
    (num2 - snum2)*256*256 + (num1 - snum1)*256*256*256;
    printf("%ld", total);
    return 0;
}