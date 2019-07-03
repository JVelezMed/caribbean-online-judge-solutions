#include <iostream>
#include <cstdio>
#include <cstring>
#include <math.h>
#include <stdlib.h>
#include <set>

using namespace std;

long long fastPow(long long a, long long b){
    long long result = 1;
    
    while (b){
        if (b&1){
            result *= a;
        }
        b >>=1;
        a *= a;
    }
    
    //printf("Result is %lld\n", result);
    return result;
}

//The highest power p is the power of the lowest integer b where b^p = x
int main () {
    int digit, repetitions;
    
    while(scanf("%d %d", &digit, &repetitions) && (digit || repetitions)) {
        
        int square = digit*digit;
        int sum = 0;
        int carryOver = 0;
        
        int size = 2*repetitions - 1;
        //printf("Size is %d\n", size);
        int array[size];
        
        //for (int i = 0; i < size; ++i) {
        //    array[i] = 0;
        //}
        
        int idx = 0;
        int tempNumber;
        //Odd size array
        if(repetitions & 1) {
            for (int i = 1; i <= (1+size)/2; ++i) {
                //printf("Here\n");
                tempNumber = square*i + carryOver;
                array[idx] = tempNumber % 10;
                sum += array[idx++];
                carryOver = tempNumber / 10;
            }
            //Part B
            for (int i = (1+size)/2 - 1; i >= 1; --i) {
                //printf("Here 3\n");
                tempNumber = square*i + carryOver;
                array[idx] = tempNumber % 10;
                sum += array[idx++];
                carryOver = tempNumber / 10;
            }
        }
        else {
            for (int i = 1; i < (1+size)/2; ++i) {
                //printf("Here 2\n");
                tempNumber = square*i + carryOver;
                array[idx] = tempNumber % 10;
                sum += array[idx++];
                carryOver = tempNumber / 10;
            }
            //Part B
            for (int i = (1+size)/2; i >= 1; --i) {
                //printf("Here 3\n");
                tempNumber = square*i + carryOver;
                array[idx] = tempNumber % 10;
                sum += array[idx++];
                carryOver = tempNumber / 10;
            }
        }
        
//        printf("%d", carryOver);
//        for (int i = size-1; i >= 0; --i) {
//            printf("%d", array[i]);
//        }
//        printf("\n");
        
        while(carryOver) {
            sum += carryOver % 10;
            carryOver /= 10;
        }
        
        printf("%d\n", sum);
        
    }
    
    return 0;
}