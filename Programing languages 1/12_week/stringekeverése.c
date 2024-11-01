#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>

void shuffleString(char *str) {
    int length = strlen(str);
    srand(time(NULL));

    for (int i = length - 1; i > 0; i--) 
    {
        int j = rand() % (i + 1);
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
}

int main() {
    char str[100];
    printf("Adj meg egy stringet: ");
    fgets(str, 100, stdin);

    // fgets beolvasza a sortörést is, amit cserélnünk kell egy nullára
    str[strcspn(str, "\n")] = '\0';

    shuffleString(str);

    printf("Az összekevert string: %s\n", str);

    return 0;
}
