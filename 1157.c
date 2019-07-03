#include <stdio.h>
#include <math.h>

int main(int argc, const char * argv[])
{
    printf("n e\n- -----------\n0 1\n1 2\n2 2.5\n");
    int factor;
    double total = 2.5;
    for (int i = 3; i <= 9; ++i) {
        if(i == 3) {
            factor = 6;
        }
        else {
            factor *= i;
        }
        total += 1.0/factor;
        printf("%d %.9f\n", i, total);
    }
    return 0;
}