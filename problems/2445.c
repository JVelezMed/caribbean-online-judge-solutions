#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>
#include <stdbool.h>
#include <ctype.h>

int main(int argc, const char * argv[])
{
    char word[10000];
    scanf("%s", word);
    
    int charactersEaten, mostCharactersEaten = -1;
    char mostCannibalCharacter = ' ';
    
    //printf("%d %d\n", 'A', 'Z');
    
    int length = (int)strlen(word);
    for (int i = 0; i < length - 1; ++i) {
        charactersEaten = 0;
        
        //Will check all letters after the curent one
        
        //Capital letter
        bool done = false;
        if(word[i] >= 'A' && word[i] <= 'Z') {
            for (int j = i+1; j < length && !done; ++j) {
                //If te letter is lowercase
                if((word[j] >= 'a' && word[j] <= 'z') || (word[j] <= word[i])) {
                    ++charactersEaten;
                    //printf("%c eats %c\n", word[i], word[j]);
                }
               else
                   done = true;
            }
        }
        else if(word[i] >= 'a' && word[i] <= 'z') {
            for (int j = i+1; (word[j] > 90 && (word[i] >= word[j])) && j < length; ++j) {
                //printf("%c eats %c\n", word[i], word[j]);
                ++charactersEaten;
            }
        }
        //printf("Characters eaten by %c: %d\n", word[i], charactersEaten);
        
        //Check whos the most cannibal
        if(mostCharactersEaten == -1) {
            mostCannibalCharacter = word[i];
            mostCharactersEaten = charactersEaten;
        }
        else if(charactersEaten == mostCharactersEaten) {
            //Uppercase letter vs Uppercase
            if(word[i] >= 65 && word[i] <= 90 && word[i] > mostCannibalCharacter) {
                mostCannibalCharacter = word[i];
                mostCharactersEaten = charactersEaten;
            }
            //Uppercase beats lowercase
            else if(word[i] >= 65 && word[i] <= 90 && mostCannibalCharacter > 90) {
                mostCannibalCharacter = word[i];
                mostCharactersEaten = charactersEaten;
            }
            //Lowercase
            else if(word[i] > 90 && word[i] > mostCannibalCharacter)
            {
                mostCannibalCharacter = word[i];
                mostCharactersEaten = charactersEaten;
            }
        }
        else if(charactersEaten > mostCharactersEaten){
            mostCannibalCharacter = word[i];
            mostCharactersEaten = charactersEaten;
        }
    }
    printf("%c\n", mostCannibalCharacter);
    return 0;
}