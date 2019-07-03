#include <iostream>
#include <cstdio>
#include <math.h>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <algorithm>

using namespace std;

int main(void) {
    
    int numbers;
    
    scanf("%d", &numbers);
    
    //Read the numbers
    int list[numbers];
    for (int i = 0; i < numbers; ++i) {
        scanf("%d", &list[i]);
    }
    
    //Sort the list
    sort(list, list+numbers);
    
    int q1, q2;
    
    scanf("%d %d", &q1, &q2);
    
    int number;
    for (int i = 0; i < q1; ++i) {
        scanf("%d", &number);
        printf("%s\n", binary_search(list, list+numbers, number) ? ":)" : ":(");
    }
    
    for (int i = 0; i < q2; ++i) {
        scanf("%d", &number);
        printf("%d\n", list[number-1]);
    }
    
    return 0;
}