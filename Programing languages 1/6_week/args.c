#include <stdio.h>
#include <string.h>
#include "prog1.h"

void udvozol(string s)
{
    if (strcmp(s, "Batman") == 0 || strcmp(s, "Robin") == 0) 
    {
        printf("Denevérveszély");
    }
    
}

int main (int argc, char *argv[]) 
{   

    string s = get_string("Neved: ");
    udvozol(s);
    return 0;
}