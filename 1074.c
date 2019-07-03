#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>
#include <stdbool.h>

static int x[13];
static int lineCounter, boardSize;
static bool solutionFound;

//This tries to place a queen in a valid spot
bool place(int queen, int row);
void nQueens(int queen);

int main(int argc, const char * argv[]) {
    
    while(scanf("%d", &boardSize) != EOF) {
        lineCounter = 0;
        solutionFound = false;
        
        //Run the nqueens algorithm
        nQueens(1);
        if(!solutionFound) {
            printf("No Solution.\n");
        }
    }
    
}

//This tries to place a queen in a valid spot
bool place(int queen, int row) {
    //System.out.println("Entered place method");
    //System.out.println(queen + " " + row);
    
    for (int prev = 1; prev <= queen-1; prev++) {
        //System.out.println("Previous is: " + x[prev]);
        if(x[prev] == row || (abs(x[prev]-row) == abs(prev-queen)) ) {
            return false;
        }
    }
    return true;
}

void nQueens(int queen) {    
    for (int row = 1; row <= boardSize; row++) {
        //Can I place the queen here?
        if(place(queen, row)) {
            x[queen] = row;
            //System.out.println("x[" + queen + "]: " + x[queen]);
            if(queen == boardSize) {
                solutionFound = true;
                printf("%d :", ++lineCounter);
                for (int j = 1; j <= boardSize; j++) {
                    printf(" %d", x[j]);
                }
                printf("\n");
            }
            else {
                nQueens(queen + 1);
            }
        }
    }
}