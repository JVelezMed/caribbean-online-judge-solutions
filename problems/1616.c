#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(int argc, const char * argv[]) {
    
    int hour, minute;
    while(scanf("%d:%d", &hour, &minute) != EOF) {
        printf("%.1f %.1f\n", (hour%12)*30.0 + minute/2.0, minute*6.0);
    }
    return 0;
}