#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int tobb_ertek_vissza(int meret, int tomb[], int* b, float* atlag)
{   int min = tomb[0];
    int max = 0;
    float sum = 0;

    float avg = 0;
    for (int i = 0; i < meret; i++)
    {
        if (min > tomb[i])
        {
            min = tomb[i];
        }

        if (tomb[i] > max)
        {
            max = tomb[i];
        }
        sum += tomb[i];
    }
    avg = sum / (float)meret;

    *atlag = sum / meret;
    *b = max;
    
    return min;
}

int main (int argc, char *argv[]) 
{
    int n = 10;
    int felso = 99;
    int also = 10;

    int szamok[10] = {13, 57, 23, 71, 11, 68, 88, 59, 10, 32};

    int min = 0;
    int max = 0;
    float atlag = 0;

    int result = tobb_ertek_vissza(n, szamok, &max, &atlag);

    for (int  i = 0; i < n; i++)
    {
        printf("%d ", szamok[i]);
    }
    puts("");

    printf("Legkisebb elem: %d\n",result);
    printf("Legnagyobb elem: %d\n", max);
    printf("Az elemek atlaga %.1lf\n",atlag);

    return 0;
}