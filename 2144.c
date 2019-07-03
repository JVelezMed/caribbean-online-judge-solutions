#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <stdbool.h>

int compare (const void * a, const void * b)
{
    return ( *(int*)a - *(int*)b );
}

int main(int argc, const char * argv[]) {
    
    int cases;
    scanf("%d", &cases);
    
    for (int i = 0; i < cases; ++i) {
        int totalBags, bagsToCarry;
        char highway[9];
        
        scanf("%d %d %s", &totalBags, &bagsToCarry, highway);
        
        int bagWeights[totalBags];
        for (int j = 0; j < totalBags; ++j) {
            scanf("%d", &bagWeights[j]);
        }
        qsort(bagWeights, totalBags, sizeof(int), compare);
        
        int sum = 0;
        //Regulate highway: sum of highest
        if(highway[0] == 'r') {
            for (int k = totalBags-1; k >= totalBags-bagsToCarry ; --k) {
                sum += bagWeights[k];
            }
        }
        //Irregular highway:sum of lowest
        else {
            for (int k = 0; k < bagsToCarry ; ++k) {
                sum += bagWeights[k];
                //printf("XX%d\n", bagWeights[k]);
            }
        }
    
        printf("%d\n", sum);
    }
    
    return 0;
}