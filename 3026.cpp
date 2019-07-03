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

    int mosquitoes, minX = 99999, maxX = -99999, minY = 99999, maxY = -99999;
    
    scanf("%d", &mosquitoes);
    
    int x, y;
    while(mosquitoes--) {
        scanf("%d %d", &x, &y);
        minX = min(x, minX);
        maxX = max(x, maxX);
        minY = min(y, minY);
        maxY = max(y, maxY);
    }
    
    int minSquare = max(maxX-minX, maxY-minY);
    
    printf("%d\n", minSquare*minSquare);
    
    return 0;
}