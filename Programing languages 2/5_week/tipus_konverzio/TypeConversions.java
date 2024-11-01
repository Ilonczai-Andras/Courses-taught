//Típuskonverziók
import java.util.Scanner;

public class TypeConversions {
    public static void main(String[] args) {
        // Implicit típuskonverzió
        int num = 100;
        long longNum = num; // implicit konverzió, int → long
        double doubleNum = num; // implicit konverzió, int → double
        System.out.println("Implicit konverzió: int -> long: " + longNum);
        System.out.println("Implicit konverzió: int -> double: " + doubleNum);

        // Explicit típuskonverzió (Cast)
        double decimalValue = 9.78;
        int intValue = (int) decimalValue; // explicit konverzió, double → int
        System.out.println("Explicit konverzió: double -> int: " + intValue);

        // String típus konverziója számokra
        String numberString = "123";
        int number = Integer.parseInt(numberString); // String → int
        System.out.println("String -> int: " + number);

        String decimalString = "45.67";
        double decimalNumber = Double.parseDouble(decimalString); // String → double
        System.out.println("String -> double: " + decimalNumber);

        // Wrapper osztály használata
        Integer numObject = Integer.valueOf(num); // primitív → objektum (Boxing)
        int newNum = numObject.intValue(); // objektum → primitív (Unboxing)
        System.out.println("Wrapper osztály használata: " + newNum);

        // pdf
        // String to long
        String strLong = "123";
        long longValue = Long.parseLong(strLong);
        System.out.println("String to long: " + longValue);

        // String to float
        String strFloat = "3.14";
        float floatValue = Float.parseFloat(strFloat);
        System.out.println("String to float: " + floatValue);

        // String to double
        String strDouble = "7.89";
        double doubleValue = Double.parseDouble(strDouble);
        System.out.println("String to double: " + doubleValue);

        // String to char
        String strChar = "a";
        char charValue = strChar.charAt(0);
        System.out.println(strChar.toCharArray()[0]);
        System.out.println(charValue);
    }
}

class InputUtils {
    private static Scanner scanner = new Scanner(System.in);

    public static String input(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
}

/*
 * Gyakorló feladat:
 * 1. Írj egy programot, amely egy `String` típusú változó értékét konvertálja
 * `double`-re, majd számold ki a négyzetét.
 * 2. Írj egy programot, amely bekér egy `double` értéket a felhasználótól, és
 * egész számmá konvertálja.
 */
// 1. Feladat: String típusú változó konvertálása double-re és a négyzetének
// kiszámítása

/*
 * public class SquareCalculator {
 * public static void main(String[] args) {
 * String numberString = "4.5"; // Példa érték
 * try {
 * double number = Double.parseDouble(numberString);
 * double square = Math.pow(number, 2);
 * System.out.println("A szám négyzete: " + square);
 * } catch (NumberFormatException e) {
 * System.out.println("Hibás számformátum!");
 * }
 * }
 * }
 * 
 * // 2. Feladat: Double érték bekérése és egész számmá konvertálása
 * import java.util.Scanner;
 * 
 * public class ConvertToInteger {
 * public static void main(String[] args) {
 * Scanner scanner = new Scanner(System.in);
 * System.out.print("Adj meg egy double értéket: ");
 * try {
 * double userInput = scanner.nextDouble();
 * int integerValue = (int) userInput;
 * System.out.println("Az egész számra konvertált érték: " + integerValue);
 * } catch (Exception e) {
 * System.out.println("Hibás bemenet!");
 * } finally {
 * scanner.close();
 * }
 * }
 * }
 */