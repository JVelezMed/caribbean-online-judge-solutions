#include <iostream>
#include <cstdio>
#include <cstring>
#include <math.h>

using namespace std;

bool isSubsetSum(int n, int sum);

int dogs[6];
int main(){

    int cases;
    scanf("%d", &cases);
    
    while(cases--) {
        int accum = 0;
        for (int i = 0; i < 6; ++i) {
            scanf("%d", &dogs[i]);
            accum += dogs[i];
        }
        
        if(accum % 2 == 0) {
            if(isSubsetSum(6, accum/2)) {
                printf("Tobby puede cruzar\n");
            }
            else {
                printf("Tobby no puede cruzar\n");
            }
        }
        else {
            printf("Tobby no puede cruzar\n");
        }
    }

    return 0;
}

bool isSubsetSum(int n, int sum)
{
    // Base Cases
    if (sum == 0)
        return true;
    if (n == 0 && sum != 0)
        return false;
    
    // If last element is greater than sum, then ignore it
    if (dogs[n-1] > sum)
        return isSubsetSum(n-1, sum);
    
    /* else, check if sum can be obtained by any of the following
     (a) including the last element
     (b) excluding the last element   */
    return isSubsetSum(n-1, sum) || isSubsetSum(n-1, sum-dogs[n-1]);
}