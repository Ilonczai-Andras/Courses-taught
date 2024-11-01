#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void shuffle(int n, int tomb[])
{
    srand(time(NULL));

    int Max = n - 1;
    int Min = 0;

    int uj_szamok[n];

    for (int i = 0; i < n; i++)
    {
        uj_szamok[i] = 0;
    }
    

    for (int i = 0; i < n; i++)
    {
        int szam = rand() % ((Max + 1) - Min) + Min;
        
        if (uj_szamok[szam] == 0)
        {
            uj_szamok[szam] = tomb[i];
        }
        else
        {
            while (uj_szamok[szam] != 0)
            {
                szam = rand() % ((Max + 1) - Min) + Min;
            }
            uj_szamok[szam] = tomb[i];
            
        }
        
    }

    for (int i = 0; i < n; i++)
    {
        printf("%d ", uj_szamok[i]);
    }
    
    
}

int main (int argc, char *argv[]) 
{   
    int n = 5;
    int tomb[] = {3, 4, 5, 1, 2};

    shuffle(5,tomb);

    return 0;
}