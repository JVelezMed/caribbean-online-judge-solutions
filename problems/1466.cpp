#include <iostream>
#include <cstdio>
#include <cstring>
#include <math.h>
#include <stdlib.h>
#include <algorithm>
#include <map>

using namespace std;

int main (void) {
    
    int a, b;
    scanf("%d %d", &a, &b);
    
    int winner = 0; //1=Vasha, -1=Golek
    while(winner == 0) {
        //Vasha's turn
        if(winner == 0) {
            //200(100x2) + 20(10x2)
            if(a >= 2 && b >= 2) {
                a -= 2;
                b -= 2;
            }
            //100(100x2) + 120(10x12)
            else if(a >= 1 && b >= 12) {
                a -= 1;
                b -= 12;
            }
            //220(10x22)
            else if(b >= 22) {
                b -= 22;
            }
            else {
                winner = -1;
            }
        }
        
        //Goleks turn.
        if(winner == 0) {
            //220(10x22)
            if(b >= 22) {
                b -= 22;
            }
            //100(100x2) + 120(10x12)
            else if(a >= 1 && b >= 12) {
                a -= 1;
                b -= 12;
            }
            //200(100x2) + 20(10x2)
            else if(a >= 2 && b >= 2) {
                a -= 2;
                b -= 2;
            }
            else {
                winner = 1;
            }
        }
    }
    
    printf("%s\n", winner == 1 ? "Vasha" : "Golek");
    return 0;
}