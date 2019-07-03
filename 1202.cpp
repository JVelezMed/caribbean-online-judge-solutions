#include <cstdio>
#include <string>
#include <math.h>
using namespace std;

void powerExponent(long number) {
    while(number > 0) {
        int power = (int)floor(log2(number));
        if(power == 0) {
            printf("2(0)");
            number -= 1;
        }
        else if(power == 1) {
            printf("2");
            number -= 2;
        }
        else {
            printf("2(");
            powerExponent(power);
            printf(")");
            number -= pow(2, power);
        }
        if(number > 0) {
            printf("+");
        }
    }

}

int main(){
    int cases;
    scanf("%d", &cases);
    
    for (int i = 0; i < cases; ++i) {
        //string answer = "";
        long number;
        scanf("%ld", &number);
        
        printf("%ld=", number);
        while(number > 0) {
            int power = (int)floor(log2(number));
            if(power == 0) {
                printf("2(0)");
                number -= 1;
            }
            else if(power == 1) {
                printf("2");
                number -= 2;
            }
            else {
                printf("2(");
                powerExponent(power);
                printf(")");
                number -= pow(2, power);
            }
            if(number > 0) {
                printf("+");
            }
        }
        printf("\n");
    }
}