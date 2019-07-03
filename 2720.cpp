#include <iostream>
#include <cstdio>
#include <cstring>
#include <math.h>

using namespace std;

int i,j,pos = 1;
int primes[168];
bool sieve[1001];    //determines which numbers are composite

//Modified Erathostenes Sieve
void build_sieve(int upperBound){
    int limit = (int)sqrt(upperBound);
    primes[0] = 2;  //the first prime is 2
    
    //true = composite, false = possible prime
    for(i = 3; i <= upperBound; i+=2) sieve[i] = false; //all odd numbers are possible primes
    for(i = 4; i <= upperBound; i+=2) sieve[i] = true;  //all even numbers are composite
    
    //All odds found
    for(i = 3; i <= upperBound; i+=2) {
        if(!sieve[i]){
            //printf("%d\n", i);
            primes[pos++] = i;
            if(i <= limit) for(j = i*i; j <= upperBound; j+=i) sieve[j] = true;
        }
    }
    //printf("%d", pos);
}

bool canBeExpressedAsPrimeSum(int number);

int main(void){
    build_sieve(1000);
    
    int array[1001];
    
    for (int i = 0; i < 168; ++i) {
        //printf("%d\n", primes[i]);
    }
    
    int count = 0;
    int next = 0;
    for (int i = 2; i <= 997;) {
        if(canBeExpressedAsPrimeSum(primes[next++])) {
            ++count;
        }
        while(i < primes[next] && i <= 1000) {
            //printf("%d %d\n",i, count);
            array[i++] = count;
        }
    }

    
    int N, leastNumOfPrimes;;
    scanf("%d %d",&N, &leastNumOfPrimes);
    printf("%s\n", leastNumOfPrimes <= array[N] ? "YES" : "NO");
    
    return 0;
}

bool canBeExpressedAsPrimeSum(int number) {
    for (int i = 0; i <= 166 && primes[i] + primes[i+1] + 1 <= number; ++i) {
        //printf("    %d\n", primes[i]);
        if(primes[i] + primes[i+1] + 1 == number) {
            //printf("%d = %d + %d + 1\n", number, primes[i], primes[i+1]);
            return true;
        }
    }
    return false;
}