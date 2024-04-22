#include <stdio.h>
#define LEN_INPUT 10

int main(void) {
    char s1[LEN_INPUT];
    scanf("%s", s1);
    
    for(int i = 0; i < strlen(s1); i++){
        if('A' <= s1[i] && s1[i] <= 'Z'){
            printf("%c", tolower(s1[i]));
        } else{
            printf("%c", toupper(s1[i]));
        }
    }

    return 0;
}
