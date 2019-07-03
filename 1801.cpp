#include <iostream>
#include <cstdio>
#include <cstring>
#include <math.h>

using namespace std;

int main(){

    int width, height;
    bool isInside;
    scanf("%d %d", &height, &width);
    int area = 0;   // / or \ are worth 1 . are worth 2
    
    for (int i = 0; i < height; ++i) {
        isInside = false;
        char *letter = new char[width];
        scanf("%s", letter);

        for (int j = 0; j < width; ++j) {
            if(letter[j] == '/' || letter[j] == '\\') {
                area++;
                isInside = !isInside;
            }
            else if(letter[j] == '.' && isInside) {
                area += 2;
            }
        }
    }
    printf("%d\n",area >> 1);
    
    
    return 0;
}