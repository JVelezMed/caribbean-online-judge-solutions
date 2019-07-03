#include <stdio.h>
#include <math.h>

int main(int argc, const char * argv[])
{
    int cases;
    int dominoNumber, length, width;
    int total;
    
    scanf("%d", &cases);
    for (int i = 1; i<=cases; ++i) {
        scanf("%d %d %d", &dominoNumber, &length, &width);
        total = ((dominoNumber+1) * (dominoNumber+2)) / 2 * length * width;
        printf("%d\n", total);
    }
    
    return 0;
}