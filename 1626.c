#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>

int reverseNumber(int number) {
    int reversedNum = 0;
    while(number > 0) {
        reversedNum = reversedNum * 10 + number % 10;
        number = number / 10;
    }
    return reversedNum;
}

//Only works for equal values
int main(int argc, const char * argv[]) {

    int cases;
    scanf("%d", &cases);
    while(cases-- > 0) {
        int num1, num2;
        scanf("%d %d", &num1, &num2);
        printf("%d\n", reverseNumber(reverseNumber(num1) + reverseNumber(num2)));
    }
    return 0;
}