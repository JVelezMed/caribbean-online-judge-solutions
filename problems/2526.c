#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int findIndexOfPointWithDistance(int *array, int start, int end, int distance) {
    //Binary search
    int first=start, last=end, middle, index = -1;
    
    while (first <= last) {
        middle = (first + last)/2;
        
        if(array[middle] < distance) {
            first = middle+1;
        }
        else if(array[middle] > distance) {
            last = middle-1;
        }
        else {
            return middle;
        }
    }
    return index;
}

int main(int argc, const char * argv[])
{
    int points, sum, equilateralTriangles;
    
    //Read until end of file
    while(scanf("%d", &points) != EOF) {
        
        //The size of the array
        int arraySize = points+1;
        //The array of points
        int pointsArray[arraySize];
        pointsArray[0] = 0; //First value is zero
        
        //Reset totalSum (total length of arc) and equilateral triangles
        sum = 0;
        equilateralTriangles = 0;
        int number;
        
        //Read the array
        for (int i = 1; i < arraySize; ++i) {
            scanf("%d", &number);
            sum += number;
            pointsArray[i] = sum;
        }
        
        //printf("Exited the read part. These are the values of the array:\n");
        //Show the array
        //for (int i = 0; i < arraySize; ++i) {
        //    printf("%d\n", pointsArray[i]);
        //}
        
        //Is the arc length, a third an integer?
        double thirdArcLength = sum/3.0;
        int index;  //the index of the next equilateral point
        
        int count = 0;
        
        if(thirdArcLength == floor(thirdArcLength)) {
            int displacement = pointsArray[count];
            //I only need to know valid points for distances before the first third of the arc length
            while(displacement < thirdArcLength) {
                index = findIndexOfPointWithDistance(pointsArray, count,
                                                     points, thirdArcLength+displacement);
                //Did I find the first equlateral point?
                if(index != -1) {
                    index = findIndexOfPointWithDistance(pointsArray, index,
                                                         points, 2*thirdArcLength+displacement);
                    if(index != -1) {
                        //Found an equilateral triangle
                        equilateralTriangles++;
                    }
                }
                displacement = pointsArray[++count];
            }
        }
        printf("%d\n", equilateralTriangles);
        
    }
    return 0;
}