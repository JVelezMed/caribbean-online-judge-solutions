
#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(int argc, const char * argv[])
{
    long velocity, time;
    while(scanf("%ld %ld", &velocity, &time) != EOF) {
        printf("%ld\n", velocity*time*2);
    }
    return 0;
}