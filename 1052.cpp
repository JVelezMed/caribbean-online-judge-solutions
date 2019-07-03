#include <iostream>
#include <cstdio>
#include <cstring>
#include <math.h>
#include <stdlib.h>
#include <algorithm>
#include <vector>

using namespace std;

bool isPrime(long n);
bool isPrimeRib(long n);

vector<long> primeRibs;

bool isPrime(long n) {
    if(n == 1) return false;
    if(n == 2) return true;
    
    long limit = (long)sqrt(n);
    for (int i = 2; i <= limit; ++i) {
        if(n % i == 0) {
            return false;
        }
    }
    return true;
}

bool isPrimeRib(long n) {
    while(n) {
        if(isPrime(n)) {
            n /= 10;
        }
        else {
            return false;
        }
    }
    return true;
}

void generatePrimeRib() {
    int start = 0, end = 3;
    primeRibs.push_back(2);
    primeRibs.push_back(3);
    primeRibs.push_back(5);
    primeRibs.push_back(7);
    
    int count;
    for (int digits = 2; digits <= 8; ++digits) {
        count = 0;
        for (int i = start; i <= end; ++i) {
            for (int j = 1; j <= 9; j += 2) {
                if(isPrimeRib(10*primeRibs[i]+j)) {
                    //printf("%ld\n", 10*primeRibs[i]+j);
                    primeRibs.push_back(10*primeRibs[i]+j);
                    count++;
                }
            }
        }
        start = end+1;
        end = start+count-1;
    }
}

int main (void) {
    generatePrimeRib();
    
    
    int N;
    while(scanf("%d", &N) != EOF) {
    
    int size = (int)primeRibs.size();
    for (int i = 0; i < size; ++i) {
        if (primeRibs[i] >= pow(10, N-1) && primeRibs[i] <= pow(10, N)-1 ) {
            printf ("%ld\n", primeRibs[i]);
        }
    }
    }
}