#include <iostream>
#include <cstdio>
#include <math.h>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>

using namespace std;

int main(void) {
    
    char array[110];
    char array2[110];
    
    
    while(scanf("%s %s", array, array2) != EOF) {
        string word(array);
        string word2(array2);
        
        int i = (int)word.find(word2);
        
        while(i != string::npos) {
            word.erase(i, word2.length());
            i = (int)word.find(word2);
            
        }
        cout << word << endl;
    }
    
    return 0;
}