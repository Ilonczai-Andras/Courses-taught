package org.example;

import mammals.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.bark();
        // dog.name; // Hiba: name mező nem érhető el közvetlenül, mivel protected
        //Car car = new Car("Honda", 2021); // Hiba: nem fér hozzá a Car osztályhoz, mert `default`
    }
}