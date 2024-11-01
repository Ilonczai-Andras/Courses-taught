#include <stdio.h>
#include <stdlib.h>

int main (int argc, char *argv[]) 
{
    FILE *pt = fopen("test.txt", "r");

    char sor[100];
    int db = 0;

    if (pt != NULL)
    {
        while (fgets(sor, 100, pt) != NULL)
        {
            db++;
            printf("%s", sor);
        }
        
    }
    else
    {
        printf("Nem nyithato meg a file");
    }
    fclose(pt);

    printf("\nA sorok szama: %d\n", db);
    
    return 0;
}