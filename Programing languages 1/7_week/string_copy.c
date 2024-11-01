#include <stdio.h>
#include <string.h>

#define MERET 100

void insert_name(char str[])
{
    str[0] = 'B';
    str[1] = 'e';
    str[2] = 'a';
    str[3] = 'a';
    str[4] = 'a';
    str[5] = 'a';
    str[6] = 'a';
    str[7] = '\0';
}
void insert_name2(char str[])
{
    strcpy(str, "BEAAAAA");
}


int main()
{
    char name[MERET];
    insert_name(name);
    puts(name);
    printf("%s\n", name);
    printf("%d\n", (int)strlen(name));

    insert_name2(name);
    puts(name);
    printf("%s\n", name);
    printf("%d\n", (int)strlen(name));

    return 0;
}