//2183 - Parity Words
#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(int argc, const char * argv[]) {
    
	long teams, games;
    scanf("%ld %ld", &teams, &games);
    printf("%ld\n", teams*(teams-1)/2*games);
	return 0;
}