#include <iostream>
#include <cstdio>
#include <cstring>
#include <math.h>
#include <stdlib.h>
#include <set>

using namespace std;


int gcd(int a, int b) {
    int temp;
    if (a > b) {
        temp = a;
        a = b;
        b = temp;
    }
    while(b != 0) {
        int rem = a % b;
        a = b;
        b = rem;
    }
    return a;
    
}

int main(void){
    
    int num;
    int maxGcd = 0;
    
    int numbers[100];
    
    int index = 0;
    while(scanf("%d", &num) == 1) {
        numbers[index++] = num;
    }
    
    for (int i = 0; i < index-1; ++i) {
        for (int j = i+1; j < index; ++j) {
            maxGcd = max(maxGcd, gcd(numbers[i], numbers[j]));
        }
    }
    
    printf("%d\n", maxGcd);
    
    return 0;
}