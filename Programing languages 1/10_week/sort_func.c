#include <stdio.h>
#include <stdlib.h>

void tomb_kiir(int tomb[], int n)
{
    for (int i = 0; i < n; i++)
    {
        printf("%d ", tomb[i]);
    }
    
}

int *sorted(const int tomb[], const int n) {
    int *rendezett = (int *)malloc(n * sizeof(int));

    if (rendezett == NULL) {
        printf("Memory allocation failed\n");
        exit(1);
    }

    for (int i = 0; i < n; i++) {
        rendezett[i] = tomb[i];
    }

    int tmp;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (rendezett[j] > rendezett[j + 1]) {
                tmp = rendezett[j];
                rendezett[j] = rendezett[j + 1];
                rendezett[j + 1] = tmp;
            }
        }
    }
    return rendezett;
}

int main (int argc, char *argv[]) 
{
    int szamok[] = {17,0,78,-9,15,475,6};
    int n = sizeof(szamok)/sizeof(int);
    int *rendezet = sorted(szamok, n);

    tomb_kiir(szamok, n);
    puts("");
    tomb_kiir(rendezet, n);
    free(rendezet);

    return 0;
}