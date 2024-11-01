#include <stdio.h>

int main() {
    FILE *file;
    int num, num2, num3;

    // Open the file for reading
    file = fopen("data.txt", "r");
    if (file == NULL) {
        perror("Error opening file");
        return 1;
    }

    // Read integers from the file until end of file is reached
    fscanf(file, "%d,%d,%d", &num, &num2, &num3);
        // Print each integer
    printf("%d %d %d\n", num, num2, num3);
    

    // Close the file
    fclose(file);

    return 0;
}
