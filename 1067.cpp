#include <iostream>
#include <string>
using namespace std;

int main(){
        int current, upper=11, bottom=0;
        string p1, p2;
        while(1){
                cin >> current;
                if(!current) break;
                cin >> p1 >> p2;
                if(p2 == "high"){
                        if(upper > current)
                                upper = current;
                }else if(p2 == "low"){
                        if(bottom < current)
                                bottom = current;
                }else if(p2 == "on"){
                        if(current >= upper || current <= bottom)
                                cout << "Stan is dishonest";
                        else
                                cout << "Stan may be honest";
                        cout << endl;
                        upper=11;
                        bottom=0;
                }
        }
}