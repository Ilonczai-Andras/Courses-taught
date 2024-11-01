#include <stdio.h>
#include <string.h>
#include "prog1.h"

int main (int argc, char *argv[]) 
{   
    string array[2] = {"Hello", "World!"};
    int size = sizeof(array)/sizeof(string);

    for (int i = 0; i < size; i++)
    {
        printf("%s\n", array[i]);
    }

    string array2[5];

    for (int i = 0; i < 5; i++)
    {
        string s = get_string("Adj meg egy szot ");
        array2[i] = s;
    }

    for (int i = 0; i < 5; i++)
    {
        printf("%s\n", array2[i]);
    }
    
    
    
    return 0;
}