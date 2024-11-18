package mammals;

import animals.Animal;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(name + " barks!");
        makeSound(); // hozzáfér a protected metódushoz
    }
}