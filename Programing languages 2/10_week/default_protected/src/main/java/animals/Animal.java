// Csomag: animals
package animals;

// Szülőosztály, amely `protected` tagokat tartalmaz
public class Animal {
    protected String name;

    protected void makeSound() {
        System.out.println(name + " makes a sound.");
    }

    public Animal(String name) {
        this.name = name;
    }
}
