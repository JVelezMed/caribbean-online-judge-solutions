#include <iostream>
#include <cstdio>
#include <math.h>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>

using namespace std;

int main(void) {
    
    int cases, tiers, radius, height;
    double sum;
    scanf("%d", &cases);
    
    while(cases--) {
        sum = 0;
        scanf("%d", &tiers);
        
        //Get the info on all cake tiers
        while(tiers--) {
            scanf("%d %d", &radius, &height);
            sum += radius*radius*height*M_PI;
        }
        
        printf("%.2lf\n", sum);
        
    }
    
    return 0;
}