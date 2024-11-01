#include <stdio.h>
#include <string.h>
#include "prog1.h"

int char_count(string s, char c)
{   
    int hossz = strlen(s);
    int sum = 0;

    // s[i] != '\0'
    for (int i = 0; i < hossz; i++)
    {
        if (s[i] == c)
        {
            sum += 1;
        }
        
    }
    return sum;
    
}

int main (int argc, char *argv[]) 
{
    string s = "abbba";
    int res = char_count(s, 'b');
    printf("Ered: %d", res);

    return 0;
}