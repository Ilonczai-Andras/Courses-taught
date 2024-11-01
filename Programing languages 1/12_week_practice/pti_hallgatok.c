#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <ctype.h>

typedef struct 
{
    char nev[10];
    int age;
    char szak[5];
}Hallgato;

void rendezes_nevenkent(int n, Hallgato tomb[]) {
    Hallgato temp;
    for (int i = 0; i < n - 1; i++) 
    {
        for (int j = i + 1; j < n; j++) 
        {
            if (strcmp(tomb[j].nev, tomb[i].nev) < 0) 
            {
                temp = tomb[i];
                tomb[i] = tomb[j];
                tomb[j] = temp;
            }
        }
    }
}

void kiir_hallagto(Hallgato tomb[], int n)
{
    for (size_t i = 0; i < n; i++)
    {
        printf("%s %d %s\n", tomb[i].nev, tomb[i].age, tomb[i].szak);
    }
    
}
void lowercase(char text[])
{
    int hossz = strlen(text);

    for (int i = 0; i < hossz; i++)
    {
        text[i] = tolower(text[i]);
    }
    
}


int main (int argc, char *argv[]) 
{
    FILE *fp = fopen("nevek.csv", "r");

    Hallgato h[6];
    int index = 0;

    if (fp == NULL)
    {
        printf("Nem sikerult megnyitni a file-t!\n");
        exit(1);
    }

    char sor[100];
    char *nev;
    int age;
    char *szak;

    char *p;

    while (fgets(sor, sizeof(sor), fp) != NULL)
    {
        sor[strlen(sor) - 1] = '\0';
        //printf("%s\n", sor);

        p = strtok(sor,",");
        nev = p;
        strcpy(h[index].nev, nev);


        p = strtok(NULL, ",");
        age = atoi(p);
        h[index].age = age;

        p = strtok(NULL, ",");
        szak = p;
        strcpy(h[index].szak, szak);

        index++;
    }
    rendezes_nevenkent(6, h);
    //kiir_hallagto(h, 6);
    puts("-------------------");

    for (int i = 0; i < 6; i++)
    {   
        Hallgato ha = h[i];
        lowercase(ha.szak);

        if (strcmp(ha.szak, "pti" ) == 0)
        {
            printf("A pti hallgató neve: %s\n", ha.nev);
        }
        
    }
    

    fclose(fp);

    return 0;
}