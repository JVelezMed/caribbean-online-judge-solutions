#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>

int main(int argc, const char * argv[])
{
    int number;
    
    scanf("%d", &number);
    
    while(number != 42) {
    	printf("%d\n", number);
    	scanf("%d", &number);
    }
    
    return 0;
}