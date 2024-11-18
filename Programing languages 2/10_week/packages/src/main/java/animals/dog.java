package animals;

public class dog {
    private String name;

    public dog(String name) {
        this.name = name;
    }

    public void bark() {
        System.out.println(name + " says Woof!");
    }
}
