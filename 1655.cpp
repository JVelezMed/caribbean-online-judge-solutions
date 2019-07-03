#include <iostream>
#include <cstdio>
#include <cstring>
#include <math.h>

using namespace std;

int main(){

    char *subWord = new char[1000];
    char *word = new char[1000];
    
    while(scanf("%s %s", subWord, word) != EOF) {
        int length1 = (int)strlen(subWord);
        int length2 = (int)strlen(word);
        
        int goodChars = 0;
        int idx = 0, idx2 = 0;
        while(idx < length1 && idx2 < length2) {
            if(subWord[idx] == word[idx2]) {
                goodChars++;
                idx++;
                idx2++;
            }
            else {
                idx2++;
            }
        }
        
        printf("%s\n", goodChars == length1 ? "Yes" : "No");
        subWord = new char[1000];
        word = new char[1000];
        
    }
    
    
    return 0;
}