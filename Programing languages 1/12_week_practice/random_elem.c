#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int choice(const int n, const int tomb[])
{
    int also = 0;
    int felso = n - 1;

    return rand() % (felso - also + 1) + also;
}

int main (int argc, char *argv[]) 
{
    srand(time(NULL));
    int tomb[] = {1,432,321,12,-312};
    
    int index = choice(5, tomb);
    printf("%d %d\n", tomb[index], index);
    return 0;
}