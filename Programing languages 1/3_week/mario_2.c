#include <stdio.h>

int main()
{   
    int n = 5;

    for (int i = 1; i <= n; i++)
    {
        int spaces = n - i;
        for (int j = 0; j < spaces; j++)
        {
            printf(" ");
        }

        for (int j = 0; j < i; j++)
        {
            printf("#");
        }
        
        puts("");
    }
    

    return 0;
}