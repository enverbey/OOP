// DataTypes.java

// This program demonstrates the String class and its common methods in Java

public class DataTypes {

    public static void main(String[] args) {
        // 1. Creating a String
        String name = "John Doe"; // String declaration and initialization

        // 2. Printing the String
        System.out.println("Name: " + name);

        // 3. Common String Methods
        System.out.println("Length of the name: " + name.length()); // Length of the String
        System.out.println("Uppercase: " + name.toUpperCase()); // Convert to uppercase
        System.out.println("Lowercase: " + name.toLowerCase()); // Convert to lowercase
        System.out.println("Substring (0 to 4): " + name.substring(0, 4)); // Get substring from index 0 to 4
        System.out.println("Character at index 2: " + name.charAt(2)); // Get character at index 2
        System.out.println("Contains 'Doe': " + name.contains("Doe")); // Check if it contains "Doe"

        // 4. Concatenation
        String greeting = "Hello, " + name + "!"; // String concatenation
        System.out.println(greeting);
    }
}

// ---------------------------
// Explanation:
// ---------------------------
// What is the String Class?
//
// The String class is a reference type used in Java to represent text data. 
// As one of the fundamental data structures in Java, String objects are 
// used to store and manipulate text (character sequences). Here are some 
// key features of the String class:
//
// 1. Reference Type: The String class is defined as an object, not 
//    like primitive data types (e.g., int, char). This indicates that 
//    String variables point to a location in memory where text data 
//    is stored.
//
// 2. Fixed Size: String objects have a dynamic sizing feature based on 
//    the number of characters they contain. However, once a String 
//    object is created, its content cannot be changed. This means that 
//    if you want to update an existing String object, a new String 
//    object is created.
//
// 3. Built-in Methods: The String class offers a range of built-in 
//    methods for processing text. These methods include obtaining the 
//    length of the text, converting to uppercase or lowercase, 
//    extracting substrings, retrieving specific characters, and 
//    checking for the presence of certain text within the string. 
//    For example:
//    - length(): Returns the length of the string.
//    - toUpperCase(): Converts all characters to uppercase.
//    - substring(int beginIndex, int endIndex): Returns a substring 
//      between the specified indices.
//    - charAt(int index): Returns the character at the specified index.
//    - contains(CharSequence sequence): Checks if the specified 
//      sequence is present in the string.
//
// 4. Immutable: String objects are immutable, meaning that to change 
//    a String object's content, a new object must be created. This 
//    provides better memory management and reduces side effects.
//
// 5. Use Cases: The String class is commonly used in text-based 
//    applications, including user input handling, file reading/writing, 
//    database operations, and many more scenarios that require 
//    managing text data.
//
