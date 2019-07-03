#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>

int main(int argc, const char * argv[]) {
    
    int cases;
    scanf("%d", &cases);
    
    while(cases-- > 0) {
        int height, length;
        scanf("%d %d", &height, &length);
        
        double area1 = height * length * 0.125;
        double area2 = height * length * 0.0625;
        
        printf("%.8f\n", area1 + area2);
    }
    return 0;
}