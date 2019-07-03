#include <iostream>
#include <cstdio>
#include <math.h>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <algorithm>
#include <vector>

using namespace std;

int main(void) {
    
    int amount;
    scanf("%d", &amount);
    
    vector<pair<int, int> > points (amount);
    
    int x, y, d1, d2, d3;
    int sum, maxSavings;
    sum = maxSavings = 0;
    
    for (int i = 0; i < amount; ++i) {
        scanf("%d %d", &x, &y);
        points.at(i) = make_pair(x, y);
        
        if(i >= 1) {
            sum += abs(points.at(i).first - points.at(i-1).first) +
                   abs(points.at(i).second - points.at(i-1).second);
        }
        if(i >= 2) {
            d1 = abs(points.at(i-1).first - points.at(i-2).first) +
                 abs(points.at(i-1).second - points.at(i-2).second);
            
            d2 = abs(points.at(i).first - points.at(i-1).first) +
            abs(points.at(i).second - points.at(i-1).second);
            
            d3 = abs(points.at(i).first - points.at(i-2).first) +
            abs(points.at(i).second - points.at(i-2).second);
            
            maxSavings = max(d1+d2-d3, maxSavings);
        }
    }
    
    printf("%d\n", sum - maxSavings);
    
    return 0;
}