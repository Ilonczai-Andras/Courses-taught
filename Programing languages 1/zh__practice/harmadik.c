#include <stdio.h>
#include <stdlib.h>

#define SIZE 5

typedef struct
{
    int min;
    int max;
}MinMax;

void print_matrix(int matrix[SIZE][SIZE])
{
    for (int i = 0; i < SIZE; i++)
    {
        for (int j= 0; j< SIZE;j++)
        {
            printf("%2d ", matrix[i][j]);
        }
        printf("\n");
    }
}

MinMax find_min_max(int matrix[SIZE][SIZE])
{
    MinMax res;
    int min  = 9999;
    int max = -9999;

    for (int i = 0; i < SIZE; i++)
    {   

        for (int j= 0; j< SIZE;j++)
        {
            if (matrix[i][j] < min)
            {
                min = matrix[i][j];
            }

            if (matrix[i][j] > max)
            {
                max = matrix[i][j];
            }
        }
    }
    res.max = max;
    res.min = min;

    return res;
}


int main (int argc, char *argv[]) 
{   
    srand(1980);
    int matrix[SIZE][SIZE];

    for (int i = 0; i < SIZE; i++)
    {
        for (int j= 0; j< SIZE;j++)
        {
            matrix[i][j] = rand() % 90 + 10;
        }
        
    }
    print_matrix(matrix);

    MinMax res = find_min_max(matrix);
    printf("Min: %d Max: %d\n", res.min, res.max);
    

    return 0;
}