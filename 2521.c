#include <stdio.h>
#include <stdlib.h>
#include <math.h>


int main(int argc, const char * argv[])
{
    int numbers[3];
    int sum;
    
    while(scanf("%d %d %d", &numbers[0], &numbers[1], &numbers[2]) != EOF) {
        sum = 0;
        for (int i = 0; i < 3; ++i) {
            sum += numbers[i];
        }
        if(sum == 0 || sum == 3)
            printf("*\n");
        else{
            if(sum == 1) {
                if(numbers[0] == 1)
                    printf("A\n");
                if(numbers[1] == 1)
                    printf("B\n");
                if(numbers[2] == 1)
                    printf("C\n");
            }
            else if(sum == 2) {
                if(numbers[0] == 0)
                    printf("A\n");
                if(numbers[1] == 0)
                    printf("B\n");
                if(numbers[2] == 0)
                    printf("C\n");
            }
        }
    }
    return 0;
}
