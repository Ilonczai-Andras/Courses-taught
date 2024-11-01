#include <stdio.h>
#include <stdlib.h>

int main (int argc, char *argv[]) 
{
    char s[1024];
    fgets(s, sizeof(s), stdin);
    printf("%s", s);

    //
    char *string;
    string = (char * )malloc(sizeof(char) * 1024);
    fgets(string, sizeof(string), stdin);
    printf("%s", string);


    return 0;
}