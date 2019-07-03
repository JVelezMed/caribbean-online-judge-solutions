#include <algorithm>
#include <cmath>
#include <cstdio>
#include <cstring>
#include <set>
#include <vector>

using namespace std;
std::vector<int> numsArray;
std::vector<int> sortedArray;
std::set<int> affectedNums;
int num;

void change(int i);

int main() {

    int cases;
    scanf("%d", &cases);
    while(cases--) {

        scanf("%d", &num);

        numsArray = vector<int>(num);
        sortedArray = vector<int>(num);;
        affectedNums = set<int>();

        int temp;
        int i;
        for (i = 0; i < num; ++i) {
            scanf("%d", &temp);
            numsArray[i] = temp;
            sortedArray[i] = temp;
        }
        std::sort(sortedArray.begin(), sortedArray.begin() + num);

        for (int i = 0; i < num; i++) {
			change(i);
		}

        printf("%d\n", affectedNums.size());

    }

return 0;

}

void change(int i) {
    int index;
    int first = 0, last = num - 1, mid;
    bool found = false;
    while(first <= last && !found) {
        mid = (first + last) / 2;
        if(numsArray[i] == sortedArray[mid]) {
            found = true;
            index = mid;
        }
        else if(sortedArray[mid] > numsArray[i]) {
            last = mid - 1;
        }
        else {
            first = mid + 1;
        }
    }
    if(i != index) {
        affectedNums.insert(numsArray[i]);
        affectedNums.insert(numsArray[index]);
        int temp = numsArray[index];
        numsArray[index] = numsArray[i];
        numsArray[i] = temp;
        change(index);
    }
}
