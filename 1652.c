#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>
#include <stdbool.h>

int moveTower(int disks, int start, int end, int temp) {
    if(disks == 1) {
        printf("Move ring from stick %d to stick %d.\n", start, end);
        return 1;
    }
    else {
        int sum = 0;
        sum += moveTower(disks-1, start, temp, end);
        printf("Move ring from stick %d to stick %d.\n", start, end);
        sum++;
        sum += moveTower(disks-1, temp, end, start);
        return sum;
    }
}

int main(int argc, const char * argv[]) {
    
    int disks;
    scanf("%d", &disks);
    int moves = moveTower(disks, 1, 3, 2);
    printf("You needs %d moves.", moves);
    
    return 0;
}