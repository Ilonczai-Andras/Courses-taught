#include <stdio.h>
#include <stdlib.h> // abs() függvényhez

int main() {
    int n;
    printf("Hany db szamot szeretnel bevinni? ");
    scanf("%d", &n);

    int numbers[100];
    int absolute_values[100];

    // Számok beolvasása és abszolútértékek kiszámítása
    for (int i = 0; i < n; ++i) {
        printf("%d. szám: ", i + 1);
        scanf("%d", &numbers[i]);
        absolute_values[i] = abs(numbers[i]);
    }

    // Abszolútértékek kiírása
    printf("A bevitt szamok abszolutertekei: ");
    for (int i = 0; i < n; ++i) {
        printf("%d", absolute_values[i]);
        if (i < n - 1) {
            printf(", ");
        } else {
            printf("\n");
        }
    }

    // Eredeti számok kiírása
    printf("A megadott szamok: ");
    for (int i = 0; i < n; ++i) {
        printf("%d", numbers[i]);
        if (i < n - 1) {
            printf(", ");
        } else {
            printf("\n");
        }
    }

    return 0;
}
