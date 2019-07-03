#include <iostream>
#include <cstdio>
#include <math.h>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>

using namespace std;

int main(void) {
    
    int cases;
    scanf("%d", &cases);
    
    int A, B, C;
    bool possible;
    while(cases--) {
        scanf("%d %d %d", &A, &B, &C);
        
        possible = false;
        
        if(A+B==C) {
            possible = true;
        }
        else if(A-B==C) {
            possible = true;
        }
        else if(A*B==C) {
            possible = true;
        }
        else if(B != 0 && A/B==C) {
            possible = true;
        }
        else if(B != 0 && A%B==C) {
            possible = true;
        }
        
        printf("%s\n", possible ? "YES" : "NO" );
        
    }
    
    return 0;
}