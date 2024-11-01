#include <stdio.h>
#include <string.h>
#include "prog1.h"
#include <ctype.h>

int main (int argc, char *argv[]) 
{
    string s = "hello";

    char res[20];

    for (int i = 0; s[i] != '\0'; i++)
    {
        if (!isupper(s[i]))
        {
            //printf("%c", toupper(s[i]) );
            res[i] = toupper(s[i]);
        }
        
    }
    res[strlen(s)] = '\0';
    printf("%s", );
    

    return 0;
}