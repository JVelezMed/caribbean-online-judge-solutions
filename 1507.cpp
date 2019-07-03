#include <iostream>
#include <cstdio>
#include <cstring>
#include <math.h>
#include <stdlib.h>
#include <algorithm>
#include <string>

using namespace std;

struct card {
    char face;
    char suit;
};

bool firstCard(card first, card second);
int faceValue(card theCard);
int suitValue(card theCard);

bool firstCard(card first, card second) {
    //printf("%c %c\n", first.face, second.face);
    if(faceValue(first) < faceValue(second)) {
        return true;
    }
    else if(faceValue(first) == faceValue(second)) {
        if (suitValue(first) < suitValue(second)) {
            return true;
        }
        else {
            return false;
        }
    }
    else {
        return false;
    }
}

int faceValue(card theCard) {
    switch (theCard.face) {
        case 'A':
            return 1;
        case 'T':
            return 10;
        case 'J':
            return 11;
        case 'Q':
            return 12;
        case 'K':
            return 13;
        default:
            return theCard.face - '0';
            break;
    }
}

int suitValue(card theCard) {
    switch (theCard.suit) {
        case 'S':
            return 1;
        case 'H':
            return 2;
        case 'C':
            return 3;
        case 'D':
            return 4;
        default:
            return -1;
    }
}

int main (void) {
    
    int cases;
    scanf("%d", &cases);
    
    int size;
    while(cases--) {
        scanf("%d", &size);
        
        card *cards = new card[size];
        
        for (int i = 0; i < size; ++i) {
            char *temp = new char[2];
            scanf("%s", temp);
            
            card aCard;
            aCard.face = temp[0];
            aCard.suit = temp[1];
            cards[i] = aCard;
        }
        
        sort(cards, cards + size, firstCard);
        
        for (int i = 0; i < size; ++i) {
            if(i == 0) {
                printf("%c%c", cards[i].face, cards[i].suit);
            }
            else {
                printf(" %c%c", cards[i].face, cards[i].suit);
            }
        }
        printf("\n");
        
    }
    return 0;
}