#include <iostream>
#include <cstdio>
#include <cstring>
#include <math.h>
#include <stdlib.h>
#include <set>

using namespace std;

int main(void){
    
    int cases;
    scanf("%d", &cases);
    
    char word[105];
    while(cases--) {
        scanf("%s", word);
        int length = (int)strlen(word);
        
        int upper = 0, lower = 0;
        for (int i = 0; i < length/2; ++i) {
            if(word[i] >= 'a' && word[i] <= 'z') {
                lower++;
            }
            else {
                upper++;
            }
        }
        
        int upper2 = 0, lower2 = 0;
        
        //Odd length
        if(length & 1) {
            for (int i = length - 1; i > length/2; --i) {
                if(word[i] >= 'a' && word[i] <= 'z') {
                    lower2++;
                }
                else {
                    upper2++;
                }
            }
        }
        //even length
        else {
            for (int i = length - 1; i >= length/2; --i) {
                if(word[i] >= 'a' && word[i] <= 'z') {
                    lower2++;
                }
                else {
                    upper2++;
                }
            }
        }
        
        printf("%s\n", (upper == upper2 && lower == lower2) ? "SI" : "NO");
    }
    
    return 0;
}