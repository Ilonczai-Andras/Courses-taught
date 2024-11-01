#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main (int argc, char *argv[]) 
{
    FILE *file = fopen("mozik.csv", "r");

    if (file == NULL)
    {
        printf("Nem sikerult megynitni a file-t!");
        exit(1);
    }

    char sor[256];
    int count = 0;

    while (fgets(sor, sizeof(sor), file))
    {
        char * rating = strtok(sor, ";");
        char * title = strtok(NULL, ";");
        int szavazat = atoi(strtok(NULL, ";"));

        if (szavazat >= 500000)
        {
            printf("%s %s %d\n", rating, title, szavazat);
        }
    }

    fclose(file);

    return 0;
}