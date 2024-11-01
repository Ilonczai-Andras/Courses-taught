#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main (int argc, char *argv[]) 
{      
    //1
    srand(time(NULL));

    int also = 1;
    int felso = 5;

    int i = 0;
    //( (felso + 1) - also) + also;
    while (i < 10)
    {
        int nRandonNumber = (rand() % (felso + 1 - also)  ) + also;
        printf("%d\n", nRandonNumber);   
        i++;
    }
    

    return 0;
}