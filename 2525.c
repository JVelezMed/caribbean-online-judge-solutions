#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>


int main(int argc, const char * argv[])
{
    
    int total, cameBack;
    int number;
    
    while(scanf("%d %d", &total, &cameBack) != EOF) {
        int volunteers[total];
        
        //initialize array
        for (int i = 0; i < total; ++i) {
            volunteers[i] = 0;
        }
        
        for (int i = 0; i < cameBack; ++i) {
            scanf("%d", &number);
            volunteers[number-1] = 1;
        }
        
        int count, missing = total - cameBack;
        
        if (missing == 0) {
            printf("*\n");
        }
        else {
            count = 1;
            for (int i = 0; i < total; ++i) {
                //0 means missing
                if(volunteers[i] == 0) {
                    if(count == missing)
                        printf("%d \n", i+1);
                    else
                        printf("%d ", i+1);
                    count++;
                }
            }
        }
    }
    return 0;
}