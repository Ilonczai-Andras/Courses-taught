package org.example;

import java.util.Random;

import static Utils.Utils.*;

public class Main
{
    public static void main(String[] args) {
        Random rand = new Random();

        // Generate random integer and double in a custom range
        int min = 50;
        int max = 150;
        int boundedRandomInt = generateRandomIntInRange(rand, min, max);
        System.out.println("Random egész szám " + min + " és " + max + " között: " + boundedRandomInt);

        double boundedRandomDouble = generateRandomDoubleInRange(rand, min, max);
        System.out.println("Random valós szám " + min + " és " + max + " között: " + boundedRandomDouble);

        // Roll two dice and display their sum
        rollTwoDice();

        // Generate lottery numbers
        generateLotteryNumbers();
    }

}