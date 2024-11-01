
public class MyStringUtils {

    public static String removeLetterRepetition(String string)
    {
        char[] charArray = string.toCharArray();

        String result = "";

        for (int i = 0; i < charArray.length; i++) 
        {   
             char c = charArray[i];

            if (c == ' ' || !containsChar(result, c)) 
            {   
                result = result + c;
            }
    
        }

        return result;
    }

    public static boolean containsChar(String array, char res)
    {
        for (int index = 0; index < array.length(); index++) 
        {  
            char c = array.charAt(index);

            if (c == res) 
            {
                return true;
            }

        }
        return false;
    }

}
