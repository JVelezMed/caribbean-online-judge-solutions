#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <stdbool.h>

int main(int argc, const char * argv[]) {
    
    int numbers;
    
    scanf("%d", &numbers);
    
    int min, max;
    scanf("%d", &min);
    max = min;
    
    int recordsBroken = 0;
    for (int i = 1; i < numbers; ++i) {
        int x;
        scanf("%d", &x);
        if(x < min) {
            min = x;
            ++recordsBroken;
        }
        else if(x > max) {
            max = x;
            ++recordsBroken;
        }
    }
    printf("%d\n", recordsBroken);
    
    return 0;
}
