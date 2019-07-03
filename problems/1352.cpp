#include <iostream>
#include <cstdio>
#include <cstring>
#include <math.h>
#include <stdlib.h>
#include <algorithm>
#include <string>

using namespace std;

int main (void) {
    
    int size;
    scanf("%d", &size);
    
    int left, right;
    while(size) {
        left = -1;
        right = -1;
        int nums[size];
        for (int i = 0; i < size; ++i) {
            scanf("%d", &nums[i]);
        }
        
        //Get left (permutation start)
        for (int i = 0; i < size; ++i) {
            if(nums[i] != i+1) {
                left = i;
                break;
            }
        }
        //Get right (permutation end)
        for (int i = size-1; i >= 0; --i) {
            if(nums[i] != i+1) {
                right = i;
                break;
            }
        }
        
        //No correct permutation
        if(left == -1 || right == -1) {
            printf("0 0\n");
        }
        else {
            //Check if permutation is correct;
            bool correct = true;
            for (int i = left; i <= right-1; ++i) {
                if(nums[i] < nums[i+1]) {
                    correct = false;
                }
            }
            if(correct) {
                printf("%d %d\n", left+1, right+1);
            }
            else {
                 printf("0 0\n");
            }
        }
        
        scanf("%d", &size);
    }
    
    return 0;
}