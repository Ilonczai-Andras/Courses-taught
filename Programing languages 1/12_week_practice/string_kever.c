#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>

void shuffle_string(char *s)
{
    int hossz = strlen(s);
    srand(time(NULL));

    for (int i = hossz - 1; i > 0 ; i--)
    {
        int j = rand() % (i + 1);
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
}

int main (int argc, char *argv[]) 
{
    char szo[100];
    printf("Adj meg egy sztringet: ");
    fgets(szo, sizeof(szo), stdin);
    szo[strlen(szo) - 1] = '\0';

    printf("%s\n", szo);
    shuffle_string(szo);
    printf("%s\n", szo);

    return 0;
}