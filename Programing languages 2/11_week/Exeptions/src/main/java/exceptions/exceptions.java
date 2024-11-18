package exceptions;

import java.util.Scanner;

public class exceptions {
    public static void ArrayIndexOutOfBoundsExample() {
        int[] numbers = {1, 2, 3};
        try {
            System.out.println(numbers[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Hiba: A tömbben nem létezik ez az index!");
        }
    }

    public static void NullPointerExample () {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Hiba: Nem lehet műveletet végrehajtani null értéken!");
        }
    }

    public static void MultiCatchExample () {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Adjon meg egy számot: ");
            int number = scanner.nextInt();
            System.out.println("Az eredmény: " + (10 / number));
        } catch (ArithmeticException e) {
            System.out.println("Hiba: Nullával nem lehet osztani!");
        } catch (Exception e) {
            System.out.println("Hiba: Érvénytelen bemenet!");
        } finally {
            System.out.println("Köszönjük, hogy futtatta a programot!");
            scanner.close();
        }
    }

    public static void runExample() {
        try {
            validateAge(15);
        } catch (own_exceptin e) {
            System.out.println("Hiba: " + e.getMessage());
        }
    }

    private static void validateAge(int age) throws own_exceptin {
        if (age < 18) {
            throw new own_exceptin("Nem vagy elég idős!");
        }
        System.out.println("Köszönjük, hogy regisztráltál!");
    }
}
