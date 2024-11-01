#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#include <string.h>

typedef struct
{
    char nev[20];
    int eletkor;
    char szak[5];
}Hallgato;

void print_hallgato(const Hallgato *h)
{
    printf("nev: %s kor: %d szak: %s\n", h->nev, h->eletkor, h->szak);
}

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

int feltolt(const char* fname, int n, Hallgato tomb[])
{
    FILE *fp = fopen(fname,"r");

    int index = 0;

    if (fp == NULL)
    {
        fprintf(stderr, "Hiba!\n");
        exit(1);
    }

    char sor[100];
    char *p;
    char *nev;
    int kor;
    char *szak;

    while (fgets(sor, 100, fp) != NULL)
    {
        sor[strlen(sor) - 1] = '\0';
        //sor[strcspn(sor, "\n")] = '\0';

        p = strtok(sor, ",");
        nev = p;
        p = strtok(NULL, ",");
        kor = atoi(p);
        p = strtok(NULL, ",");
        szak = p;

        Hallgato h;

        strcpy(h.nev, nev);
        h.eletkor = kor;
        strcpy(h.szak, szak);

        tomb[index] = h;

        index++;
    }
    return index;
}

void lowercase(char text[])
{
    int hossz = strlen(text);

    for (int i = 0; i < hossz; i++)
    {
        text[i] = tolower(text[i]);
    }
    
}

int kiszur_ptisek(int n, Hallgato tomb[n], Hallgato ptisek[])
{
    int index = 0;

    for (int i = 0; i < n; i++)
    {
        Hallgato h = tomb[i];

        lowercase(h.szak);

        if (strcmp(h.szak, "pti") == 0)
        {
            ptisek[index] = tomb[i];
            ++index;
        }
        
    }
    return index;
}

int main (int argc, char *argv[]) 
{
    const char* fname = "nevek.csv";

    Hallgato tomb[100];

    int db = feltolt(fname, 100, tomb);

    for (int i = 0; i < db; i++)
    {
        print_hallgato(&tomb[i]);
    }
    puts("-----------------------");

    Hallgato ptisek[100];
    int ptis_db = kiszur_ptisek(db, tomb, ptisek);

    rendezes_nevenkent(ptis_db, ptisek);

    for (int i = 0; i < ptis_db; i++)
    {
        print_hallgato(&ptisek[i]);
    }
    
    
    return 0;
}