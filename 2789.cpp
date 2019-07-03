#include <iostream>
#include <cstdio>
#include <math.h>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>

using namespace std;

int main(void) {
    int numCount[4];
    char equation[1000];
    int length;
    
    scanf("%s", equation);
    length = strlen(equation);
    
    memset(numCount, 0, sizeof(numCount));
    
    for (int i = 0; i < length; i += 2) {
        numCount[equation[i]-'0']++;
    }
    
    bool firstNum = true;
    for (int i = 1; i <= 3; ++i) {
        while(numCount[i] > 0) {
            if(firstNum) {
                printf("%d", i);
                firstNum = false;
            }
            else {
                printf("+%d", i);
            }
            --numCount[i];
        }
    }
    printf("\n");
    
    return 0;
}