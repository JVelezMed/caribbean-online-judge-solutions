#include <iostream>
#include <cstdio>
#include <cstring>
#include <math.h>
#include <stdlib.h>
#include <algorithm>
#include <vector>

using namespace std;

double fastPowD(int a, int b){
    double result = 1;
    
    if(b < 0) {
        return 1.0/fastPowD(a, -b);
    }
    else {
        while (b){
            if (b&1){
                result *= a;
            }
            b >>=1;
            a *= a;
        }
    }
    
    return result;
}


int main (void) {
    
    int x, y, z;
    int bx, by, bz;
    int A, B, C, D;
    bool solution;
    
    while(scanf("%d %d %d %d", &A, &B, &C, &D) != EOF) {
        bx = by = bz = 999999;
        solution = false;
        
        for (x = 0; x <= 256; ++x) {
            y = x*x - D;
            if(y < 0) continue;
            if(x+y == 0 && B == 0) continue;    //0^0 is not valid
            
            z = A - x*x - y*y;
            if(z < 0) continue;
            double pow = fastPowD(x+y, B);
            if(pow == floor(pow) && pow+y == C) {
                solution = true;
                //printf("Solution found %d %d %d\n", x, y, z);
                
                if(x >= 0 && x < bx) {
                    bx = x;
                    by = y;
                    bz = z;
                }
                else if(x == bx) {
                    if(y >= 0 && y < by) {
                        bx = x;
                        by = y;
                        bz = z;
                    }
                    else if(y == by) {
                        if(z >= 0 && z < bz) {
                            bx = x;
                            by = y;
                            bz = z;
                        }
                    }
                }
            }
        }
        
        if(solution) {
            printf("%d %d %d\n", bx, by, bz);
        }
        else {
            printf("No solution\n");
        }
    }
    
    return 0;
}