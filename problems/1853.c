#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>
#include <stdbool.h>

int main(int argc, const char * argv[]) {
    
    //lets begins

    int cases;
    scanf("%d", &cases);
    
    for (int i = 0; i < cases; ++i) {
        int number;
        scanf("%d", &number);
        
        switch (number) {
            case 1:
                printf("%d\n", 4);
                break;
            case 2:
                printf("%d\n", 76);
                break;
            case 3:
                printf("%d\n", 516);
                break;
            case 4:
                printf("%d\n", 2148);
                break;
            case 5:
                printf("%d\n", 6768);
                break;
            case 6:
                printf("%d\n", 17600);
                break;
            case 7:
                printf("%d\n", 40120);
                break;
            case 8:
                printf("%d\n", 82608);
                break;
            case 9:
                printf("%d\n", 157252);
                break;
            case 10:
                printf("%d\n", 280988);
                break;
                
            default:
                break;
        }
        
    }
    return 0;
}