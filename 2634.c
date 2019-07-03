#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>
#include <stdbool.h>

int main(int argc, const char * argv[]) {
    
    int employees;
    scanf("%d", &employees);
    
    int months[12];
    for (int i = 0; i < 12; ++i) {
        months[i] = 0;
    }
    
    while(employees-- > 0) {
        int num, day, month, year;
        scanf("%d %d/%d/%d", &num, &day, &month, &year);
        months[month-1] += 1;
    }
    
    for (int i = 0; i < 12; ++i) {
        printf("%d %d\n", i+1, months[i]);
    }
    return 0;
}