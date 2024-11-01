public class StringMethods {
    public static void main(String[] args) {
        String s = "Java Programming";
        
        // length
        System.out.println("Length: " + s.length());  // 16
        
        // charAt
        System.out.println("Character at index 5: " + s.charAt(5));  // 'P'
        
        // substring
        System.out.println("Substring from index 5: " + s.substring(5));  // "Programming"
        System.out.println("Substring from 5 to 8: " + s.substring(5, 8));  // "Pro"
        
        // toUpperCase and toLowerCase
        System.out.println("Uppercase: " + s.toUpperCase());  // "JAVA PROGRAMMING"
        System.out.println("Lowercase: " + s.toLowerCase());  // "java programming"
        
        // trim
        String s2 = "   Hello   ";
        System.out.println("Trimmed: " + s2.trim());  // "Hello"
        
        // replace
        System.out.println("Replaced a with o: " + s.replace('a', 'o'));  // "Jovo Progromming"
        System.out.println("Replaced Java with Python: " + s.replace("Java", "Python"));  // "Python Programming"
        
        // startsWith and endsWith
        System.out.println("Starts with Java: " + s.startsWith("Java"));  // true
        System.out.println("Ends with Programming: " + s.endsWith("Programming"));  // true
        
        // contains
        System.out.println("Contains 'Prog': " + s.contains("Prog"));  // true
        
        // indexOf and lastIndexOf
        System.out.println("First index of 'a': " + s.indexOf('a'));  // 1
        System.out.println("Last index of 'a': " + s.lastIndexOf('a'));  // 13
        
        // equals and equalsIgnoreCase
        System.out.println("Equals 'Java Programming': " + s.equals("Java Programming"));  // true
        System.out.println("Equals ignore case 'java programming': " + s.equalsIgnoreCase("java programming"));  // true
        
        // isEmpty
        String s3 = "";
        System.out.println("Is empty: " + s3.isEmpty());  // true
        
        // split
        String[] parts = s.split(" ");
        System.out.println("Split into parts: " + parts[0] + ", " + parts[1]);  // "Java", "Programming"
        
        // join
        System.out.println("Joined: " + String.join("-", "Java", "Programming"));  // "Java-Programming"
        
        // toCharArray
        char[] chars = s.toCharArray();
        System.out.println("First char: " + chars[0]);  // 'J'
        
        // format
        System.out.println(String.format("My name is %s and I am %d years old.", "John", 25));  // "My name is John and I am 25 years old."
        
        // valueOf
        System.out.println("Value of 123: " + String.valueOf(123));  // "123"
    }
}
