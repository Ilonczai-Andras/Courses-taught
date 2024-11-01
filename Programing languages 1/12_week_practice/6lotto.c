#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void swap(int *p1, int *p2)
{
    int tmp = *p1;
    *p1 = *p2;
    *p2 = tmp;
}

void rendez(int n, int tomb[])
{
    for (int i = 0; i < n - 1; i++)
    {
        for (int j = i + 1; j <  n; j++)
        {
            if (tomb[j] < tomb[i])
            {   
                swap(&tomb[j], &tomb[i]);
            }
            
        }
        
    }
    
}

int tomben_ket_ugynaolyan_elem(int n, int tomb[])
{
    for (int i = 0; i < n; i++)
    {
        int szam = tomb[i];

        for (int j = i + 1; j < n; j++)
        {
            if (szam == tomb[j])
            {
                return 1;
            }
            
        }
        
    }
    return 0;
}

int main (int argc, char *argv[]) 
{
    srand(time(NULL));
    int szamok[6];
    int meret = 6;

    int x1,x2,x3,x4,x5,x6;

    int osszeg = 0;
    int szorzat = 1;
    //2 5 9 15 18 41 
    while (1)
    {
        x1 = (rand( ) % 45 ) +1;
        x2 = (rand( ) % 45 ) +1;
        x3 = (rand( ) % 45 ) +1;
        x4 = (rand( ) % 45 ) +1;
        x5 = (rand( ) % 45 ) +1;
        x6 = (rand( ) % 45 ) +1;

        osszeg = x1+x2+x3+x4+x5+x6;
        szorzat = x1*x2*x3*x4*x5*x6;

        szamok[0] = x1;
        szamok[1] = x2;
        szamok[2] = x3;
        szamok[3] = x4;
        szamok[4] = x5;
        szamok[5] = x6;

        if (osszeg == 90 && szorzat == 996300 && tomben_ket_ugynaolyan_elem(meret, szamok) == 0)
        {
            break;
        }
        
    }

    rendez(meret, szamok);

    for (int i = 0; i < meret; i++)
    {
        printf("%d ", szamok[i]);
    }
    

    return 0;
}