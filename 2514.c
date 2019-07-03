#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>


int main(int argc, const char * argv[])
{
    char name[100];
    int players;
    scanf("%s %d", name, &players);
    int ra, k;
    double w, we;
    
    double sumR = 0.0;
    
    char allPlayers[players][100];
    double scores[players];
    
    for (int i = 0; i < players; ++i) {
        //read
        scanf("%s %d %lf %lf %d", &allPlayers[i][0], &ra, &w, &we, &k);
        scores[i] = ra + k*(w - we);
        //calculate
        sumR += ra;
    }
    
    
    printf("Tournament: %s\n", name);
    printf("Number of players: %d\n", players);
    printf("New ratings:\n");
    for (int i = 0; i < players; ++i) {
        printf("%s %.0lf\n", allPlayers[i], scores[i]);
    }
    printf("Media Elo: %.0lf\n", sumR/players);
    
    return 0;
}