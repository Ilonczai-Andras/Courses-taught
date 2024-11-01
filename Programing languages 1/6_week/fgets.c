#include <stdio.h>
#include <string.h>

#define SIZE 200

int main (int argc, char *argv[]) 
{
    char text[SIZE];
    fgets(text, SIZE, stdin);
    text[strlen(text) - 1] ='\0';
    printf("\"%s\"", text);

    return 0;
}