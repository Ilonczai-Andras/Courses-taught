package org.example;

import static Var_args.Var_args.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sum of 1, 2, 3, 4: " + sum(1, 2, 3, 4)); // 6
        System.out.println("Sum of 10, 20, 30, 40: " + sum(10, 20, 30, 40)); // 100
        System.out.println("Sum with no arguments: " + sum()); // 0

        System.out.println("----------------------------");
        printSentence("Hello", "Java", "Varargs", "Functionality"); // Hello: Java Varargs Functionality
        printSentence("Greetings", "everyone!"); // Greetings: everyone!
        printSentence("Notice", "this", "works", "with", "any", "number", "of", "words"); // Notice: this works with any number of words
        System.out.println("----------------------------");
        System.out.println("Sum of 5, 10, 15: " + calculate("sum", 5, 10, 15)); // 30
        System.out.println("Product of 2, 3, 4: " + calculate("product", 2, 3, 4)); // 24
        System.out.println("Sum with no numbers: " + calculate("sum")); // 0
        System.out.println("Product with no numbers: " + calculate("product")); // 1
    }
}