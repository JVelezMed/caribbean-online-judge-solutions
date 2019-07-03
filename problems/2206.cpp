#include <iostream>
#include <math.h>
#include <cstdio>
#include <stdlib.h>//absolute vallue

int main(void) {
    
    int cases;
    int r, p, q;
    
    scanf("%d", &cases);
    
    int angle;
    double ans;
    while (cases--) {
        scanf("%d %d %d", &r, &p, &q);
        angle = abs(p-q);
        if(angle > 180) {
            angle = 360 - angle;
        }
        ans = M_PI*r*r - (r*r/2.0) * (M_PI*angle/180.0 - sin(M_PI*angle/180.0));
        printf("%.3f\n", ans);
    }
    
    return 0;
}