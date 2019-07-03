#include <iostream>
#include <cstdio>
#include <cstring>
#include <string>
#include <math.h>
#include <queue>

using namespace std;

int main(){
    
    int cases;
    scanf("%d", &cases);
    
    while(cases-- > 0) {
        char sentence[10000];
        scanf("%s", sentence);
        
        long length = strlen(sentence);
        int squareSize = (int)sqrt(length);
        
        for (int i = squareSize-1; i >= 0; --i) {
            for (int j = i; j < length; j += squareSize) {
                printf("%c", sentence[j]);
            }
        }
        printf("\n");
        
    }

    return 0;
}