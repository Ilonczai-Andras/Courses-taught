package Calculator;

public class Calculator {

    // This method adds two integers and returns the result.
    public int add(int a, int b) {
        return a + b;
    }

    // This method subtracts the second integer from the first and returns the result.
    public int subtract(int a, int b) {
        return a - b;
    }

    // Additional method examples for educational purposes
    // This method multiplies two integers and returns the result.
    public int multiply(int a, int b) {
        return a * b;
    }

    // This method divides the first integer by the second and returns the result.
    // It handles division by zero by returning Integer.MAX_VALUE to indicate an error.
    public int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero.");
            return Integer.MAX_VALUE; // An alternative way to indicate an error
        }
        return a / b;
    }
}

