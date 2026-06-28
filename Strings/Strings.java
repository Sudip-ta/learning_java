package Strings;

public class Strings{
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println("Original String: " + str);
        
        // Length of the string
        int length = str.length();
        System.out.println("Length of the string: " + length);
        
        // Convert to uppercase
        String upperStr = str.toUpperCase();
        System.out.println("Uppercase String: " + upperStr);
        
        // Convert to lowercase
        String lowerStr = str.toLowerCase();
        System.out.println("Lowercase String: " + lowerStr);
        
        // Substring
        String subStr = str.substring(7, 12);
        System.out.println("Substring (7, 12): " + subStr);
        
        // Replace characters
        String replacedStr = str.replace('o', '0');
        System.out.println("Replaced String: " + replacedStr);
        
        // Check if string contains a substring
        boolean containsWorld = str.contains("World");
        System.out.println("Contains 'World': " + containsWorld);
    }
}