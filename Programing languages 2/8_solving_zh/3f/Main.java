import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Kérlek, adj meg legalább egy stringet parancssori argumentumként.");
            return;
        }

        for (String str : args) {
            StringBuilder result = new StringBuilder();

            for (char c : str.toCharArray()) {
                if ((int) c % 2 == 0) {
                    result.append((int) c);
                } else {
                    result.append(c);
                }
            }

            System.out.println("Eredmény: " + result.toString());
        }
    }
}