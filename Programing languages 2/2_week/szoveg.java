public class szoveg {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = "Java";

        char firstChar = s1.charAt(0);

        String word = "batman";

        String sub1 = word.substring(1, 4);  // "bat"
        String sub2 = word.substring(3);     // "man"
        String sub3 = word.substring(1, 4);  // "atm" (ha az indexek úgy lennének)

        System.out.printf("%s %s %s\n",sub1, sub2, sub3);

        String phrase = "Fallout: New Vegas";
        String sub4 = phrase.substring(3, 6);  // "out"
        String sub5 = phrase.substring(12);    // "Vegas"
        System.out.printf("%s %s\n",sub4, sub5);

        String feeling = "unhappy";
        String sub = feeling.substring(2);  // "happy"
        System.out.printf("%s\n",sub);

        System.out.println(word.toUpperCase().substring(0, 3));
    }
}
