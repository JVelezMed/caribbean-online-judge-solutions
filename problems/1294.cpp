#include <iostream>
#include <set>
#include <cmath>
#include <cstdlib>
using namespace std;

int main(){
    
    set<long long> seq, difs;
    long long jumpers, j1, j2;
    
    while(cin >> jumpers){
        
        //Create two new sets
        seq.clear();
        difs.clear();
        
        //Read the first integer
        cin >> j1;
        
        //The set to compare with later on
        for(int i = 1; i < jumpers; ++i)
            seq.insert(i);
        
        if(jumpers == 1)
            cout << "Jolly" << endl;
        else {
            j2 = j1;
            for (int i = 1; i < jumpers; ++i) {
                cin >> j1;
                /* conjunto de diferencias */
                difs.insert(abs(j2-j1));
                j2=j1;
            }
            /* igualdad de conjuntos */
            (seq == difs) ? cout << "Jolly" : cout << "Not jolly";
            cout << endl;
            
        }
    }
}