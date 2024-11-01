public class MyStringUtils {
    public static String removeLetterRepetition(String string) {
        char[] charArray = string.toCharArray();

        String result = "";

        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];

            if (c == ' ' || !containsChar(result, c)) {
                result = result + c;
            }
        }
        return result;
    }

    public static boolean containsChar(String s, char res) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (res == c) {
                return true;
            }
        }
        return false;
    }
}
