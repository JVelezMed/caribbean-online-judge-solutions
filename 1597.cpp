#include <iostream>
#include <cstdio>
#include <string>
#include <math.h>
#include <queue>

using namespace std;

int main(){
    
    priority_queue<int> numbers;
    
    int high, low, judges;
    
    scanf("%d %d %d", &high, &low, &judges);
    
    //This is just like a while(!equal to 0 0 0)
    while(high || low || judges) {
        
        //Initialize the priority queue INSIDE
        numbers = priority_queue<int>();
        
        //Read the scores
        int score;
        while(judges-- > 0) {
            //Add score to priority queue
            scanf("%d", &score);
            numbers.push(-score);
        }
        
        //Remove the n lowest scores
        while(low-- > 0) {
            numbers.pop();
        }
        
        long scoresToCount = numbers.size()-high;
        
        long sum = 0;
        for (long i = 0; i < scoresToCount; ++i) {
            sum += -numbers.top();
            numbers.pop();
        }
        
        printf("%.6f\n", (double)sum/scoresToCount);
        
        scanf("%d %d %d", &high, &low, &judges);
    }
    
    return 0;
}