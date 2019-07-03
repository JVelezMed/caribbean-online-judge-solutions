#include <iostream>
#include <cstdio>
#include <cstring>
#include <math.h>
#include <stdlib.h>

using namespace std;

int main (void) {
    
    int day, hour, minute;
    scanf("%d %d %d", &day, &hour, &minute);
    
    //15840 + 660 + 11 = 16511
    printf("%d\n", day*1440+hour*60+minute-16511 < 0 ? -1 : day*1440+hour*60+minute-16511);
    
    return 0;
}