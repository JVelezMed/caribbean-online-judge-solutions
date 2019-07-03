#include <iostream>
#include <cstdio>
#include <cstring>
#include <math.h>

using namespace std;

int main(){
    
    int array1[26] = {0};
    int array2[26] = {0};
    
    char word1[26], word2[26];
    
    scanf("%s", word1);
    scanf("%s", word2);
    
    long len1 = strlen(word1);
    long len2 = strlen(word2);
    
    for(int i = 0; i < len1; ++i) {
        array1[word1[i]-'A'] = 1;
    }
    
    for(int i = 0; i < len2; ++i) {
        array2[word2[i]-'A'] = 1;
    }
    
    printf("First:");
    for(int i = 0; i < 26; ++i) {
        if(array1[i] == 1 && array2[i] == 0) {
            printf("%c", ('A' + i));
        }
    }
    printf("\n");
    
    printf("Second:");
    for(int i = 0; i < 26; ++i) {
        if(array1[i] == 0 && array2[i] == 1) {
            printf("%c", ('A' + i));
        }
    }
    printf("\n");
    
    printf("First&Second:");
    for(int i = 0; i < 26; ++i) {
        if(array1[i] == 1 && array2[i] == 1) {
            printf("%c", ('A' + i));
        }
    }
    printf("\n");
    
    return 0;
}