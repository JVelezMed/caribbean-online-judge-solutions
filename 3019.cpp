#include <algorithm>
#include <cmath>
#include <cstdio>
#include <cstring>
#include <set>
#include <vector>

using namespace std;

int main() {
    
    int cases, num, sum;
    scanf("%d", &cases);
    while(cases--) {
        sum = 0;
        
        //Read the size of the list
        scanf("%d", &num);
        
        int x;
        for (int i = 1; i <= num; ++i) {
            scanf("%d", &x);
            sum += abs(1.0*x-i);
        }
        printf("%d\n", sum);
    }
    return 0;
}