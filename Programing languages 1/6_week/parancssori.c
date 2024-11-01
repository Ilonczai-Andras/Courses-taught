#include <stdio.h>
#include <string.h>
#include "prog1.h"

void udvozol(string s)
{
    if (strcmp(s, "Batman") == 0 || strcmp(s, "Robin") == 0) 
    {
        printf("Denevérveszély\n");
    }
    else
    {
        printf("%s\n", s);
    }
    
}

int main (int argc, char *argv[]) 
{   

    string s = argv[1];
    udvozol(s);
    return 0;
}