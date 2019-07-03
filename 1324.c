#include <stdio.h>
#include <math.h>

int main(int argc, const char * argv[])
{
    int dwarfs[9];
    int sum = 0;
    int firstDwarf = -1, secondDwarf = -1;
    
    //This runs OK
    for (int i = 0; i < 9; ++i) {
        scanf("%d", &dwarfs[i]);
        sum += dwarfs[i];
    }
    
    //Sort the list in ascending order
    int lowest;
    for (int i=0; i<9 && firstDwarf==-1; ++i) {
        lowest = dwarfs[i];
        for (int j=i+1; j<9 && secondDwarf==-1; ++j) {
            if(dwarfs[j] < lowest) {
                lowest = dwarfs[j];
                dwarfs[j] = dwarfs[i];
                dwarfs[i] = lowest;
            }
        }
    }
    
    //Find the bad dwarfs
    for (int i=0; i<9 && firstDwarf==-1; ++i) {
        for (int j=i+1; j<9 && secondDwarf==-1; ++j) {
            if(sum-dwarfs[i]-dwarfs[j] == 100) {
                firstDwarf = i;
                secondDwarf = j;
            }
        }
    }
    
    //Print the good dwarfs
    for (int i = 0; i<9; ++i) {
        if(i == firstDwarf || i == secondDwarf)
            continue;
        else
            printf("%d\n", dwarfs[i]);
    }
    
    return 0;
}