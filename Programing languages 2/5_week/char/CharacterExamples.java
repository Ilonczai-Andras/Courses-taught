public class CharacterExamples {
    public static void main(String[] args) {
        // Character.isDigit() példa
        char c1 = '5';
        System.out.println("isDigit('5'): " + Character.isDigit(c1)); // true

        // Character.isLetter() példa
        char c2 = 'a';
        System.out.println("isLetter('a'): " + Character.isLetter(c2)); // true

        // Character.isLetterOrDigit() példa
        char c3 = '!';
        System.out.println("isLetterOrDigit('!'): " + Character.isLetterOrDigit(c3)); // false

        // Character.isLowerCase() és Character.isUpperCase() példa
        char c4 = 'B';
        System.out.println("isLowerCase('B'): " + Character.isLowerCase(c4)); // false
        System.out.println("isUpperCase('B'): " + Character.isUpperCase(c4)); // true

        // Character.toLowerCase() és Character.toUpperCase() példa
        char c5 = 'D';
        System.out.println("toLowerCase('D'): " + Character.toLowerCase(c5)); // 'd'
        char c6 = 'm';
        System.out.println("toUpperCase('m'): " + Character.toUpperCase(c6)); // 'M'

        // Character.isWhitespace() példa
        char c7 = ' ';
        System.out.println("isWhitespace(' '): " + Character.isWhitespace(c7)); // true

        // Character.getNumericValue() példa
        char c8 = '9';
        System.out.println("getNumericValue('9'): " + Character.getNumericValue(c8)); // 9

        // Character.isAlphabetic() példa
        char c9 = 'Z';
        System.out.println("isAlphabetic('Z'): " + Character.isAlphabetic(c9)); // true

        // Character.compare() példa
        char c10 = 'a';
        char c11 = 'b';
        System.out.println("compare('a', 'b'): " + Character.compare(c10, c11)); // -1
    }
}

// Gyakorló feladatok:
// 1. Feladat: Írj egy metódust, amely megvizsgálja, hogy egy adott karakter számjegy-e vagy sem!
// Megoldás:
/*public class Practice1 {
    public static boolean isDigit(char ch) {
        return Character.isDigit(ch);
    }

    public static void main(String[] args) {
        System.out.println(isDigit('5')); // true
        System.out.println(isDigit('a')); // false
    }
}

// 2. Feladat: Írj egy metódust, amely kisbetűből nagybetűt csinál, ha a karakter betű!
// Megoldás:
public class Practice2 {
    public static char toUpperCaseIfLetter(char ch) {
        if (Character.isLetter(ch)) {
            return Character.toUpperCase(ch);
        }
        return ch;
    }

    public static void main(String[] args) {
        System.out.println(toUpperCaseIfLetter('a')); // 'A'
        System.out.println(toUpperCaseIfLetter('1')); // '1'
    }
}

// 3. Feladat: Írj egy metódust, amely megvizsgálja, hogy a megadott karakter szóköz-e!
// Megoldás:
public class Practice3 {
    public static boolean isWhitespace(char ch) {
        return Character.isWhitespace(ch);
    }

    public static void main(String[] args) {
        System.out.println(isWhitespace(' ')); // true
        System.out.println(isWhitespace('a')); // false
    }
}*/