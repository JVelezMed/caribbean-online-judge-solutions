#include <iostream>
#include <cstdio>
#include <math.h>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>

using namespace std;

int last_digit_factorial(int N)
{
    int i,temp,ans=1,a2=0,a5=0,a;
    
    for (i = 1; i <= N; i++)
    {
        temp = i;
        
        //divide i by 2 and 5
        while (temp%2 == 0) {
            temp >>= 1;
            ++a2;
        }
        
        while (temp%5 == 0) {
            temp/=5;
            ++a5;
        }
        
        ans = (ans*(temp%10))%10;
    }
    
    a=a2-a5;
    
    for (i = 1; i <= a; i++)
        ans=(ans << 1) %10;
    
    return ans;
}

int main(void) {
    
//    int lastDigit[5001];
//    lastDigit[1] = 1;
//    for (int i = 2; i <= 5000; ++i) {
//        lastDigit[i] = lastDigit[i-1]*i;
//        while(lastDigit[i] % 10 == 0) {
//            lastDigit[i] /= 10;
//        }
//        lastDigit[i] %= 10;
//    }
    
    int cases;
    scanf("%d", &cases);
    
    int number;
    while(cases--) {
        scanf("%d", &number);
        printf("%d\n", last_digit_factorial(number));
    }
    
    return 0;
}