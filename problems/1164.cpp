#include <iostream>
#include <cstdio>
#include <cstring>
#include <math.h>

using namespace std;

int main(void){
    
    char word[100000];
    char word2[100000];
    
    scanf("%s %s", word, word2);
    string in = word;
    string in2 = word2;
    
    while(in.at(0) != '*' && in2.at(0) != '*') {
        
        long len = in.length();
        long len2 = in2.length();
        long maxLength = max(len, len2);
        
        for (int i = 0; i < maxLength - len; ++i) {
            in.insert(0, "0");
        }
        
        for (int i = 0; i < maxLength - len2; ++i) {
            in2.insert(0, "0");
        }
        
        int compare = in.compare(in2);
        if(compare == 0) {
            printf("=\n");
        }
        else if(compare < 0) {
            printf("<\n");
        }
        else {
            printf(">\n");
        }
        
        scanf("%s %s", word, word2);
        in = word;
        in2 = word2;
    }
    
    return 0;
}