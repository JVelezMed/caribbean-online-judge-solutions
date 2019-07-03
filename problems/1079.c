#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>

int main(int argc, const char * argv[])
{
    int cases;
    scanf("%d",&cases);
    
    while(cases--)
    {
        //Read the triangle size
        int triangleSize;
        scanf("%d",&triangleSize);
        
        //Create the array
        int triangleArray[triangleSize][triangleSize];
        
        //Read the numbers
        for(int i = 0; i < triangleSize; i++)
        {
            for(int j=0;j<=i;j++)
            {
                scanf("%d", &triangleArray[i][j]);
            }
        }
        
        //Add from the bottom up
        for(int i = triangleSize - 2; i >= 0; i--)
        {
            for(int j=0;j<=i;j++)
            {
                triangleArray[i][j] += (triangleArray[i+1][j] > triangleArray[i+1][j+1]) ?
                                        triangleArray[i+1][j] : triangleArray[i+1][j+1];
            }
        }
        printf("%d\n",triangleArray[0][0]);
    }
    return 0;
}