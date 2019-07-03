#include <algorithm>
#include <cmath>
#include <cstdio>
#include <cstring>
#include <set>
#include <vector>

using namespace std;

int gcd(int a, int b) {
    int temp;
    if (a > b) {
        temp = a;
        a = b;
        b = temp;
    }
    while(b != 0) {
        int rem = a % b;
        a = b;
        b = rem;
    }
    return a;

}

int main() {

    int G, A, gi, gj, ai, aj, rounds;
    int gPoints = 0, aPoints = 0;
    int gAnswer, aAnswer;

    scanf("%d %d", &G, &A);
    scanf("%d", &rounds);

    int gArray[100001];
    gArray[0] = 0;
    int aArray[100001];
    aArray[0] = 0;

    for(int i = 1; i < 100001; ++i) {
            int divisor = gcd(i, G);
            if(divisor == 1) {
                gArray[i] = 1;
            }
            gArray[i] += gArray[i-1];
    }

    for(int i = 1; i < 100001; ++i) {
            int divisor = gcd(i, A);
            if(divisor == 1) {
                    aArray[i] = 1;
            }
            aArray[i] += aArray[i-1];
    }


    while(rounds--) {
        scanf("%d %d %d %d", &gi, &gj, &ai, &aj);
        scanf("%d %d", &aAnswer, &gAnswer);

        int gCoprimes = 0, aCoprimes = 0;



        aPoints += ((gArray[gj]-gArray[gi-1]) == aAnswer) ? 2 : -1;
        gPoints += ((aArray[aj]-aArray[ai-1]) == gAnswer) ? 2 : -1;

    }

    if(gPoints > aPoints) {
        printf("Garfield wins\n");
        }
        else if(aPoints > gPoints) {
            printf("Anders wins\n");
        }
        else {
            printf("Draw\n");
        }

return 0;

}
