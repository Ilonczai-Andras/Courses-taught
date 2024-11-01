#include <stdio.h>
#include <string.h>
#include "prog1.h"

int rfind_char(string s, char c)
{   
    int hossz = strlen(s);

    for (int i = hossz - 1; i >= 0; i--)
    {
        if (s[i] == c)
        {
            return i;
        }
        
    }
    return -1;
    
}

int main (int argc, char *argv[]) 
{   
    string s  = "abrakadabra";
    printf("%d\n", strlen(s));
    int res = rfind_char(s, 'a');
    printf("%d\n",res);

    return 0;
}