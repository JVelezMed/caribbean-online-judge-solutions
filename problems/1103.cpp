#define COINS 5
#define MAX_CHANGE 7489

#include <iostream>
#include <cstdio>
#include <cstring>
#include <math.h>
#include <stdlib.h>

using namespace std;

//int table[MAX_CHANGE][COINS];

int table[MAX_CHANGE+1];

void constructTableV2(int S[], int m, int n )
{
    // table[i] will be storing the number of solutions for
    // value i. We need n+1 rows as the table is consturcted
    // in bottom up manner using the base case (n = 0)
    
    // Initialize all table values as 0
    memset(table, 0, sizeof(table));
    
    // Base case (If given value is 0)
    table[0] = 1;
    
    // Pick all coins one by one and update the table[] values
    // after the index greater than or equal to the value of the
    // picked coin
    for(int i=0; i<m; i++) {
        for(int j=S[i]; j<=n; j++) {
            //printf("table[%d] += table[%d] = %d\n",j ,j- S[i], table[j-S[i]]);
            table[j] += table[j-S[i]];
        }
    }
    
    //for (int i = 0; i < MAX_CHANGE; ++i) {
        //printf("table[%d] = %d\n", i, table[i]);
    //}
    
}

int main (void) {

    int arr[] = {1, 5, 10, 25, 50};
    int change;

    constructTableV2(arr, COINS, MAX_CHANGE);
    
    while(scanf("%d", &change) != EOF) {
        printf("%d\n", table[change]);
    }
    
    return 0;
}