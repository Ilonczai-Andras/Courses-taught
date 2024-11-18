// Ugyanabban a csomagban lévő osztály
package vehicles;

public class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2020);
        car.displayInfo(); // hozzáfér a `default` metódushoz és mezőkhöz
    }
}