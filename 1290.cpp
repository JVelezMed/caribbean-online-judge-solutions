#include <iostream>
#include <cstdio>
#include <cstring>
#include <math.h>
#include <stdlib.h>
#include <algorithm>
#include <map>

using namespace std;

map<long long, long long>lookup = map<long long, long long>();

long long maxCoin(long long n) {
    if(lookup.find(n) != lookup.end()) {
        return lookup[n];
    }
    else {
        long long answer = max(n, maxCoin(n/2)+maxCoin(n/3)+maxCoin(n/4));
        lookup[n] = answer;
        return answer;
    }
}

int main (void) {
    lookup[0] = 0;
    
    long long coin;
    for (int i = 0; i < 10; ++i) {
        scanf("%lld", &coin);
        printf("%lld\n", maxCoin(coin));
    }
    return 0;
}