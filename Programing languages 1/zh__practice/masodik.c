#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

char *swapcase(const char * string)
{
    int hossz = strlen(string) + 1;

    char * result = (char *)malloc(hossz * sizeof(char));

    for (int i = 0; string[i] != '\0'; i++)
    {
        if (islower(string[i]))
        {
            result[i] = toupper(string[i]);
        }
        else if (isupper(string[i]))
        {
            result[i] = tolower(string[i]);
        }
        else
        {
            result[i] = string[i];
        }
        
    }
    result[hossz - 1] = '\0';

    return result;
    
}

int main (int argc, char *argv[]) 
{

    if (argc != 2)
    {
        printf("Hiba! Adj megy egy sztringet!");
        exit(1);
    }

    char * res = swapcase(argv[1]);
    printf("%s", res);
    free(res);
    

    return 0;
}