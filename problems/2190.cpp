#include <iostream>
#include <cstdio>
#include <cstring>
#include <math.h>
#include <stdlib.h>

using namespace std;
int main (void) {

    //precalc[i]: i represents 2*N
    unsigned long long precalc[34];
    precalc[0] = 1;
    precalc[1] = 1;
    precalc[2] = 2;

    for(int i = 2; i <= 66; i+=2) {
        precalc[i/2] = (precalc[i/2-1]<<2)*(i - 1)/(i + 2);
    }

    int cases;
    scanf("%d", &cases);

    int num;
    while(cases--) {
        scanf("%d", &num);
        printf("%lld\n", precalc[num/2]);
    }

    return 0;
}