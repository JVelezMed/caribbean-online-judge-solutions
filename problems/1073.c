#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>
#include <stdbool.h>

int main(int argc, const char * argv[]) {
    
    int player, c1, r1, c2, r2;
    
    bool valid;
    while(scanf("%d %d %d %d %d", &player, &c1, &r1, &c2, &r2) != EOF) {
        valid = true;
        if(c1 - c2 == 0) {
            if(abs(r1 - r2) != 1) {
                //printf("INVALID AA\n");
                valid = false;
            }
        }
        else if(r1 - r2 == 0) {
            if(abs(c1 - c2) != 1) {
                //printf("INVALID BB\n");
                valid = false;
            }
        }
        else {
            valid = false;
        }
        
        if(valid) {
            printf("%d\n", player == 1 ? 2 : 1);
        }
        else {
            printf("ERROR\n");
        }
    }
    return 0;
}