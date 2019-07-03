#include <iostream>
#include <cstdio>
#include <math.h>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>

using namespace std;

int main(void) {
    
    char array[100000];
    
    while(cin.getline(array, sizeof(array))) {
        string line(array);
        int i = (int)line.find("BUG");
        
        while(i != string::npos) {
            line.erase(i, 3);
            i = (int)line.find("BUG");
        }
        
        cout << line << endl;
    }
    return 0;
}