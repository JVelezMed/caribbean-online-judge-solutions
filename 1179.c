#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>
#include <stdbool.h>
//#include <ctype.h>

//int quadratic(int a, int b, int c) {
//    return (int)((-b + sqrt(b*b+4*a*c))*0.5);
//}

int main(int argc, const char * argv[]) {
    
    int close, far;
    
    int cases;
    scanf("%d", &cases);
    
    for (int i = 0; i < cases; ++i) {
        int shops;
        scanf("%d", &shops);
        
        close = far = -1;
        for (int j = 0; j < shops; ++j) {
            int number;
            scanf("%d", &number);
            if(close == -1 && far == -1) {
                close = number;
                far = number;
            }
            else {
                if(number < close)
                    close = number;
                else if(number > far)
                    far = number;
            }
        }
        printf("%d\n", (far - close)*2);
    }
    return 0;
}