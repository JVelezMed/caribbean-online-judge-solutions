#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>
#include <stdbool.h>
//#include <ctype.h>

//int quadratic(int a, int b, int c) {
//    return (int)((-b + sqrt(b*b+4*a*c))*0.5);
//}

int main(int argc, const char * argv[]) {
    /* Se construye un alfabeto de acuerdo a la distribucion de teclado */
    char c, keyboard[48] = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";

    while( (c=getchar()) != EOF ){
        /* Se convierte todo excepto por los espacios y caracteres de
         * nueva linea */
        if( c != ' ' && c != '\n' ){
            for(int i = 0; i < 48; i++){
                /* Se muestra por pantalla el caracter anteriror al correspondiente
                 * en el alfalbeto */
                if(keyboard[i] == c){
                    printf("%c", keyboard[i-1]);
                    break;
                }
            }
        }else
            printf("%c", c);
    }
    return 0;
}
