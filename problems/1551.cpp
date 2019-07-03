#include <iostream>
#include <cstdio>
#include <cstring>
#include <math.h>
#include <stdlib.h>

using namespace std;

//The highest power p is the power of the lowest integer b where b^p = x
int main (void) {
    
    int cases = 1;
    int a, b, c;
    
    while(scanf("%d %d %d", &a, &b, &c) != EOF) {
        //Addition
        if(a+b == c) {
            printf("Case %d: %d+%d=%d\n", cases++, a, b, c);
        }
        else if(a == b+c) {
            printf("Case %d: %d=%d+%d\n", cases++, a, b, c);
        }
        //Subtraction
        else if(a-b == c) {
            printf("Case %d: %d-%d=%d\n", cases++, a, b, c);
        }
        else if(a == b-c) {
            printf("Case %d: %d=%d-%d\n", cases++, a, b, c);
        }
        //Multiplication
        else if(a*b == c) {
            printf("Case %d: %d*%d=%d\n", cases++, a, b, c);
        }
        else if(a == b*c) {
            printf("Case %d: %d=%d*%d\n", cases++, a, b, c);
        }
        //Division
        else if(a%b == 0 && a/b == c) {
            printf("Case %d: %d/%d=%d\n", cases++, a, b, c);
        }
        else if(b%c == 0 && a == b/c) {
            printf("Case %d: %d=%d/%d\n", cases++, a, b, c);
        }
    }
    
    return 0;
}