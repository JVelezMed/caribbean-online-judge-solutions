#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>

int main(int argc, const char * argv[])
{
    char digits1[100], digits2[100];
    
    //Read the first digit
    scanf("%s", digits1);
    
    int hammingDistance;
    while(digits1[0] != 'X') {
        hammingDistance = 0;
        scanf("%s", digits2);
        for (int i = 0; i < strlen(digits1); ++i) {
            if(((digits1[i]-'0')^(digits2[i]-'0')) == 1)
                ++hammingDistance;
        }
        printf("Hamming distance is %d.\n", hammingDistance);
        scanf("%s", digits1);
    }
    
    return 0;
}