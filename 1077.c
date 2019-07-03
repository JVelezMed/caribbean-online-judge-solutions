#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>
#include <stdbool.h>
//#include <ctype.h>

//int quadratic(int a, int b, int c) {
//    return (int)((-b + sqrt(b*b+4*a*c))*0.5);
//}

int main(int argc, const char * argv[]) {
    
    int i, j;
    
    while ( scanf ("%d %d", &i, &j) != EOF ) {
        
        int temp_i = i;
        int temp_j = j;
        
        //Swap
        if ( i > j ) {
            i = i + j - (j=i);
        }
        
        int max_cycle_length = 0;
        int cycle_length;
        
        while ( i <= j ) {
            int n = i;
            cycle_length = 1;
            
            while ( n != 1 ) {
                if ( n % 2 == 1 ) {
                    //I can do both operations because odd + odd = even number
                    n = (3 * n + 1) >> 1;
                    cycle_length += 2;
                }
                else {
                    //n /= 2;
                    //You can do this, shift n bits to the right means divide by
                    //2^n
                    n >>= 1;
                    ++cycle_length;
                };
            }
            
            if ( cycle_length > max_cycle_length )
                max_cycle_length = cycle_length;
            
            ++i;
        }
        
        printf ("%d %d %d\n", temp_i, temp_j, max_cycle_length);
    }
    
    return 0;
}