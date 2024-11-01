#include <stdio.h>

void kiir_foatlo(int sorok, int oszlopok, int matrix[sorok][oszlopok])
{   int j = 0;
    for (int i = sorok - 1; i >= 0; i--, j++)
    {
        printf("%d\n", matrix[i][j]);
    }
}

void kiir_matrix(int sorok, int oszlopok, int matrix[sorok][oszlopok])
{
    for (int i = 0; i < sorok; i++) //megyek vegig a sorokon
    {
        for (int j = 0; j < oszlopok; j++)
        {
            printf("%d\t", matrix[i][j]);
        }
        puts("");
    }
    
}

int main()

{
    int matrix[6][6] = {
        {1, 2, 3, 4, 5, 6},
        {7, 8, 9, 10, 11, 12},
        {13, 14, 15, 15, 17, 18},
        {19, 20, 21, 22, 23, 24},
        {25, 26, 27, 28, 29, 30},
        {30, 31, 32, 33, 34, 35}
    };

    int sor = 6;
    int oszlop = 6;

    kiir_matrix(sor, oszlop, matrix);
    puts("");
    kiir_foatlo(sor, oszlop, matrix);

    return 0;
}