#include <stdio.h>

int atoi_custom(const char *str) {
    int result = 0;
    int sign = 1;
    int i = 0;

    // Ellenőrizzük, hogy üres-e a string
    if (str[0] == '\0')
        return 0;

    // Kezdjük a string elejéről
    // Ha az első karakter '-' az adott szám negatív
    if (str[0] == '-') {
        sign = -1;
        i++;
    }

    // Számoljuk ki a konvertált értéket
    while (str[i] != '\0') {
        // Ha nem számjegy a karakter, térjünk vissza 0-val
        if (str[i] < '0' || str[i] > '9')
            return 0;

        // Számjegy karakter ASCII kódja - '0' ASCII kódja = számjegy értéke
        result = result * 10 + (str[i] - '0');
        printf("result: %d\n", result);
        i++;
    }

    // Számjegyek szorzata az előjellel
    return sign * result;
}

int main() {
    // Teszteljük a függvényt
    char str1[] = "123";
    char str2[] = "-456";
    char str3[] = "abc";
    
    printf("%d\n", atoi_custom(str1));  // Kiírja: 123
    //printf("%d\n", atoi_custom(str2));  // Kiírja: -456
    //printf("%d\n", atoi_custom(str3));  // Kiírja: 0, mert nem egy szám
    
    return 0;
}
