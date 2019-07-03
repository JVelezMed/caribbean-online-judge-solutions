#include <iostream>
#include <cstdio>
#include <math.h>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <algorithm>
#include <vector>

using namespace std;

int main(void) {

    int a, b;
    vector<int> list;
    
    scanf("%d %d", &a, &b);
    
    while (a && b) {
        list = vector<int>();
        printf("%d/%d=", a, b);
        do {
            list.push_back(a/b);
            a -= a/b*b;
            a = a + b - (b=a);
        } while(b != 0);
        
        //OK
        
        bool first = true;
        for (vector<int>::iterator num = list.begin(); num != list.end(); ++num) {
            if(first) {
                if(num == list.end()-1) {
                    printf("[%d,1]", *num-1);
                }
                else {
                    printf("[%d", *num);
                }
                first = false;
            }
            else {
                if(num == list.end()-1) {
                    printf(",%d,1]", *num-1);
                }
                else {
                    printf(",%d", *num);
                }
            }
        }
        printf("\n");
        scanf("%d %d", &a, &b);
    }
    
    return 0;
}