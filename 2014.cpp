#include <iostream>
#include <cstdio>
#include <cstring>
#include <math.h>
#include <stdlib.h>
#include <algorithm>
#include <string>

using namespace std;

int main (void) {
    
    int cases;
    scanf("%d", &cases);
    
    char word[110];
    char word2[110];
    int hamming;
    for (int i = 1; i <= cases; ++i) {
        scanf("%s %d", word, &hamming);
        strcpy(word2, word);
        
        int length = (int)strlen(word);
        for (int j = 0; j < length && hamming != 0; ++j) {
            if(word[j] == '1' && word2[j] == '1') {
                word2[j] = '0';
                --hamming;
            }
        }
        
        if(hamming > 0) {
            for (int j = length - 1; j >= 0 && hamming != 0; --j) {
                if(word[j] == '0' && word2[j] == '0') {
                    word2[j] = '1';
                    --hamming;
                }
            }
        }
        
        printf("Case #%d: %s\n", i, word2);
    }
    
    return 0;
}