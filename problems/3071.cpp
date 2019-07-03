#include <iostream>
#include <cstdio>
#include <math.h>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <algorithm>

using namespace std;

int main(void) {
    
    long long int n, m, a;
    
    scanf("%lld %lld %lld", &n, &m, &a);
    printf("%lld\n", (long long int)(ceil(1.0*n/a) * ceil(1.0*m/a)));
    return 0;
}