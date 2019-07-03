
#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>

//Only works for equal values
int main(int argc, const char * argv[]) {

    int rain;
    int sum = 0;
    
    for (int i = 1; i <= 30; ++i) {
        scanf("%d", &rain);
        sum += rain;
    }
    
    printf("%.3f\n", (double)sum + sum/30.0);
    return 0;
}