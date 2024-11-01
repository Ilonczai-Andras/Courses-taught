#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main (int argc, char *argv[]) 
{   
    char sor[100];
    float szam = 0;

    int db = 0;


    FILE *pt = fopen("in.txt", "r");
    FILE *p = fopen("out.txt", "w");

    if (pt == NULL)
    {
        printf("A file-t nem lehet megnyitni\n");
        exit(3);
    }
    else
    {   
        printf("in.txt sikeresen megynitva\n");
        printf("0.5-nel nagyobb szamok szurese\n");
        while (fgets(sor, 100, pt) != NULL)
        {
            sor[strlen(sor) - 1 ] = '\0';
            szam = atof(sor);

            if (szam > 0.5)
            {
                fprintf(p, "%f\n", szam);
                db++;
            }
        
        }
    }
    printf("szures vege\n");
    fclose(pt);
    fclose(p);
    printf("out.txt bezarva\n");
    printf("out.txt be kiirt szamok mennyisege: %d\n", db);
    
    return 0;
}