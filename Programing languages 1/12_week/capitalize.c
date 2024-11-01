#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <ctype.h>

char * capitalize(const char * szoveg)
{
    int hossz = strlen(szoveg) + 1;

    char * result = (char*)malloc(hossz * sizeof(char));


    for (int i = 0; i < hossz; i++)
    {
        if (i == 0)
        {
            result[i] = toupper(szoveg[i]);
        }
        else
        {
            result[i] = tolower(szoveg[i]);
        }
        
    }
    result[hossz - 1] = '\0';
    return result;
    
}

int main (int argc, char *argv[]) 
{
    char *string = "helLo WorlD!";
    printf("String: %s %d\n", string, strlen(string));
    printf("String: %s %d\n", capitalize(string), strlen(capitalize(string)));

    return 0;
}