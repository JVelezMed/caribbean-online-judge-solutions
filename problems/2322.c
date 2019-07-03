#include <stdio.h>
#include <stdlib.h>
#include <math.h>


int main(int argc, const char * argv[])
{
    //2322-Electrical Outlets
    int cases;
    scanf("%d", &cases);
    
    int powerStrips, sum, number;
    for (int i = 0; i < cases; ++i) {
        sum = 0;
        scanf("%d", &powerStrips);
        for (int j = 0; j < powerStrips; ++j) {
            scanf("%d", &number);
            sum += number;
        }
        printf("%d\n", sum - powerStrips + 1);
        
    }
    
    return 0;
}