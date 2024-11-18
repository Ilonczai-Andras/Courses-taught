// Csomag: vehicles
package vehicles;

class Car {
    String model;
    int year;

    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void displayInfo() {
        System.out.println("Car model: " + model + ", year: " + year);
    }
}
