#include <iostream>
#include <cstdio>
#include <cstring>
#include <math.h>
#include <stdlib.h>
#include <queue>
#include <vector>
#include <algorithm>

using namespace std;

//The highest power p is the power of the lowest integer b where b^p = x
int main (void) {
    
    vector<long long> list = vector<long long>();
    vector<long long> list2 = vector<long long>();
    
    long long sum = 0;
    
    int size;
    
    scanf("%d", &size);
    
    long long num;
    for (int i = 0; i < size; ++i) {
        scanf("%lld", &num);
        list.push_back(num);
    }
    
    for (int i = 0; i < size; ++i) {
        scanf("%lld", &num);
        list2.push_back(num);
    }
    
    sort(list.begin(), list.end());
    sort(list2.begin(), list2.end());
    
//    for (int i = 0; i < size; ++i) {
//        printf("%lld ", list.at(i));
//    }
//    printf("\n");
//    for (int i = 0; i < size; ++i) {
//        printf("%lld ", list2.at(i));
//    }
    
    for (int i = 0; i < size; ++i) {
        sum += list.at(i)*list2.at(size-i-1);
    }
    
    printf("%lld\n", sum);
    
    return 0;
}