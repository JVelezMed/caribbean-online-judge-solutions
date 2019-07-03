#include <iostream>
#include <cstdio>
#include <string>
#include <math.h>

using namespace std;

int main(){
    
    int jacksCDs, jillsCDs;
    
    scanf("%d %d", &jacksCDs, &jillsCDs);
    
    while(jacksCDs || jillsCDs) {
        
        //int max = (jacksCDs > jillsCDs) ? jacksCDs : jillsCDs;
        int *CDs = new int[1000000000];
        
        int number;
        int commonCDs = 0;
        while(jacksCDs-- > 0) {
            scanf("%d", &number);
            CDs[number] = 1;
        }
        
        while(jillsCDs-- > 0) {
            scanf("%d", &number);
            commonCDs += CDs[number];
        }
        printf("%d\n", commonCDs);
        
        scanf("%d %d", &jacksCDs, &jillsCDs);
    }
    
    return 0;
}