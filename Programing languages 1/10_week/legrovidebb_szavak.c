#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main (int argc, char *argv[]) 
{   
    if (argc < 2)
    {
        fprintf(stderr,"%s", "Nem adtal meg egyetlen szot sem!");
    }
    else
    {
        for (int i = 1; i < argc - 1; i++)
        {   
            char * string = argv[i];

            if (strlen(argv[i + 1]) <= strlen(string) )
            {
                printf("%s\n",argv[i + 1] );
            }
            
        }
        
    }
    
    return 0;
}