// Parancssori Argumentumok

public class CommandLineArguments {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Nincsenek megadott argumentumok.");
        } else {
            System.out.println("Megadott argumentumok:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argumentum " + (i + 1) + ": " + args[i]);
            }
        }

        int sum = 0;

        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
        }

        System.out.println(sum);
    }
}

/*
 * Gyakorló feladat:
 * 1. Írj egy programot, amely három számot fogad parancssori argumentumként, és
 * kiírja ezek összegét.
 * 2. Írj egy programot, amely ellenőrzi, hogy megadott parancssori argumentumok
 * között szerepel-e egy konkrét szó (pl. "Hello").
 */

// 3. Feladat: Három szám összegének kiszámítása parancssori argumentumként
/*
 * public class SumThreeNumbers {
 * public static void main(String[] args) {
 * if (args.length < 3) {
 * System.out.println("Kérlek adj meg három számot parancssori argumentumként!"
 * );
 * return;
 * }
 * try {
 * double num1 = Double.parseDouble(args[0]);
 * double num2 = Double.parseDouble(args[1]);
 * double num3 = Double.parseDouble(args[2]);
 * double sum = num1 + num2 + num3;
 * System.out.println("A három szám összege: " + sum);
 * } catch (NumberFormatException e) {
 * System.out.println("Hibás számformátum! Kérlek adj meg érvényes számokat.");
 * }
 * }
 * }
 * 
 * // 4. Feladat: Parancssori argumentumok ellenőrzése, hogy szerepel-e egy
 * konkrét szó
 * public class CheckArgument {
 * public static void main(String[] args) {
 * String targetWord = "Hello";
 * boolean found = false;
 * for (String arg : args) {
 * if (arg.equals(targetWord)) {
 * found = true;
 * break;
 * }
 * }
 * if (found) {
 * System.out.println("A megadott argumentumok között szerepel a(z) \"" +
 * targetWord + "\" szó.");
 * } else {
 * System.out.println("A megadott argumentumok között nem szerepel a(z) \"" +
 * targetWord + "\" szó.");
 * }
 * }
 * }
 */