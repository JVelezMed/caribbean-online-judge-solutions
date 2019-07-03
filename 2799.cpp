#include <iostream>
#include <cstdio>
#include <cstring>
#include <math.h>

using namespace std;


int main(void){
    
    int a,b,c;
    
    scanf("%d", &a);
    scanf("%d", &b);
    scanf("%d", &c);
    
    //printf("%d %d %d\n", a, b, c);
    
    if(a+b+c == 180 && a > 0 && b > 0 && c > 0) {
        if(a==b && a==c) {
            printf("Equilateral\n");
        }
        else if((a==b && a!= c) || (a==c && a!= b) || ((b==c && b!= a))) {
            printf("Isosceles\n");
        }
        else {
            printf("Scalene\n");
        }
    }
    else {
        printf("Error\n");
    }

    
    return 0;
}
