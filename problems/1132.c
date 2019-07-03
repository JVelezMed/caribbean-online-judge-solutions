#include <stdio.h>
#include <stdlib.h>
#include <math.h>

// A function to print all prime factors of a given number n
int primeFactorsSum(int n)
{
    int reps = 0;
    int product = 1;
    
    // Print the number of 2s that divide n
    while (n%2 == 0)
    {
        //printf("EVEN %d\n", n);
        n = n/2;
        reps++;
    }
    
    if(reps >= 1) {
        product *= (int)(pow(2, reps+1)-1);
    }
        
    // n must be odd at this point.  So we can skip one element (Note i = i +2)
    for (int i = 3; i <= sqrt(n); i = i+2)
    {
        reps = 0;
        // While i divides n, print i and divide n
        while (n%i == 0)
        {
            n = n/i;
            reps++;
            //printf("IN\n");
        }
        if(reps >= 1) {
            product *= (int)((pow(i, reps+1)-1)/(i-1));
        }
    }
    
    // This condition is to handle the case whien n is a prime number
    // greater than 2
    if (n > 2) {
        //printf("IN: %d\n", n);
        product *= (n+1);
    }
    //printf("Sum of factors: %d\n", product);
    //printf("Sum of PROPER factors: %d\n", product-temp);
    return product;
}

int main(int argc, const char * argv[]) {
    
    int cases;
    scanf("%d", &cases);
    
    for (int i = 0; i <cases; ++i) {
        int number;
        
        scanf("%d", &number);
        printf("%d\n", primeFactorsSum(number)-number);
    }
    
    return 0;
}