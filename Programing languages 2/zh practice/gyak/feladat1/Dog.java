public class Dog {
    private String név;
    private String fajta;
    private String nem;
    private double tomeg;

    public Dog(String név, String fajta, String nem, double tomeg) {
        this.tomeg = tomeg;
        this.név = név;
        this.nem = nem.toLowerCase();
        this.fajta = fajta;
    }

    @Override
    public String toString() {
        return String.format("Dog (%s (%s), %s %.1fkg)", this.név, this.fajta, this.nem, this.tomeg);
    }

    public String getBreed() {
        return this.fajta;
    }

    public String getGender() {
        return this.nem;
    }

    public String getWeight() {
        return String.format("%.0f", this.tomeg);
    }

    public String getName() {
        return this.név;
    }

    public int compareWeight(Dog d) {
        if (d.tomeg > this.tomeg) {
            return -1;
        } else {
            return 1;
        }
    }
}
