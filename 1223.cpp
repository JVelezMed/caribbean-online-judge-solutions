#include <iostream>
#include <cstdio>
#include <math.h>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <algorithm>
#include <map>

using namespace std;

typedef pair<string, bool> sb;
typedef map<string, sb> ssb;

int main(void) {
    
    int size;
    scanf("%d", &size);
    
    string fName, sName;
    ssb peopleMap;
    int caseNumber = 1;
    while(size) {
        peopleMap = ssb();
        
        for (int i = 0; i < size; ++i) {
            cin >> fName >> sName;
            peopleMap.insert(make_pair(fName, sb(sName, true)));
        }
        
        string fPerson;
        int loops = 0;
        for (map<string,sb>::iterator it=peopleMap.begin(); it!=peopleMap.end(); ++it) {
            string key = it->first;
            fPerson = key;
            if(peopleMap.find(fPerson)->second.second == true) {
                do {
                    peopleMap.find(key)->second.second = false;
                    key = peopleMap.find(key)->second.first;
                    //printf("%s->", key.c_str());
                } while(peopleMap.find(key)->second.second == true);
                //printf("loop done\n");
                if(fPerson.compare(key) == 0) {
                    loops++;
                }
            }
        }
        
        printf("%d %d\n",caseNumber++, loops);
        
        scanf("%d", &size);
    }
    
    return 0;
}