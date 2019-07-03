#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <stdbool.h>

int main(int argc, const char * argv[]) {
    
    int number;
    scanf("%d", &number);
    
    while(number != 0) {
        printf("%d\n", (int)ceil(sqrt(number)));
        scanf("%d", &number);
    }
    return 0;
}