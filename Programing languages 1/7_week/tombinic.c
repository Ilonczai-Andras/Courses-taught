#include <stdio.h>

int main (int argc, char *argv[]) 
{
    int tomb[10] = {0};
    int tomb2[10];

    for (int i = 0; i < 10; i++)
    {
        printf("%d ", tomb2[i]);
    }

    puts("");

    for (int i = 0; i < 10; i++)
    {
        printf("%d ", tomb[i]);
    }
    
    return 0;
}