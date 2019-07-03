#include <iostream>
#include <cstdio>
#include <cstring>
#include <math.h>
#include <stdlib.h>
#include <algorithm>
#include <vector>

using namespace std;

int main(void) {
    
    char wordA[100010];
    char wordB[100010];
    
    int len1, len2;
    
    while(scanf("%s %s", wordA, wordB) != EOF) {
        //Get the length of the word
        len1 = (int)strlen(wordA);
        len2 = (int)strlen(wordB);
        
        int count1, count2;
        count1 = count2 = 0;
        
        //Keep going until you reach the and of any of the two words
        while(count1 < len1 && count2 < len2) {
            //Match!
            if(wordA[count1] == wordB[count2]) {
                count1++;
            }
            count2++;
        }
        
        printf("%s\n", count1 == len1 ? "Yes" : "No");
    }
    
    return 0;
    
}