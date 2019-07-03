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
    
    int cowAmount;
    
    scanf("%d", &cowAmount);
    int speeds[cowAmount];
    
    for (int i = 0; i < cowAmount; ++i) {
        scanf("%*d %d", &speeds[i]);
    }
    
    int currSpeed = speeds[cowAmount-1];
    
    int groups = cowAmount;
    for (int i = cowAmount - 1; i >= 0; --i) {
        //Faster cows can't pass the one in front of them, so they form part
        //of a group of cows
        if(speeds[i] > currSpeed) {
            --groups;
        }
        else {
            currSpeed = speeds[i];
        }
    }
    
    printf("%d\n", groups);
    
    return 0;
}