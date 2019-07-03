#include <iostream>
#include <cstdio>
#include <math.h>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <algorithm>

using namespace std;

int main(void) {

    int cases;
    int a, b, result;
    char op;
    
    scanf("%d", &cases);
    bool valid;

    while(cases--) {
        valid = false;
        
        scanf("%d", &a);
        while(getchar() != '\n');
        op = getchar();
        while(getchar() != '\n');
        scanf("%d", &b);
        while(getchar() != '\n');
        getchar();
        while(getchar() != '\n');
        scanf("%d", &result);
        
        //printf("%c\n", op);
        if(op=='+' && a+b==result) valid = true;
        else if(op=='-' && a-b==result) valid = true;
        else if(op=='*' && a*b==result) valid = true;
        else if(op=='/' && b!=0 && a/b==result) valid = true;
        
        printf("%s\n", valid ? "Yes" : "No");
    }

    return 0;
}