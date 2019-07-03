#include <iostream>
#include <cstdio>
#include <cstring>
#include <math.h>
#include <stdlib.h>
#include "queue"

using namespace std;

int main (void) {

    priority_queue<int> itemValues;
    
    int cases;
    scanf("%d", &cases);
    
    int sum;
    int pirates;
    int items;
    while(cases--) {
        itemValues = priority_queue<int>();

        scanf("%d %d", &pirates, &items);
        
        int num;
        for (int i = 0; i < items; ++i) {
            scanf("%d", &num);
            itemValues.push(num);
        }
        
        sum = 0;
        
        int amountForMe = items/(pirates+1);
        for (int i = 1; i <= amountForMe; ++i) {
            sum += itemValues.top();
            itemValues.pop();
        }
        
        printf("%d\n", sum);

    }
    
    return 0;
}