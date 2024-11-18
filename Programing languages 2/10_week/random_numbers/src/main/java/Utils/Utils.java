package Utils;

import java.util.HashSet;
import java.util.Random;

public class Utils {
    public static void rollTwoDice() {
        Random rand = new Random();
        int die1 = rand.nextInt(6) + 1; // Roll first die (1-6)
        int die2 = rand.nextInt(6) + 1; // Roll second die (1-6)
        int sum = die1 + die2;

        System.out.println("Első dobás: " + die1);
        System.out.println("Második dobás: " + die2);
        System.out.println("A két dobás összege: " + sum);
    }

    public static void generateLotteryNumbers() {
        Random rand = new Random();
        HashSet<Integer> lotteryNumbers = new HashSet<>();

        // Generate 5 unique lottery numbers between 1 and 50
        while (lotteryNumbers.size() < 5) {
            int randomNum = rand.nextInt(50) + 1;
            lotteryNumbers.add(randomNum);
        }

        System.out.println("Lottószámok: " + lotteryNumbers);
    }

    // Method to generate random integer in a range
    public static int generateRandomIntInRange(Random rand, int min, int max) {
        return rand.nextInt((max - min) + 1) + min;
    }

    // Method to generate random double in a range
    public static double generateRandomDoubleInRange(Random rand, double min, double max) {
        return min + (max - min) * rand.nextDouble();
    }
}
