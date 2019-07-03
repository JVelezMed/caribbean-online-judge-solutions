#include <iostream>
#include <cstdio>
#include <cstring>
#include <math.h>

using namespace std;

int main(){
    
    int cases;
    
    scanf("%d", &cases);
    
    double a, b;
    while(cases--) {
        scanf("%lf %lf", &a, &b);
        
        double area = (a*a*b*b) / ((a+b)*(a+b));
        
        if((long long)(round(area*pow(10, 4))) % 10 == 0) {
            if((long long)(round(area*pow(10, 3))) % 10 == 0) {
                if((long long)(round(area*pow(10, 2))) % 10 == 0) {
                    if((long long)(round(area*pow(10, 1))) % 10 == 0) {
                        printf("%.0f\n", area);
                    }
                    else {
                        printf("%.1lf\n", area);
                    }
                }
                else {
                    printf("%.2lf\n", area);
                }
            }
            else {
                printf("%.3lf\n", area);
            }
        }
        else {
            printf("%.4lf\n", area);
        }
    }
    
    return 0;
}