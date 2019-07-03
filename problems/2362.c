#include <stdio.h>
#include <stdlib.h>
#include <math.h>


int main(int argc, const char * argv[])
{   
    //2362-Harry Potter and the Points
    int cases;
    scanf("%d", &cases);

    long number, answer;
    for (int i = 0; i < cases; ++i) {
        scanf("%ld", &number);
        answer = 1 + 2*number*(number-1);
        printf("%ld\n", answer);
    }

    return 0;
}