#include <iostream>
#include <cstdio>
#include <string>
#include <math.h>
#include <queue>

using namespace std;

long reverseNumber(long number) {
    long reversedNum = 0;
    while(number > 0) {
        reversedNum = reversedNum * 10 + number % 10;
        number = number / 10;
    }
    return reversedNum;
}


int main(){
    
    priority_queue<long> numbers = priority_queue<long>();
    
    long number;
    scanf("%ld", &number);
    
    long input;
    
    while(number-- > 0) {
        scanf("%ld", &input);
        numbers.push(-reverseNumber(input));
    }
    
    long size = numbers.size();
    
    for (int i = 0; i < size; ++i) {
        printf("%ld\n", -numbers.top());
        numbers.pop();
    }
    
//    VERY IMPORTANT METHOD
//    for (set<long>::iterator i = numbers.begin(); i != numbers.end(); i++) {
//        printf("%ld\n", *i);
//    }
    
    return 0;
}