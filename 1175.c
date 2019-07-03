#include <stdio.h>
#include <stdlib.h>

int main(int argc, const char * argv[]) {
    
    int cases;
    scanf("%d", &cases);
    
    int num;
    while(cases--) {
        scanf("%*d %d", &num);
        printf("%d\n", num ^ (num >> 1));
    }
   
    return 0;
}