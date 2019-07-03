#include <iostream>
#include <cstdio>
#include <cstring>
#include <string>
#include <math.h>
#include <queue>

using namespace std;

int main(){
    
    float pi = 3.141592654;
    
    int cases;
    scanf("%d", &cases);
    
    for (int i = 1; i <= cases; ++i) {
        
        float circumference;
        scanf("%f", &circumference);
        
        float area = (0.375*sqrt(3)*circumference*circumference)/(pi*pi);
        
        printf("Case %d\n", i);
        printf("Rice: %.2f\n", area*5/12);
        printf("Beans: %.2f\n", area*7/12);
    }
    
    return 0;
}