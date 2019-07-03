#include <iostream>
#include <cstdio>
#include <cstring>
#include <math.h>

using namespace std;

bool isPalindrome(int num) {
    int temp = num;
    int reversed = 0;
    
    while(temp > 0) {
        reversed = reversed*10 + temp%10;
        temp /= 10;
    }
    return reversed == num;
}

bool isPrime(int num) {
    int finish = (int)sqrt(num);
    for (int i = 2; i <= finish; ++i) {
        if(num % i == 0) {
            return false;
        }
    }
    return true;
}

int main(){
    
    int* palindromes = new int[10000001];
    palindromes[0] = 0;
    palindromes[1] = 0;
    for (int i = 2; i < 10000001; ++i) {
        if(isPalindrome(i) && isPrime(i)) {
            palindromes[i] += 1 + palindromes[i-1];
        }
        else {
            palindromes[i] = palindromes[i-1];
        }
    }
    
    int queries;
    scanf("%d", &queries);
    
    int a, b;
    while(queries--) {
        scanf("%d %d", &a, &b);
        printf("%d\n", palindromes[b] - palindromes[a-1]);
    }
    
    return 0;
}