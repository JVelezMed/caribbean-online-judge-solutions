#include <iostream>
#include <cstdio>
#include <math.h>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <algorithm>

using namespace std;

int main(void) {
    
    int num;
    scanf("%d", &num);
    printf("%s\n", num==2 ? "NO" : num%2==0 ? "YES" : "NO");
    return 0;
}