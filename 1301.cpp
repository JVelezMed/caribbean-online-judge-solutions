#include <iostream>
#include <cstdio>
#include <cstring>
#include <math.h>

using namespace std;


int main(void){
    
    int radius;
    scanf("%d", &radius);
    
    long double area = M_PI*radius*radius;
    long double tArea = 2*radius*radius;
    
    printf("%.4Lf\n", truncl(area*10000)/10000.0);
    printf("%.4Lf\n", truncl(tArea*10000)/10000.0);
    
    return 0;
}