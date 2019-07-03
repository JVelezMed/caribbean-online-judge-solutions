#include <iostream>
#include <cstdio>
#include <math.h>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>

using namespace std;

int main(void) {
    
    char binaryNumber[110];
    char paddedNum[110];
    
    scanf("%s", binaryNumber);
    
    int length = (int)strlen(binaryNumber);
    
    if(length % 3 == 1) {
        strcpy(paddedNum, "00");
        strcat(paddedNum, binaryNumber);
    }
    else if(length % 3 == 2) {
        strcpy(paddedNum, "0");
        strcat(paddedNum, binaryNumber);
    }
    else {
        strcat(paddedNum, binaryNumber);
    }
    
    length = (int)strlen(paddedNum);
    
    for (int i = 0; i < length; i+=3) {
        printf("%d", ((paddedNum[i]-'0')<<2) +
                     ((paddedNum[i+1]-'0')<<1) +
                     ((paddedNum[i+2]-'0')));
    }
    printf("\n");
    
    return 0;
}