
#include <iostream>
#include <cstdio>
#include <cstring>
#include <math.h>
#include <stdlib.h>
#include <algorithm>
#include <vector>

using namespace std;

int main(void) {
    
    char word[1010];
    
    scanf("%s", word);
    
    int length = (int)strlen(word);
    
    int pen1, pen2;
    pen1 = pen2 = 0;
    
    for (int i = 0; i < length; ++i) {
        switch (word[i]) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                pen1++;
                break;
                
            default:
                pen2++;
                break;
        }
    }
    
    printf("%d %d\n", pen1, pen2);
    
}