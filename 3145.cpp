#include <iostream>
#include <cstdio>
#include <math.h>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>

using namespace std;

int main(void) {
    int notes, queries;
    scanf("%d %d", &notes, &queries);
    
    int intervals[50001];
    memset(intervals, 0, sizeof(intervals));
    
    int number, sum = 0;
    for (int i = 1; i <= notes; ++i) {
        scanf("%d", &number);
        sum += number;
        intervals[i] = sum;
        //printf("%d\n", intervals[i]);
    }
    
    for (int i = 0; i < queries; ++i) {
        scanf("%d", &number);
        for (int j = 1; j <= notes; ++j) {
            if(number >= intervals[j-1] && number < intervals[j]) {
                printf("%d\n", j);
            }
        }
    }
    
    return 0;
}