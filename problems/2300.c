//
//  main.c
//  COJ C Lang
//
//  Created by John Velez on 5/4/13.
//  Copyright (c) 2013 John Velez. All rights reserved.
//

#include <stdio.h>
#include <string.h>

int main(int argc, const char * argv[])
{
    char letters[15];
    scanf("%s", letters);
    int length = strlen(letters);
    int sum = 0;
    int i;
    
    for (i = 0; i < length; i++) {
        switch (letters[i]) {
            case 'A':
            case 'B':
            case 'C':
                sum += 3;
                break;
            
            case 'D':
            case 'E':
            case 'F':
                sum += 4;
                break;
                
            case 'G':
            case 'H':
            case 'I':
                sum += 5;
                break;
                
            case 'J':
            case 'K':
            case 'L':
                sum += 6;
                break;
                
            case 'M':
            case 'N':
            case 'O':
                sum += 7;
                break;
                
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
                sum += 8;
                break;
                
            case 'T':
            case 'U':
            case 'V':
                sum += 9;
                break;
                
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                sum += 10;
                break;
                
            default:
                break;
        }
    }
    printf("%d\n", sum);
    return 0;
}
