#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>

int main(int argc, const char * argv[])
{
    int cases;
    
    //Read the first digit
    scanf("%d", &cases);
    int godzillaArmySize, mechagodzillaArmySize;
    int strGodzilla, strMechGodzilla;
    while(getchar() != '\n');
    
    for (int i = 0; i < cases; ++i) {
        getchar();
        scanf("%d %d", &godzillaArmySize, &mechagodzillaArmySize);
        
        if(godzillaArmySize == 0)
            getchar();
        else {
            scanf("%d", &strGodzilla);
            int number;
            for (int j = 2; j <= godzillaArmySize; ++j) {
                scanf("%d", &number);
                if(number > strGodzilla)
                    strGodzilla = number;
            }
        }
        
        while(getchar() != '\n');
                    
        if(mechagodzillaArmySize == 0) {
            getchar();
        }
        else {
            scanf("%d", &strMechGodzilla);
            int number;
            for (int j = 2; j <= mechagodzillaArmySize; ++j) {
                scanf("%d", &number);
                if(number > strMechGodzilla)
                    strMechGodzilla = number;
            }
        }
        
        //One of them does not have an army
        if(godzillaArmySize == 0 && mechagodzillaArmySize > 0)
            printf("MechaGodzilla\n");
        else if(godzillaArmySize > 0 && mechagodzillaArmySize == 0)
            printf("Godzilla\n");
        else {
            //Both have an army. Godzilla wins with >= strength monsters.
            //Else mechaGodzilla wins
            if(strGodzilla >= strMechGodzilla)
                 printf("Godzilla\n");
            else
                printf("MechaGodzilla\n");
        }

            
    }
    
    return 0;
}