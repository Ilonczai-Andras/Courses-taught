#include <stdio.h>
#include <string.h>
#include <ctype.h>
#include <stdlib.h>

char * capitalize(const char *string)
{
    int hossz = strlen(string) + 1;

    char *result = (char*)malloc(hossz * sizeof(char));
    

    for (int i = 0; string[i] != '\0'; i++)
    {
        if (i == 0)
        {
            result[0] = toupper(string[0]);
        }
        else
        {
            result[i] = tolower(string[i]);
        }
    }
    result[hossz - 1] = '\0';
    return result;
}

int main (int argc, char *argv[]) 
{

    char *string = "heLlO woRlD!";
    printf("String: %s\n", string);

    printf("String: %s\n", capitalize(string));
    return 0;
}