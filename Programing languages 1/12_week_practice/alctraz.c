#include <stdio.h>

int main (int argc, char *argv[]) 
{
    int cella[601] = {0};
    int meret = 601;

    for (int i = 0; i < meret; i++)
    {
        for (int j = 0; j < meret; j = j + i + 1)
        {
            if (cella[j] == 0)
            {
                cella[j] = 1;
            }
            else
            {
                cella[j] = 0;
            }
            
        }
        
    }

    for (int i = 1; i < meret; i++)
    {
        if (cella[i] == 1)
        {
            printf("%d", i);
        }
        
    }
    
    

    return 0;
}