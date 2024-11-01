import java.util.Scanner;

public class Beolvas {
    public static void main(String[] args) {
        // Scanner objektum létrehozása
        Scanner scanner = new Scanner(System.in);
        
        // Felhasználó nevének bekérése
        System.out.print("Kérlek, add meg a neved: ");
        String nev = scanner.nextLine();
        
        // Üdvözlés
        System.out.println("Üdvözöllek, " + nev + "!");
        
        // Scanner lezárása
        scanner.close();
    }
}
