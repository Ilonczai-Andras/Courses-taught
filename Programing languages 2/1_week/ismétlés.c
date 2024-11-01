#include <stdio.h>
#include <stdbool.h>
#include <limits.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

bool paros_e(int num)
{
    return num % 2 == 0;
}

// eljárás, amely 10 darab tetszőleges karaktert rajzol ki
void vonal(int hossz, char jel)
{
    for (int i = 0; i < hossz; i++)
    {
        printf("%c", jel);
    }
    printf("\n"); // Sortörés
}

int find(int tomb[], int meret, int ertek)
{
    for (int i = 0; i < meret; i++)
    {
        if (tomb[i] == ertek)
        {
            return i; // Visszaadja az elem indexét, ha megtalálja
        }
    }
    return -1; // Ha nincs benne, -1-et ad vissza
}

// Függvény, amely kiírja a tömb elemeit
void tomb_kiir(int tomb[], int meret)
{
    for (int i = 0; i < meret; i++)
    {
        printf("%d ", tomb[i]);
    }
    printf("\n");
}

typedef struct
{
    int x;
    int y;
} Pont;

// Távolság számító függvény
double distance(Pont p1, Pont p2)
{
    return sqrt(pow(p2.x - p1.x, 2) + pow(p2.y - p1.y, 2));
}

void stack_overflow()
{
    int nagy_tomb[100000]; // Nagy méretű helyi tömb
    printf("Stack overflow közelében...\n");
    stack_overflow(); // Rekurzív hívás
}

typedef char *string;

int main()
{
    // // For ciklus
    // for (int i = 0; i < 5; i++)
    // {
    //     printf("%d) Andris\n", i + 1);
    // }

    // // While ciklus
    // int i = 0;
    // while (i < 5)
    // {
    //     printf("%d) Andris\n", i + 1);
    //     i++;
    // }
    // // fvg eljárás
    // int number = 10;
    // if (paros_e(number))
    // {
    //     printf("%d páros.\n", number);
    // }
    // else
    // {
    //     printf("%d páratlan.\n", number);
    // }

    // // break
    // for (int i = 0; i < 10; i++)
    // {
    //     if (i == 5)
    //     {
    //         break; // A ciklus megszakad, amikor i értéke 5
    //     }
    //     printf("%d\n", i);
    // }

    // // continue
    // for (int i = 0; i < 10; i++)
    // {
    //     if (i == 5)
    //     {
    //         continue; // Kihagyja a 5-ös érték kiírását
    //     }
    //     printf("%d\n", i);
    // }

    // // overflow
    // int x = INT_MAX; // x felvétele a legnagyobb int értékkel
    // printf("Eredeti érték: %d\n", x);
    // x = x + 1; // Ez túlcsordulást eredményez
    // printf("Túlcsordulás után: %d\n", x);

    // // ASCII táblázat kiírása
    // for (int i = 32; i <= 127; i++)
    // {
    //     printf("%d: '%c'\n", i, (char)i);
    // }

    // // stringek
    // //  String létrehozása és inicializálása
    // char *nev = "John Doe";

    // // String hossza (strlen függvény használatával)
    // printf("A név: %s\n", nev);
    // printf("A név hossza: %lu\n", strlen(nev));

    // // Másik string inicializálása és összehasonlítása
    // char masik_nev[] = "Jane Doe";
    // if (strcmp(nev, masik_nev) == 0)
    // {
    //     printf("A két név azonos.\n");
    // }
    // else
    // {
    //     printf("A két név különböző.\n");
    // }

    // // tömbök
    // int tomb[10] = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};

    // // Tömb kiírása
    // printf("A tomb elemei: ");
    // tomb_kiir(tomb, 10);

    // // Keresünk egy értéket a tömbben
    // int ertek = 5;
    // int index = find(tomb, 10, ertek);

    // if (index != -1)
    // {
    //     printf("Az %d ertek a tomb %d. indexen van.\n", ertek, index);
    // }
    // else
    // {
    //     printf("Az %d ertek nincs a tombben.\n", ertek);
    // }

    // // mutatók
    // int x = 5;   // x értéke 5
    // int *p = &x; // p a mutató, amely x címére mutat

    // // Kiírjuk az x értékét és címét
    // printf("x eredeti értéke: %d\n", x);
    // printf("x címe: %p\n", &x);

    // // Módosítjuk az x értékét a mutatón keresztül
    // *p = 6;
    // printf("x új értéke: %d\n", x);

    // // Másik mutatóval módosítjuk
    // int *q = p; // q mutasson ugyanarra, amire p mutat
    // *q = 9;
    // printf("x végleges értéke: %d\n", x);

    // // strukt pont
    // Pont A = {1, 2}; // A pont koordinátái: (1, 2)
    // Pont B = {6, 5}; // B pont koordinátái: (6, 5)

    // // Távolság kiszámítása A és B pont között
    // double tavolsag = distance(A, B);

    // // Eredmény kiírása
    // printf("A tavolsag A es B pont kozott: %.2f\n", tavolsag);

    // // malloc free
    // int *ptr;

    // // Memória foglalása 5 egész szám számára
    // ptr = (int *)malloc(5 * sizeof(int));

    // if (ptr == NULL)
    // {
    //     printf("Memoria foglalas sikertelen.\n");
    //     return 1;
    // }

    // // Az 5 elem feltöltése értékekkel
    // for (int i = 0; i < 5; i++)
    // {
    //     ptr[i] = i + 1;
    // }

    // // Kiírjuk az elemeket
    // printf("A tomb elemei: ");
    // for (int i = 0; i < 5; i++)
    // {
    //     printf("%d ", ptr[i]);
    // }
    // printf("\n");

    // // Memória felszabadítása
    // free(ptr);

    // stack_overflow
    stack_overflow();

    return 0;
}
