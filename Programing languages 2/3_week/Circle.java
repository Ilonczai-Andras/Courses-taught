import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double perimeter = calculateCirclePerimeter(radius);
        double area = calculateCircleArea(radius);

        System.out.println("Perimeter (circumference) of the circle: " + perimeter);
        System.out.println("Area of the circle: " + area);
    }

    public static double calculateCirclePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
}
