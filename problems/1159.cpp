#include <cstdio>
#include <string>
#include <math.h>
using namespace std;

int list[7] = {137, 1315, 73, 136, 255, 1384, 16385}, p;

void powerExponent(int number) {
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
    
    for (int i = 0; i < 7; ++i) {
        //string answer = "";
        int number = list[i];
        printf("%d=", number);
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