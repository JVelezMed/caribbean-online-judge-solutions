#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(int argc, const char * argv[])
{
    long cases;
    scanf("%ld", &cases);
    
    long number;
    for (long i = 1; i <= cases; ++i) {
        scanf("%ld", &number);
        printf("%ld\n", 192+(250*(number - 1)));
    }
    return 0;
}