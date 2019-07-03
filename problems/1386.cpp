
#include <iostream>
#include <string>
#include <algorithm>
#include <vector>

using namespace std;

int main(){
    vector<int> factors1, factors2;

    int num1, num2;
    
    //Read the two numbers
    cin >> num1 >> num2;
    
    for (int i = 1; i <= num1; ++i) {
        if(num1 % i == 0) {
            factors1.push_back(i);
        }
    }
    
    for (int i = 1; i <= num2; ++i) {
        if(num2 % i == 0) {
            factors2.push_back(i);
        }
    }
    
    for (int i = 0; i < factors1.size(); ++i) {
        for (int j = 0; j < factors2.size(); ++j) {
            cout << factors1[i] << " " << factors2[j] << endl;
        }
    }
}