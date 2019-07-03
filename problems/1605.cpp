#include <iostream>
#include <cstdio>
#include <cstring>
#include <math.h>

using namespace std;

int main(){
    
    int input;
    
    scanf("%d", &input);
    
    while(input != 0) {
        for (int i = 0; i < (1 << input); ++i) {
            //Get the gray number
            int num = i ^ (i >> 1);
            int length = input;
            while(length) {
                printf("%d", ((num & (1 << (length-1))) >> (length-1)));
                length--;
            }
        }
        printf("\n");
        scanf("%d", &input);
    }
    return 0;
}