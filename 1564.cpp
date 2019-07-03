#include <iostream>
#include <cstdio>
#include <math.h>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>

using namespace std;

int main(void) {
    
    string name;
    char gender;
    double initial, final;
    
    int people;
    scanf("%d", &people);
    
    string mLoser, fLoser;
    double mWeight, fWeight;
    
    mWeight = fWeight = -10000.00;
    while(people != 0) {
        
        while(people--) {
            cin >> name >> gender >> initial >> final;
            
            if(gender == 'M') {
                if((initial - final)/initial > mWeight) {
                    mLoser = name;
                    mWeight = (initial - final)/initial;
                }
            }
            else {
                if((initial - final)/initial > fWeight) {
                    fLoser = name;
                    fWeight = (initial - final)/initial;
                }
            }
        }
        
        printf("%s %.2lf%% %s %.2lf%%\n", mLoser.c_str(), mWeight*100, fLoser.c_str(), fWeight*100);
        
        scanf("%d", &people);
        mWeight = fWeight = -10000.00;
    }
    
    
    return 0;
}