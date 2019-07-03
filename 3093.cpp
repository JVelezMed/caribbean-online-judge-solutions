#include <iostream>
#include <cstdio>
#include <math.h>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <algorithm>

using namespace std;

int main(void) {
    
    char word[1000000];
    
    scanf("%s", word);
    
    int length = (int)strlen(word);
    
    int product = 1;
    for (int i = 0; i < length; ++i) {
        product = (product * (word[i]-'A'+1)) % 26;
    }
    
    if(product < 10) {
        printf("0%d\n", product);
    }
    else {
        printf("%d\n", product);
    }
    return 0;
}