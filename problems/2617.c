#ifndef max
    #define max( a, b ) ( ((a) > (b)) ? (a) : (b) )
#endif

#ifndef min
    #define min( a, b ) ( ((a) < (b)) ? (a) : (b) )
#endif

#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>
#include <stdbool.h>

int main(int argc, const char * argv[]) {
    
    int cases;
    scanf("%d", &cases);
    
    int x1, y1, x2, y2;
    double result;
    
    while(cases-- > 0) {
        scanf("%d %d %d %d", &x1, &y1, &x2, &y2);
        
        if(x1 == x2) {  //x are equal = vertical line
            result = 0;
        }
        else if(y1 == 0 && y2 == 0) {   //y's are 0, area is zero
            result = 0;
        }
        else if(y1 == y2) { //A rectangle or square
            int deltaX = abs(x2 - x1);
            result = deltaX * abs(y1);
        }
        else if(y1*y2 > 0) {    //y's different but in same side of x plane
            int deltaX = abs(x2 - x1);
            int minNumber = abs(min(y1, y2));
            int maxNumber = abs(max(y1, y2));
            
            result = 0.5*deltaX*(minNumber+maxNumber);
        }
        else {
            int deltaX = x2-x1;
            int deltaY = y2-y1;
            double xIntercept = (deltaY*x1 - y1*deltaX) / (double)deltaY;
            
            double distance1 = (deltaY*x1 - y1*deltaX - x1*deltaY)/(double)deltaY;
            if(distance1 < 0) {
                distance1 = -distance1;
            }
            double distance2 = (deltaY*x1 - y1*deltaX - x2*deltaY)/(double)deltaY;
            if(distance2 < 0) {
                distance2 = -distance2;
            }
            double area = 0.5*distance1*abs(y1) + 0.5*distance2*abs(y2);
            result = area;
            
            //printf("dy:%d dx:%d\n", deltaY, deltaX);
            //printf("Slope is: %lf\n", (double)deltaY/deltaX);
            //printf("X intercept is: %lf\n", xIntercept);
            //printf("Distance1: %lf Distance2: %lf\n", distance1, distance2);
        }
        
        printf("%.3lf\n", result);
    }
    return 0;
}