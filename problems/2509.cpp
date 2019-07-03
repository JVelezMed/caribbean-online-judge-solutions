#include <iostream>
#include <cstdio>
#include <string>
#include <math.h>

using namespace std;

int main(){
    
    int width, height;
    
    
    while(scanf("%dx%d", &width, &height) != EOF) {
        if(width*3 < height*4) {
            printf("Horizontally.\n");
        }
        else if(width*3 == height*4) {
            printf("Fill the screen.\n");
        }
        else {
            printf("Vertically.\n");
        }
    }
    return 0;
}