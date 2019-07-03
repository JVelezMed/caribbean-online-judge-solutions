#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(int argc, const char * argv[])
{
    int girls;
    scanf("%d", &girls);
    
    int lowestScore, highestScore;
    int number, sum;
    for (int i = 1; i <= girls; ++i) {
        sum = 0;
        
        //Read a number
        scanf("%d", &number);
        
        //Set hig and low to first number read
        highestScore = lowestScore = number;
        
        //Add number to sum
        sum += number;
        for (int j = 1; j <= 9; ++j) {
            scanf("%d", &number);
            sum += number;
            if(number > highestScore)
                highestScore = number;
            if(number < lowestScore)
                lowestScore = number;
        }
        sum -= (highestScore + lowestScore);
        
        printf("%d %d\n",i, sum);
    }
    return 0;
}