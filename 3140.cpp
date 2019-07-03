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
    
    for(int i = 0; i < size; ++i) {
        scanf("%d", &array[i]);
    }
    
    sort(array, array+size);
    
    for (int i = 0; i < size; ++i) {
        printf("%d\n", array[i]);
    }
    return 0;
}