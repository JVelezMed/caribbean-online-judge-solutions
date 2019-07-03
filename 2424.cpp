#include <cstdio>
#include <string>
#include <math.h>
#include <set>
#include <queue>
using namespace std;

int main(){
    int cases;
    scanf("%d", &cases);
    
    priority_queue<int> socks;
    
    for (int i = 1; i <= cases; ++i) {
        socks =  priority_queue<int>();
        
        int numOfSocks;
        int number;
        scanf("%d", &numOfSocks);
        
        for (int j = 0; j < numOfSocks; ++j) {
            scanf("%d", &number);
            socks.push(number);
        }
        
        printf("Case %d: %d %d\n", i, numOfSocks+1, socks.top()+1);
    }
    
    return 0;
}