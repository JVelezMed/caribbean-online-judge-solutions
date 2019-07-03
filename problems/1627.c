#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(int argc, const char * argv[]) {
    
    int cases;
    scanf("%d", &cases);
    
    for (int i = 0; i < cases; ++i) {
        int number;
        scanf("%d", &number);
        int zeroes = 0;
        
        //Chech the number of trailing zeroes
        for (int i = 1; i <= 11; ++i) {
            int current = number / pow(5, i);
            zeroes += current;
            
            if(current < 1) {
                //No more trailing zeroes
                break;
            }
        }
        
        printf("%d\n", zeroes);
    }
    
    return 0;
}