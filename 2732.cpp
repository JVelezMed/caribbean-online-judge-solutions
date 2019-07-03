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
    scanf("%d", &cases);
    
    char word[100];
    while(cases--) {
        scanf("%s", word);
        int length = (int)strlen(word);
        
        for (int i = 0; i < length; ++i) {
            if(word[i] >= 'A' && word[i] <= 'Z') {
                printf("%c", (char)(word[i]+32));
            }
            else {
                printf("%c", (char)(word[i]-32));
            }
        }
        printf("\n");
    }
    
    return 0;
}