#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <stdbool.h>

int main(int argc, const char * argv[]) {
    
    int bags;
    
    while(scanf("%d", &bags) != EOF) {
        int oddCount, evenCount, sum;
        oddCount = 0;
        evenCount = 0;
        sum = 0;
        
        for (int i = 0; i < bags; ++i) {
            
            int apples;
            scanf("%d", &apples);
            sum += apples;
            if(apples % 2 == 0) {
                ++evenCount;
            }
            else {
                ++oddCount;
            }
        }
        printf("%d\n", (sum % 2 == 0) ? evenCount : oddCount);
    }
    return 0;
}