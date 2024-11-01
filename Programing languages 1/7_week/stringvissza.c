#include <stdio.h>
#include <string.h>

void feltolt_string(char abc_string[]) 
{
    for (char ch = 'a'; ch <= 'z'; ++ch) 
    {
        abc_string[ch - 'a'] = ch;
    }
    abc_string[26] = '\0';
}

int main() {
    char abc_sztring[27];
    feltolt_string(abc_sztring);

    printf("Az angol kisbetuk: %s\n", abc_sztring);

    return 0;
}
