#include <cmath>
#include <cstdio>
#include <cstring>
#include <algorithm>

int main(){
    int col, L, i, j;
    char s[201], c;
    while(true){
        scanf("%d\n", &col);
        if(!col) break;
        
        i=0;
        while((c=getchar()) != '\n'){
            if(c!=' '){
                s[i]=c;
                i++;
            }
        }
        s[i]='\0';
        L=ceil(strlen(s)/col);
        
        for(i=col;i<strlen(s);i+=2*col)
            std::reverse(s+i, s+i+col);
        
        for(i=0;i<col;i++){
            for(j=0;j<L;j++){
                printf("%c", s[(col*j)+i]);
            }
        }
        printf("\n");
    }
}