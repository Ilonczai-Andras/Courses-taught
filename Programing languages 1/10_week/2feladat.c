#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char * shift(const char* original, const int step)
{       
    int length = strlen(original)+1;

    char *ujszo = (char*)malloc(length * sizeof(char));

    

    if (step > 0)
    {
        for (int i = 0; i < length ; i++)
        {   
            ujszo[i] = original[i] + step;
            ujszo[length - 1]  = '\0';
        }
        
    }
    else if(step < 0)
    {
        for (int i = 0; i < length; i++)
        {
            ujszo[i] = original[i] + step;
            ujszo[length - 1]  = '\0';
        }
    }
    else
    {
        printf("Nem lehet 0");
        exit(1);
    }
    return ujszo;

    //free(ujszo);
}

int main (int argc, char *argv[]) 
{
    if (argc != 3)
    {
        printf("Hibas parameterezes! Egyentlen sztringet es szamot kell megadni");
    }
    else
    {
        printf("%s", shift(argv[1], atoi(argv[2])) );
    }
    
    return 0;
}