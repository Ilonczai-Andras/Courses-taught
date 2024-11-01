public class Format {
    public static void main(String[] args) {
        String name = "Joe";
        String profession = "hacker";
        int age = 22;

        // 1. Formázott kiíratás közvetlenül
        System.out.printf("%s (%s), %d%n", name, profession, age);

        // 2. Formázott szöveg elmentése egy változóba
        String result = String.format("%s (%s), %d", name, profession, age);
        System.out.println(result);
    }
}
