#include <algorithm>
#include <cmath>
#include <cstdio>
#include <cstring>
#include <set>
#include <vector>
#include <queue>

using namespace std;
vector<int> numsArray;
vector<int> sortedArray;
vector<bool> usedNums;
priority_queue<int> cycleSums;

int sum;

int findNum(int num);
void cycle(int i);

int main() {

    int cases, num;
    scanf("%d", &cases);
    while(cases--) {
        sum = 0;

        //Read the size of the list
        scanf("%d", &num);

        numsArray = vector<int>(num);   //To store the numbers
        sortedArray = vector<int>(num); //To store the sorted array
        usedNums = vector<bool>(num);   //To flag the places I've traveled to
        fill(usedNums.begin(), usedNums.end(), false);
        cycleSums = priority_queue<int>();

        int temp;
        int i;
        for (i = 0; i < num; ++i) {
            scanf("%d", &temp);
            numsArray[i] = temp;
            sortedArray[i] = temp;
        }
        //Sort the array
        sort(sortedArray.begin(), sortedArray.end());

        //Begin number changing method
        for (int i = 0; i < num; i++) {
            cycle(i);
        }
        
        int C = 1;
        while(cycleSums.size()) {
            sum += cycleSums.top()*C++;
            cycleSums.pop();
        }
        
        printf("%d\n", sum);

    }

    return 0;

}

int findNum(int num) {
    int index = -1;
    int first = 0, last = num - 1, mid;
    bool found = false;

    //Find where the number goes in the sorted array
    while(first <= last && !found) {
        mid = (first + last) / 2;
        if(num == sortedArray[mid]) {
            found = true;
            index = mid;
        }
        else if(sortedArray[mid] > num) {
            last = mid - 1;
        }
        else {
            first = mid + 1;
        }
    }
    return index;
}

void cycle(int i) {
    //Check that the number has not been used
    if(usedNums[i] == false) {

        //Find where the number is supposed to go
        int index = findNum(numsArray[i]);
        int cycleSum = 0;
        while(usedNums[index] == false) {
            cycleSum += i < index ? index-i: i-index;
            usedNums[index] = true;
            i = index;
            index = findNum(numsArray[index]);
        }
        
        if(cycleSum > 0) {
            cycleSums.push(cycleSum);
        }
    }
}