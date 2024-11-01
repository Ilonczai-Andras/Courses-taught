#include <stdio.h>

#define SIZE 26

void ascii_lowercae(char abc[])
{   

    for (int i = 97; i < 97 + SIZE; i++)
    {
        abc[i-97] = (char)i;
    }
    
}

int main (int argc, char *argv[]) 
{
    char abc[SIZE];

    ascii_lowercae(abc);

    for (int i = 0; i < SIZE; i++)
    {
        printf("%c", abc[i]);
    }
    return 0;
    
}