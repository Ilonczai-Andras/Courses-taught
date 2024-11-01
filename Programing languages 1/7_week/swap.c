#include <stdio.h>

void swap(int *a, int *b)
{
    int tmp = *a;
    *a = *b;
    *b = tmp;
    
}

int main (int argc, char *argv[]) 
{
    int x = 45;
    int y = 0;
    printf("%d %d\n", x, y);

    swap(&x, &y);
    printf("%d %d", x, y);
    return 0;
}