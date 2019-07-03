#include <iostream>
#include <cstdio>
#include <math.h>
#include <stdlib.h>
#include <stdio.h>

using namespace std;

int latticePoints[101];

int gcd (int a, int b) {
    if(a < b) {
        a = a+b-(b=a);
    }
    
    int c;
    while ( a != 0 ) {
        c = a; a = b%a;  b = c;
    }
    return b;
}

void generate() {
    int count;
    for (int size = 1; size <= 100; ++size) {
        count = 0;
        for (int i = 0; i <= size; ++i) {
            for (int j = 0; j <= size; ++j) {
                for (int k = 0; k <= size; ++k) {
                    //0 or 1 in x,y,z coordinate is visible
                    if(i <= 1 && j <= 1 && k<= 1) {
                        ++count;
                    }
                    //Planes
                    else if(i == 0) {
                        if(gcd(j,k) == 1) {
                            ++count;
                        }
                    }
                    else if(j == 0) {
                        if(gcd(i,k) == 1) {
                            ++count;
                        }
                    }
                    else if(k == 0) {
                        if(gcd(i,j) == 1) {
                            ++count;
                        }
                    }
                    else {
                        if(gcd(i, gcd(j, k)) == 1) {
                            ++count;
                        }
                    }
                }
            }
        }
        latticePoints[size] = count-1;
    }
}
int main(void) {
    generate();
    int cases;
    
    scanf("%d", &cases);
    
    int number;
    for (int i = 1; i <= cases; ++i) {
        scanf("%d", &number);
        printf("%d\n", latticePoints[number]);
    }
    
    return 0;
}