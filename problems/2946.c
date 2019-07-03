#include <stdio.h>
#include <stdlib.h>

int main(int argc, const char * argv[]) {
    
    int cases;
    scanf("%d", &cases);
    
    while(cases-- > 0) {
        int number;
        scanf("%d", &number);
        if(number % 2 == 1) {
            printf("%d\n", number*2);
        }
        else {
            while(number % 2 == 0) {
                number /=2;
            }
            printf("%d\n",number);
        }
    }
    
    return 0;
}