#include <iostream>
#include <cstdio>
#include <cstring>
#include <math.h>
#include <stdlib.h>
#include <algorithm>
#include <map>

using namespace std;

int maxSubArraySum(int a[], int size)
{
    int max_so_far = 0, max_ending_here = 0;
    int i;
    for(i = 0; i < size; i++)
    {
        max_ending_here = max_ending_here + a[i];
        if(max_ending_here < 0)
            max_ending_here = 0;
        if(max_so_far < max_ending_here)
            max_so_far = max_ending_here;
    }
    return max_so_far;
}

int main (void) {
    
    int cases;
    scanf("%d", &cases);
    
    int coins;
    while(cases--) {
        scanf("%d", &coins);
        char name1[20];
        char name2[20];
        int arr1[coins];
        int arr2[coins];
        
        scanf("%s", name1);
        for (int i = 0; i < coins; ++i) {
            scanf("%d", &arr1[i]);
        }
        
        scanf("%s", name2);
        for (int i = 0; i < coins; ++i) {
            scanf("%d", &arr2[i]);
        }
        
        int max1 = maxSubArraySum(arr1, coins);
        if(max1 == 0) {
            max1 = arr1[0];
            for (int i = 1; i < coins; ++i) {
                max1 = max(max1, arr1[i]);
            }
        }
        int max2 = maxSubArraySum(arr2, coins);
        if(max2 == 0) {
            max2 = arr2[0];
            for (int i = 1; i < coins; ++i) {
                max2 = max(max2, arr2[i]);
            }
        }
        
        if(max1 == max2) {
            printf("Tied %d\n", max1);
        }
        else if(max1 > max2) {
            printf("%s %d\n", name1, max1);
        }
        else {
            printf("%s %d\n", name2, max2);
        }
    }
    
    return 0;
}