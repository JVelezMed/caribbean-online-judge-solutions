#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(int argc, const char * argv[]) {
    
	int cases, x1, x2, y1, y2;
    scanf("%d", &cases);
    
    for (int i = 0; i < cases; ++i) {
        scanf("%d %d %d %d", &x1, &y1, &x2, &y2);
        printf("%d\n", abs(x2-x1) + abs(y2-y1));
    }
	return 0;
}