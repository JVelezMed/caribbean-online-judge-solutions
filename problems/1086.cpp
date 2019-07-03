#include <iostream>
#include <cmath>
#include <cstdio>
#include <cstring>

using namespace std;

int main(void) {

    int size;
    
    int cases = 10;
    
    while(cases--) {
        scanf("%d", &size);
        
        bool *usedNumbers = new bool[size+1];
        for (int i = 0; i <= size; ++i) {
            usedNumbers[i] = false;
        }
        
        int count = 0;
        int iterations = 0;
        for (int i = 2; count != size-1; ++i) {
            if(usedNumbers[i] == false) {
                iterations++;
                for (int j = i; j <= size; j += i) {
                    //Number not used yet
                    if(usedNumbers[j] == false) {
                        ++count;
                        usedNumbers[j] = true;
                    }
                }
            }
        }
        
        printf("%d\n", iterations);
    }
    
    return 0;
}