#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>

#define PI 3.141592653589793

int main(int argc, const char * argv[]) {
    int cases;
    scanf("%d", &cases);
    
    double radius;
    int sides;
    while(cases--) {
        scanf("%lf %d", &radius, &sides);
        double areaIn = 2.0*sides*radius*sin(PI/sides);
        double areaCirc = 2*sides*radius*tan(PI/sides);
        printf("%.4lf %.4lf\n", areaIn, areaCirc);
    }
}