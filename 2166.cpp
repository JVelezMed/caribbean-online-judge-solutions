#include <iostream>
#include <cstdio>
#include <string>
#include <math.h>
#include <queue>

using namespace std;

int main(){
    
    priority_queue<int> numbers;
    
    int cases;
    scanf("%d", &cases);
    
    while(cases-- > 0) {
        int contestants, place;
        scanf("%d %d", &contestants, &place);
        
        int *scores = new int[contestants+1];
        numbers = priority_queue<int>();
        
        int num;
        for (int i = 1; i <= contestants; ++i) {
            
            scanf("%d", &num);
            //printf("Read a number: %d", num);
            scores[i] = num;
            numbers.push(num);
        }
        
        int testScore = scores[place];
        
        int advancers = 0;
        
        long size = numbers.size();
        while(size-- > 0) {
            if(numbers.top() > 0 && numbers.top() >= testScore) {
                ++advancers;
            }
            numbers.pop();
        }
        
        printf("%d\n", advancers);
    }
    
    
    return 0;
}