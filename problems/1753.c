#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>
#include <stdbool.h>
#include <ctype.h>

int main(int argc, const char * argv[])
{
    int cases;
    
    //Read the first digit
    scanf("%d", &cases);
    
    char letters[20];
    for (int i = 0; i < cases; ++i) {
        scanf("%s", letters);
        
        unsigned long length = strlen(letters);
        int middle = ceil(length/2.0)-1;
        //printf("Middle: %d\n", middle);
        
        //The table for the numbers
        int searchTable[26] = {2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,9,9,9,9};
        
        bool isPalindrome = true;
        for (int j = 0; j <= middle ; ++j) {
            if(searchTable[toupper(letters[j]) - 'A'] !=
               searchTable[toupper(letters[length - j - 1]) - 'A']) {
                isPalindrome =false;
                break;
            }
        }
        printf("%s\n", isPalindrome ? "YES" : "NO");
    }
    return 0;
}