#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>

int main(int argc, const char * argv[]) {
    
    //The number of questions in the test
	int size;
    scanf("%d", &size);
    
    //La clave
    char questions[size];
    scanf("%s", questions);
    
    //The number of students
    int cases;
    scanf("%d", &cases);
    
    double studentScore;
    for (int i = 0; i < cases; ++i) {
        //No score for now
        studentScore = 0.0;
        
        //Read the students answers
        char studentAnswers[size];
        scanf("%s", studentAnswers);
        for (int j = 0; j < size; ++j) {
            if(studentAnswers[j] == questions[j]) {
                ++studentScore;
            }
            else if(studentAnswers[j] != '#') {
                studentScore -= 0.25;
            }
        }
        printf("%.2f\n", studentScore);
    }
    return 0;
}