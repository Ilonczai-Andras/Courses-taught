#include <stdio.h>
#include "prog1.h"

int main (int argc, char *argv[]) 
{   
    //1
    char str1[10] = "Hello";
    //2
    char str2[] = "Hello";
    //3
    char str3[10];
    str3[0] = 'H';
    str3[1] = 'e';
    str3[2] = 'l';
    str3[3] = 'l';
    str3[4] = 'o';
    str3[5] = '\0'; // Null-terminate the string
    //4
    char str4[] = {'H','e','l','l','o','\0'};

    string s1 = "Hello World!";

    printf("1: %s\n", str1);
    printf("2: %s\n", str2);
    printf("3: %s\n", str3);
    printf("4: %s\n", str4);
    printf("%s\n", s1);
    return 0;
}