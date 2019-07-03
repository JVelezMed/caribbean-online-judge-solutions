#include <iostream>
#include <cstdio>
#include <cstring>
#include <math.h>
#include <stdlib.h>

using namespace std;

int main (void) {
    
    int scores, sum = 0;
    
    scanf("%d", &scores);
    
    int num;
    for (int i = 0; i < scores; ++i) {
        scanf("%d", &num);
        sum += num;
    }
    printf("%.2f\n", (double)sum/scores);
    
    return 0;
}