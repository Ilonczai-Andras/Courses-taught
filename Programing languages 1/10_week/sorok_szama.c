#include <stdio.h>
#include <stdlib.h>

int main (int argc, char *argv[]) 
{
    FILE *pt = fopen("in.txt", "r");

    char sor[100];
    int db = 0;

    if (pt != NULL)
    {
        while (fgets(sor, 100, pt) != NULL)
        {
            db++;
        }
        
    }
    else
    {
        printf("Nem nyithato meg a file");
    }
    fclose(pt);

    printf("A sorok szama: %d", db);
    
    return 0;
}