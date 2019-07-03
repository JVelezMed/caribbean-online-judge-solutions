#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int compare (const void * a, const void * b)
{
    return ( *(int*)a - *(int*)b );
}

int main(int argc, const char * argv[]) {
    
    int A, D;
    
    scanf("%d %d", &A, &D);
    
    //!0 and !0 = true
    //Strange way to read until 0 0 is the input.
    while(A != 0 || D != 0) {
        int As[A], Ds[D];
        //Read the offensive players
        for (int i = 0; i < A; ++i) {
            scanf("%d", &As[i]);
        }
        
        //Read the defensive players
        for (int i = 0; i < D; ++i) {
            scanf("%d", &Ds[i]);
        }
        
        qsort(As, A, sizeof(int), compare);
        qsort(Ds, D, sizeof(int), compare);
        
        printf("%s", (As[0] < Ds[1]) ? "Y\n" : "N\n");
        
        scanf("%d %d", &A, &D);
    }
    return 0;
}