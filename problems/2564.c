#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(int argc, const char * argv[]) {
    
    int cases;
    scanf("%d", &cases);
    
    for (int i = 0; i <cases; ++i) {
        unsigned long long number;
        scanf("%lld", &number);
        
        if(number == 0 || number == 1) {
            printf("NO\n");
        }
        else {
            double logarithm = log2(number + 1);
            if(logarithm == floor(logarithm))
                printf("NO\n");
            else
                printf("YES\n");
        }
    }
    return 0;
}