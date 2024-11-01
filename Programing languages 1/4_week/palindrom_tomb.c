#include <stdio.h>
void tomb_kiir(int meret, int tomb[])
{
    for (int i = 0; i < meret; i++)
    {
        printf("%d ", tomb[i]);
    }
    
}

int palindrom(int meret, int tomb[])
{
    for (int i = 0, j = meret - 1; i < meret / 2; i++)
    {
        if (tomb[i] != tomb[j])
        {
            return 0;
        }
        
        j--;
    }
    return 1;
}

int main()
{
    int szamok[5] = {1,2,3,2,1};
    int meret = sizeof(szamok)/sizeof(int);


    printf("Palindrom a tomb: %d",palindrom(meret, szamok));

    return 0;
}