#include <stdio.h>
void tomb_kiir(int meret, int tomb[])
{
    for (int i = 0; i < meret; i++)
    {
        printf("%d ", tomb[i]);
    }
    
}

int main()
{
    int szamok[5] = {1,2,3,4,5};
    int meret = sizeof(szamok)/sizeof(int);

    printf("Meret: %d\n", meret);
    tomb_kiir(meret, szamok);
    puts("");


    for (int i = 0, j = meret - 1; i < meret / 2; i++)
    {
        int tmp = szamok[i];
        szamok[i] = szamok[j];
        szamok[j] = tmp;

        j--;
    }

    tomb_kiir(meret, szamok);
    

    return 0;
}