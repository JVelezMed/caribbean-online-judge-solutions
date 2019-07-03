#include <iostream>
#include <vector>
#include <cstdio>
#include <algorithm>
#include <set>
using namespace std;

int main(){
    int cases;
    set<int> alreadySeen;
    
    scanf("%d", &cases);
    
    while(cases-- > 0) {
        //Clear the set
        alreadySeen.clear();
        
        int numbers;
        scanf("%d", &numbers);
        
        int num;
        bool atLeastOneRepeated = false;
        for (int i = 0; i < numbers; ++i) {
            scanf("%d", &num);
            
            //Not foung means new number
            if(alreadySeen.find(num) == alreadySeen.end()) {
                //printf("NEW!\n");
                alreadySeen.insert(num);
            }
            else {
                atLeastOneRepeated = true;
                printf("%d\n", num);
            }
        }
        if(atLeastOneRepeated == false) {
            printf("Not found!\n");
        }
    }
}