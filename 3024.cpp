#include <iostream>
#include <cstdio>
#include <math.h>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <algorithm>
#include <vector>

using namespace std;

int main(void) {

    char word[100];
    char letters[50] = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";
    
    cin.getline(word, sizeof(word));
    //printf("%s", word);
    
    for (int i = 0; i < strlen(word); ++i) {
        for (int j = 0; j < strlen(letters); ++j) {
            if(word[i] == ' ') {
                printf(" ");
                break;
            }
            else if(word[i] == letters[j]) {
                printf("%c", letters[j-1]);
            }
        }
    }
    printf("\n");

    return 0;
}