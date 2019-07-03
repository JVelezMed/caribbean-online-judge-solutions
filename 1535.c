#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <stdbool.h>

int main(int argc, const char * argv[]) {
    
    int cases;
    scanf("%d", &cases);
    
    printf("Lumberjacks:\n");
    for (int i = 0; i < cases; ++i) {
        int length[10];
        for (int j = 0; j < 10; ++j) {
            scanf("%d", &length[j]);
        }
        
        int ascCount = 1;
        for (int j = 0; j < 9 && length[j] < length[j+1]; ++j) {
            ++ascCount;
        }
        
        int descCount = 1;
        for (int j = 0; j < 9 && length[j] > length[j+1]; ++j) {
            ++descCount;
        }
        
        printf("%s\n", (ascCount == 10 || descCount == 10) ? "Ordered" : "Unordered");
    }
    
    return 0;
}