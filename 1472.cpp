#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

int main(){
    int T;
    short seq[4] = {7, 2, 3, 5};
    unsigned long long N;
    string lucky;
    cin >> T;
    
    while(T>0){
        cin >> N;
        lucky.clear();
        while(N>0){
            lucky.push_back('0' + seq[N%4]);
            if(N%4==0) N--;
            N = N/4;
        }
        reverse(lucky.begin(), lucky.end());
        cout << lucky << endl;
        T--;
    }
}