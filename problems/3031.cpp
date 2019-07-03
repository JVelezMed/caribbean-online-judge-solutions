#include <iostream>
#include <cstdio>
#include <math.h>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <algorithm>
#include <vector>

using namespace std;

int main(void) {

    int a, b;
    
    scanf("%d %d", &a, &b);
    
    while (a && b) {
        
        printf("%d %d / %d\n", a/b, a%b, b);
        scanf("%d %d", &a, &b);
    }
    
    return 0;
}