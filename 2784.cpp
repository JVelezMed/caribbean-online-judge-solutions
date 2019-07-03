#include <iostream>
#include <cstdio>
#include <math.h>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <algorithm>

using namespace std;

int main(void) {
    
    int size;
    scanf("%d", &size);
    
    int array[size];
    for (int i = 0; i < size; ++i) {
        scanf("%d", &array[i]);
    }
    sort(array, array+size);
    
    printf("%d", array[size-1]);
    for (int i = 0; i < size-1; ++i) {
        printf(" %d", array[i]);
    }
    printf("\n");
    
    return 0;
}