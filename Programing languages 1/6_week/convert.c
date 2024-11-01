#include <stdio.h>
#include <stdlib.h>

int main (int argc, char *argv[]) 
{
    char szam1[] = "112";
    char szam2[] = "131";

    printf("%d\n", atoi(szam1));
    printf("%lf\n", atof(szam2));

    return 0;
}