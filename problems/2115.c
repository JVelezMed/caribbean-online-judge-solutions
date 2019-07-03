#include <stdio.h>
#include <math.h>

int main(int argc, const char * argv[])
{
    int hotDogs;
    int participants;
    double average;
    while(scanf("%d %d", &hotDogs, &participants) != EOF) {
        average = (double)hotDogs / participants;
        printf("%.2f\n", average);
    }
    return 0;
}