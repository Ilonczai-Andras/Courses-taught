#include <stdio.h>

#define ROWS 3
#define COLS 3

void transposeMatrix(int matrix[ROWS][COLS], int result[COLS][ROWS]) {
    int i, j;

    for (i = 0; i < ROWS; i++) {
        for (j = 0; j < COLS; j++) {
            result[j][i] = matrix[i][j];
        }
    }
}

void printMatrix(int matrix[ROWS][COLS]) {
    int i, j;

    for (i = 0; i < ROWS; i++) {
        for (j = 0; j < COLS; j++) {
            printf("%d\t", matrix[i][j]);
        }
        printf("\n");
    }
}

int main() {
    int matrix[ROWS][COLS] = {{1, 2, 3},
                               {4, 5, 6},
                               {7, 8, 9}};
    int result[COLS][ROWS];

    printf("Original Matrix:\n");
    printMatrix(matrix);

    transposeMatrix(matrix, result);

    printf("\nTransposed Matrix:\n");
    printMatrix(result);

    return 0;
}
