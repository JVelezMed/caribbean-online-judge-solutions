#include <iostream>
#include <algorithm>
#include <cmath>
#include <cstdio>
#include <cstring>
#include <set>
#include <vector>
#include <queue>

using namespace std;

typedef pair<int, int> ii;
typedef vector<ii> vii;

int main() {

    string line;
    vii positions = vii();
    
    for (int row = 0; row < 8; ++row) {
        cin >> line;
        for (int col = 0; col < 8; ++col) {
            if(line.at(col) == '*') {
                positions.push_back(ii(row, col));
            }
        }
    }
    
    bool valid = true;
    
    if(positions.size() == 8) {
        for (int i = 0 ; i < positions.size()-1 && valid; ++i) {
            for (int j = i+1; j < positions.size() && valid; ++j) {
                if(abs(positions[i].first-positions[j].first) ==
                   abs(positions[i].second-positions[j].second) ||
                   positions[i].first == positions[j].first ||
                   positions[i].second == positions[j].second) {
                    valid = false;
                }
            }
        }
        
        printf("%s\n", valid ? "valid" : "invalid");
    }
    else {
        printf("invalid\n");
    }
    
    return 0;
}