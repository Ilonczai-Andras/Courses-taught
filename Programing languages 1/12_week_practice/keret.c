#include <stdio.h>

void print_keret(int sorok, int oszlopok, int matrix[sorok][oszlopok])
{
    int paros, paratlan = 0;

    for (int i = 0; i < sorok; i++)
    {
        for (int j = 0; j < oszlopok; j++)
        {
            if (i == 0 || i == sorok - 1)
            {
                printf("%d ", matrix[i][j]);
                if (matrix[i][j] % 2 == 0)
                {
                    paros += matrix[i][j];
                }
                else
                {
                    paratlan += matrix[i][j];
                }
                
            }
            else if (j == 0 || j == oszlopok - 1)
            {
                printf("%d ", matrix[i][j]);
                if (matrix[i][j] % 2 == 0)
                {
                    paros += matrix[i][j];
                }
                else
                {
                    paratlan += matrix[i][j];
                }
            }
            else
            {
                printf("   ");
            }
        }
        puts("");
        
    }
    printf("Paros: %d\n", paros);
    printf("paratlan: %d\n", paratlan);
}

int main (int argc, char *argv[]) 
{
    int matrix[5][5] = 
    {
        {11, 12, 13, 14, 15},
        {21, 22, 23, 24, 25},
        {31, 32, 33, 34, 35},
        {41, 42, 43, 44, 45},
        {51, 52, 53, 54, 55}
    };

    print_keret(5,5,matrix);

    return 0;
}