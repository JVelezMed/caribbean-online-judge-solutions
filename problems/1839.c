#include <stdio.h>

int main(int argc, const char * argv[])
{
    int cases;
    scanf("%d", &cases);
    int number;
    
    for (int i = 1; i <= cases; i++) {
        scanf("%d", &number);
        printf("%d\n", 8 * number + 42);
    }
    return 0;
}