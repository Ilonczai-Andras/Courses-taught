#include <stdio.h>
#include <string.h>
#include <ctype.h>

// Függvény az erősség ellenőrzésére
int is_strong_password(char *password) {
    int has_lower = 0, has_upper = 0, has_digit = 0;
    int length = 0;
    
    // Ellenőrizzük a jelszó hosszát és az alapvető karakterek jelenlétét
    for(int i = 0; password[i] != '\0'; i++)
    {
        if (islower(password[i]))
            has_lower = 1;
        else if (isupper(password[i]))
            has_upper = 1;
        else if (isdigit(password[i]))
            has_digit = 1;
        
        length++;
    }
    
    printf("%d %d %d %d\n", length, has_digit, has_lower, has_upper);
    // Ellenőrizzük az erősségi feltételeket
    if (length >= 8 && has_lower && has_upper && has_digit)
        return 1;
    else
        return 0;
}

int main() {
    char password[100]; // Jelszó maximális hossza 100 karakter

    // Végtelen ciklus a jelszavak bekérésére
    while (1) 
    {
        printf("Adj meg jelszavakat '*' vegjelig:\n");
        printf("jelszo: ");
        fgets(password, sizeof(password), stdin);
        password[strlen(password) - 1] = '\0';
        
        // Kilépés, ha a felhasználó '*' karaktert ad meg
        if (strcmp(password, "*") == 0)
            break;

        // Jelszó erősségének ellenőrzése és kiíratása
        if (is_strong_password(password))
            printf("eros jelszo\n\n");
        else
            printf("gyenge jelszo\n\n");
    }

    return 0;
}
