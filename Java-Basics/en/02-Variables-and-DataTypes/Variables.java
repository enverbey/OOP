// Variables.java

// This program demonstrates how to declare, initialize, and use variables in Java

public class Variables {

    public static void main(String[] args) {
        // 1. Declaring Variables
        int age; // Declares an integer variable named age (4 bytes)
        char initial; // Declares a character variable named initial (2 bytes)
        float height; // Declares a float variable named height (4 bytes)
        double salary; // Declares a double variable named salary (8 bytes)
        boolean isEmployed; // Declares a boolean variable named isEmployed (1 byte)

        // 2. Initializing Variables
        age = 25; // Assigns the value 25 to the age variable
        initial = 'A'; // Assigns the character 'A' to initial
        height = 5.9f; // Assigns a float value to height (notice the 'f' suffix)
        salary = 50000.50; // Assigns a salary value
        isEmployed = true; // Sets isEmployed to true

        // 3. Printing Variables
        System.out.println("Age: " + age);
        System.out.println("Initial: " + initial);
        System.out.println("Height: " + height);
        System.out.println("Salary: " + salary);
        System.out.println("Employed: " + isEmployed);

        // 4. Reassigning Variables
        age = 30; // Reassigns a new value to age
        System.out.println("Updated Age: " + age);
    }
}

// ---------------------------
// Explanation:
// ---------------------------
// What are Variables in Java?
//
// Variables are used to store data in a program. In Java, a variable 
// is a container that holds data that can be changed during the 
// execution of the program. Here are some key points about variables:
//
// 1. Declaration: Variables must be declared before they can be used. 
//    A declaration specifies the variable's type (e.g., int, char) 
//    and its name (e.g., age, initial).
//
// 2. Initialization: After declaration, a variable can be initialized 
//    (assigned a value). Initialization can be done at the time of 
//    declaration or later in the code.
//
// 3. Data Types: Each variable has a data type that determines what 
//    kind of data it can hold (e.g., integers, characters, floating-
//    point numbers, booleans).
//
// 4. Scope: The scope of a variable defines where it can be accessed 
//    in the program. Variables declared inside a method are local to 
//    that method and cannot be accessed outside of it.
//
// 5. Reassignment: Variables can be reassigned new values after 
//    their initial assignment, allowing for dynamic data handling 
//    within a program.
// 
// Understanding how to use variables is fundamental in Java and 
// essential for building effective applications.
// 
