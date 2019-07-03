#include <iostream>
#include <cstdio>
#include <math.h>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <algorithm>
#include <vector>

using namespace std;

int main(void) {

    long long int length;
    
    scanf("%lld", &length);
    
    long long int nums[length];
    for (int i = 0; i < length; ++i) {
        scanf("%lld", &nums[i]);
    }
    
    long long sum = 0;
    for (int i = 0; i < length; ++i) {
        if(i == 0) {
            printf("%lld", nums[i]*(i+1)-sum);
        }
        else {
            printf(" %lld", nums[i]*(i+1)-sum);
        }
        sum += nums[i]*(i+1)-sum;
    }
    printf("\n");

    return 0;
}