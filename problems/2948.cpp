
#include <iostream>
#include <cmath>
#include <cstdio>
#include <cstring>

using namespace std;

int calculateLazySum(int num) {
    int sum = 0;
    while(num) {
        sum += num % 10;
        num /= 10;
    }
    return sum;
}

int main(void) {

    int cases, length, lazySum;
    char word[1010];
    
    scanf("%d", &cases);
    
    while(cases--) {
        scanf("%s", word);
        
        length = (int)strlen(word);
        lazySum = 0;
        
        for (int i = 0; i < length; ++i) {
            lazySum += word[i]-'0';
        }
        
        while(lazySum >= 10) {
            lazySum = calculateLazySum(lazySum);
        }
        
        printf("%d\n", lazySum);
        
    }
    
    return 0;
}