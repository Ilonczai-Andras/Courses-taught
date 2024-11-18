package Var_args;

public class Var_args {
    public static int sum(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void printSentence(String prefix, String... words) {
        System.out.print(prefix + ": ");
        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.println();
    }

    public static int calculate(String operation, int... numbers) {
        int result = (operation.equals("sum")) ? 0 : 1;
        for (int num : numbers) {
            if (operation.equals("sum")) {
                result += num;
            } else if (operation.equals("product")) {
                result *= num;
            } else {
                throw new IllegalArgumentException("Invalid operation: " + operation);
            }
        }
        return result;
    }
}
