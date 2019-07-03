#include <iostream>
#include <cstdio>
#include <math.h>
#include <stdlib.h>
#include <stdio.h>
#include <vector>
#include <algorithm>
#include <string>

using namespace std;

int main(void) {
    
    string input;
    
    cin >> input;
    
    int length = (int)input.length();
    vector<int> nums;
    int sum = 0;
    int zeroCount = 0;
    
    for (int i = 0; i < length; ++i) {
        int temp = input.at(i) - '0';
        nums.push_back(-temp);
        sum += temp;
        zeroCount += (temp == 0) ? 1 : 0;
    }
    
    
    if(sum % 3 == 0 && zeroCount > 0) {
        sort(nums.begin(), nums.end());
        for (int i = 0; i < length; ++i) {
            printf("%d", -nums.at(i));
        }
        printf("\n");
    }
    else {
        printf("-1\n");
    }
    
    return 0;
}