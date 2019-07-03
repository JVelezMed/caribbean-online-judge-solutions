#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>

int main(int argc, const char * argv[])
{
    int cases = 1000;
    int a, b;
    while(cases--) {
        scanf("%d %d", &a, &b);
        printf("%d\n", a+b);
    }
}