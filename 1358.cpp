
#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

typedef struct {
    string name;
    int money;
} st;

bool s(const st& s1, const st& s2){
    if(s1.money > s2.money) {
        return true;
    }
    else {
        return false;
    }
}

int main(){
    int N, x, y, z;
    st students[100];
    
    cin >> N;
    while(N != -1){
        
        for(int i = 0; i < N; i++){
            cin >> students[i].name >> x >> y >> z;
            students[i].money = x*5 + y*10 + z*20;
        }
        
        //Ordernar de mayor a menor
        sort(students, students + N, &s);
        
        //Si el primero y el ultimo son iguales, todos tienen la
        //misma cantidad de dinero.
        if(students[0].money == students[N-1].money) {
            cout << "All have the same amount." << endl;
        }
        else {
            cout << students[0].name << " has most, " << students[N-1].name << " has least money." << endl;
        }
        
        cin >> N;
        
    }
}