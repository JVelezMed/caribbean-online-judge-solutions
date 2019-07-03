#include <iostream>
#include <cstdio>
#include <cstring>
#include <math.h>

using namespace std;

int main(){
    
    int cases;
    scanf("%d", &cases);
    
    while(cases--) {
        int number;
        scanf("%d", &number);
        
        for (int i = 2; i <= number; ++i) {
            printf("%d ", i);
        }
        printf("1\n");
        
    }
    return 0;
}