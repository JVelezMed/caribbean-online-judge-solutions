#include <iostream>
#include <cstdio>
#include <math.h>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>

using namespace std;

int main(void) {
    
    int a, b, c, d, P, M, G;
    int dogA, dogB;
    scanf("%d %d %d %d", &a, &b, &c, &d);
    scanf("%d %d %d", &P, &M, &G);
    
    dogA = a+b;
    dogB = c+d;
    
    //The reduces times
    int rt11, rt12, rt21, rt22, rt31, rt32;
    
    rt11 = P % dogA == 0 ? dogA : P % dogA;
    rt12 = P % dogB == 0 ? dogB : P % dogB;
    rt21 = M % dogA == 0 ? dogA : M % dogA;
    rt22 = M % dogB == 0 ? dogB : M % dogB;
    rt31 = G % dogA == 0 ? dogA : G % dogA;
    rt32 = G % dogB == 0 ? dogB : G % dogB;
    
    int attP, attM, attG;
    attP = attM = attG = 0;
    
    attP += (rt11 <= a) + (rt12 <= c);
    attM += (rt21 <= a) + (rt22 <= c);
    attG += (rt31 <= a) + (rt32 <= c);
    
    
    printf("%s\n", attP == 0 ? "none" : ((attP == 1) ? "one" : "both"));
    printf("%s\n", attM == 0 ? "none" : ((attM == 1) ? "one" : "both"));
    printf("%s\n", attG == 0 ? "none" : ((attG == 1) ? "one" : "both"));
    
    return 0;
}