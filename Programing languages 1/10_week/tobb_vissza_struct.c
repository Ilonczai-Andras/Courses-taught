#include <stdio.h>

typedef struct
{
    int min;
    int max;
    float avg;
}tobbvissza;

tobbvissza min_max_avg(int szamok[], int n)
{
    int min = 9999;
    int max = -9999;
    float avg = 0;

    tobbvissza res;

    for (int i = 0; i < n; i++)
    {
        if (szamok[i] > max)
        {
            max = szamok[i];
        }

        if (szamok[i] < min)
        {
            min = szamok[i];
        }
        
        avg += szamok[i];
    }
    
    res.min = min;
    res.max = max;
    res.avg = avg / (float)n;

    return res;
}


int main (int argc, char *argv[]) 
{
    int szamok[] = {13, 57, 23, 71, 11, 68, 88, 59, 10, 32};
    tobbvissza res = min_max_avg(szamok, 10);
    printf("Atlag: %f\n", res.avg);
    printf("min: %d\n", res.min);
    printf("max: %d\n", res.max);
    return 0;
}