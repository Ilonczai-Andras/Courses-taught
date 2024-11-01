public class MethodOverloadingExample {
    // Metódus 1: két egész szám összeadása
    public int add(int a, int b) {
        return a + b;
    }

    // Metódus 2: három egész szám összeadása
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Metódus 3: két lebegőpontos szám összeadása
    public double add(double a, double b) {
        return a + b;
    }

    // Metódus 4: két long típusú szám összeadása
    public long add(long a, long b) {
        return a + b;
    }

    // Metódus 5: két float típusú szám összeadása
    public float add(float a, float b) {
        return a + b;
    }

    // Metódus 6: négy egész szám összeadása
    public int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    // Metódus 7: variábilis számú paraméterekkel (int)
    public int add(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        MethodOverloadingExample example = new MethodOverloadingExample();

        // Két egész szám
        System.out.println("2 + 3 = " + example.add(2, 3));

        // Három egész szám
        System.out.println("2 + 3 + 4 = " + example.add(2, 3, 4));

        // Két double típusú szám
        System.out.println("2.5 + 3.7 = " + example.add(2.5, 3.7));

        // Két long típusú szám
        System.out.println("10000000000L + 20000000000L = " + example.add(10000000000L, 20000000000L));

        // Két float típusú szám
        System.out.println("1.2f + 3.4f = " + example.add(1.2f, 3.4f));

        // Négy egész szám
        System.out.println("1 + 2 + 3 + 4 = " + example.add(1, 2, 3, 4));

        // Variábilis számú paraméterek (több egész szám)
        System.out.println("Sum of 1, 2, 3, 4, 5 = " + example.add(1, 2, 3, 4, 5));
    }
}
