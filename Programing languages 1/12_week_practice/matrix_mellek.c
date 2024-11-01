#include <stdio.h>

void foatlo(int sorok, int oszlopok, int matrix[][oszlopok])
{
    for (int i = sorok - 1, j = 0; i >= 0; i--, j++)
    {
        printf("%d ", matrix[i][j]);
    }
    
}

void mellek_atlo(int sorok, int oszlopok, int matrix[][oszlopok])
{
    for (int i = 0; i < sorok; i++)
    {
        for (int j = 0; j < oszlopok; j++)
        {
            if (i == j)
            {
                printf("%d\t", matrix[i][j]);
            }
            else
            {
                printf("\t");
            }
            

            
        }
        puts("");
    }
    
}

void kiir(int sorok, int oszlopok, int matrix[][oszlopok])
{
    for (int i = 0; i < sorok; i++)
    {
        for (int j = 0; j < oszlopok; j++)
        {
            printf("%d\t", matrix[i][j]);
        }
        puts("");
    }
    
}

int main (int argc, char *argv[]) 
{

    int matrix[6][6] = {
        {1, 2, 3, 4, 5, 6},
        {7, 8, 9, 10, 11, 12},
        {13, 14, 15, 15, 17, 18},
        {19, 20, 21, 22, 23, 24},
        {25, 26, 27, 28, 29, 30},
        {30, 31, 32, 33, 34, 35}
    };

    kiir(6,6, matrix);
    puts("-----------------------------------------------");
    mellek_atlo(6,6,matrix);
    puts("-----------------------------------------------");
    foatlo(6,6, matrix);
    

    return 0;
}