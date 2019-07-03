#include <algorithm>
#include <cmath>
#include <cstdio>
#include <cstring>
#include <set>
#include <vector>
#include <queue>

using namespace std;


int main() {

    int a, b, c, d;
    int numerator1, denominator1, numerator2, denominator2;
    
    scanf("%d %d %d %d", &a, &b, &c, &d);
    numerator1 = ((b*(b+1)-a*(a-1))/2)*((d-c+1)) + ((d*(d+1)-c*(c-1))/2)*((b-a+1));
    denominator1 = (b-a+1)*(d-c+1);
    
    scanf("%d %d %d %d", &a, &b, &c, &d);
    numerator2 = ((b*(b+1)-a*(a-1))/2)*((d-c+1)) + ((d*(d+1)-c*(c-1))/2)*((b-a+1));
    denominator2 = (b-a+1)*(d-c+1);
    
    if(numerator1*denominator2 < numerator2*denominator1) {
        printf("Emma\n");
    }
    else if(numerator1*denominator2 > numerator2*denominator1) {
        printf("Gunnar\n");
    }
    else {
        printf("Tie\n");
    }
    
    return 0;
}