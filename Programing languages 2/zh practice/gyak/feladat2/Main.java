public class Main {
    public static void main(String[] args) {
        String result = MyStringUtils.removeLetterRepetition("hello");
        System.out.println("hello");
        System.out.println(result);

        String result2 = MyStringUtils.removeLetterRepetition("Helló, szia, hogy vagy?");
        System.out.println("Helló, szia, hogy vagy?");
        System.out.println(result2);

        String result3 = MyStringUtils.removeLetterRepetition("Java is good");
        System.out.println("Java is good");
        System.out.println(result3);
    }
}