#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>

int compare (const void * a, const void * b) {
    return ( *(int*)a - *(int*)b );
}

int main(int argc, const char * argv[]) {
    int cases, voters = 0;
    
    scanf("%d", &cases);
    
    int groups[cases];
    for(int i=0;i<cases;i++)
        scanf("%d", &groups[i]);
    
    qsort(groups, cases, sizeof(int), compare);
    
    for(int i=0; i < (cases/2)+1;i++)
        voters += (groups[i]/2)+1;
    
    printf("%d\n", voters);
}