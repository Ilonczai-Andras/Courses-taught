import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int correctInputs = 0;
        int incorrectInputs = 0;

        while (true) {
            System.out.print("Kérlek, adj meg egy számot (kilépéshez írd be: q): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);

                if (number <= 0) {
                    System.out.println("Kérlek, adj meg egy pozitív egész számot!");
                    incorrectInputs++;
                } else {
                    correctInputs++;
                    List<Integer> primeFactors = getPrimeFactors(number);
                    System.out.println("A(z) " + number + " prímtényezői: " + primeFactors);
                }
            } catch (NumberFormatException e) {
                System.out.println("Érvénytelen bemenet. Kérlek, adj meg egy egész számot!");
                incorrectInputs++;
            }
        }

        System.out.println(
                "Kilépés... Helyes adatok száma: " + correctInputs + ", Helytelen adatok száma: " + incorrectInputs);
        scanner.close();
    }

    private static List<Integer> getPrimeFactors(int number) {
        List<Integer> primeFactors = new ArrayList<>();
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                primeFactors.add(i);
                number /= i;
            }
        }
        return primeFactors;
    }
}