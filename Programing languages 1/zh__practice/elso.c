#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

int is_strong_passwd(char *string)
{
    int has_lower = 0;
    int has_upper = 0;
    int has_digit = 0;
    int has_special = 0;

    for (int i = 0; string[i] != '\0'; i++)
    {
        if (islower(string[i]))
        {
            has_lower = 1;
        }
        else if (isupper(string[i]))
        {
            has_upper = 1;
        }
        else if (isdigit(string[i]))
        {
            has_digit += 1;
        }
        else if (string[i] == '.' || string[i] == ',' || string[i] == ':' || string[i] == ';')
        {
            has_special = 1;
        }
    }

    if (has_lower >= 1 && has_upper >= 1 && has_digit >= 2 && has_special >= 1)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

int main (int argc, char *argv[]) 
{
    FILE *pt = fopen("passwords.txt", "r");

    if (pt == NULL)
    {
        printf("NEm sikerult megnyitni a file-t!\n");
        exit(1);
    }

    char sor[100];
    int strong_password = 0;

    while (fgets(sor, sizeof(sor), pt))
    {
        sor[strlen(sor) - 1] = '\0';

        if (is_strong_passwd(sor))
        {
            strong_password ++;
        }
        

    }
    fclose(pt);

    printf("Eros jelszavak szama: %d", strong_password);

    return 0;
}