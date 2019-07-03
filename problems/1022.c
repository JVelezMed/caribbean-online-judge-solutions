#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(int argc, const char * argv[])
{
    int cases;
    
    //Read the first digit
    scanf("%d", &cases);
    
    int size, number, totalSwaps;
    for (int i = 0; i< cases; ++i) {
        totalSwaps = 0;
        scanf("%d", &size);
        int trains[size];
        
        for (int j = 0; j < size; ++j) {
            scanf("%d", &number);
            trains[j] = number;
        }
        
        int temp;
        for (int j = 0; j < size - 1; ++j) {
            if(trains[j] != j+1) {
                for (int k = j+1; k < size; ++k) {
                    if(trains[k] == j+1) {
                        temp = trains[k];
                        for (int l = k; l > j; --l) {
                            trains[l] = trains[l-1];
                        }
                        trains[j] = temp;
                        totalSwaps += k-j;
                        
                        //for (int l = 0; l < size; ++l) {
                        //    printf("%d ", trains[l]);
                        //}
                        //printf("\n");
                    }
                }
            }
        }
        printf("Optimal train swapping takes %d swaps.\n", totalSwaps);
    }
    
    
    
    return 0;
}