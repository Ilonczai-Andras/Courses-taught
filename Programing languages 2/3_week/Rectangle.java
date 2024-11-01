import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        double perimeter = calculateRectanglePerimeter(length, width);
        double area = calculateRectangleArea(length, width);

        System.out.println("Perimeter of the rectangle: " + perimeter);
        System.out.println("Area of the rectangle: " + area);
    }

    public static double calculateRectanglePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }
}
