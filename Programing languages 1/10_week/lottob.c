#include <stdio.h>
#include <stdlib.h>
void bubble_sort(int a[], int n) 
{
    int i = 0, j = 0, tmp;
    for (i = 0; i < n; i++) 
    {   
        for (j = 0; j < n - i - 1; j++) 
        { 
            if (a[j] > a[j + 1]) {  
                tmp = a[j];
                a[j] = a[j + 1];
                a[j + 1] = tmp;
            }
        }
    }
}


int main (int argc, char *argv[]) 
{
    srand(2024);
    printf("Hany db random szamot kersz: ");
    int db = 0;
    scanf("%d", &db);
    int szamok[db];

    printf("Also: ");
    int also = 0;
    scanf("%d", &also);

    printf("Felso hatar (zart intervallum): ");
    int felso = 0;
    scanf("%d", &felso);

    for (int i = 0; i < db; i++)
    {
        szamok[i] = rand() % (felso - also + 1) + also;
    }

    bubble_sort(szamok, db);
    for (int i = 0; i < db; i++)
    {
        int szam = 0;
        printf("%d ", szamok[i]);
    }
    
    

    return 0;
}