#include <iostream>
#include <cstdio>
#include <math.h>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>

using namespace std;

int main(void) {
    
    int a, b, c, d;
    
    scanf("%d %d %d %d", &a, &b, &c, &d);
    
    while(a+b+c+d != 0) {
        if(c*60+d-a*60-b > 0) {
            printf("%d\n", (c-a)*60+d-b);
        }
        else {
            printf("%d\n", 1440+(c-a)*60+d-b);
        }
        scanf("%d %d %d %d", &a, &b, &c, &d);
    }
    
    return 0;
}