#include <stdio.h>
#include <string.h>
#include "prog1.h"
#include <ctype.h>

int main (int argc, char *argv[]) 
{
    string s = "Hell12@";

    for (int i = 0; s[i] != '\0'; i++)
    {   
        char c = s[i];

        if (islower(c))
        {
            printf("%c kisbetu\n", c);
        }
        else if (isupper(c))
        {
            printf("%c nagybetu\n", c);
        }
        else if (isdigit(c))
        {
            printf("%c szam\n", c);
        }
        else
        {
            printf("%c speciális karakter\n", c);
        }        
    }
    

    return 0;
}