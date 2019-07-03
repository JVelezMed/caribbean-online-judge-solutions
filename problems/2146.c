#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(int argc, const char * argv[])
{
    long diagonals, sides;
    scanf("%ld %ld", &diagonals, &sides);
   if( (sides * (sides - 3))/2 == diagonals)
       printf("yes");
    else
        printf("no");
    return 0;
}