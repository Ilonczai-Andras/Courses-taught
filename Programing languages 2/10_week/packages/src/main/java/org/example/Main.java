package org.example;

import animals.cat;
import animals.dog;
import animals.wild.lion;

public class Main {
    public static void main(String[] args) {
        dog myDog = new dog("Buddy");
        cat myCat = new cat("Whiskers");
        lion wildLion = new lion("Simba");

        myDog.bark();
        myCat.meow();
        wildLion.roar();
    }
}