/**
 * This class demonstrates how to create and use custom exceptions in Java.
 * 
 * A custom exception allows you to define your own error conditions, 
 * making your code more readable and manageable.
 */
class InvalidAgeException extends Exception {
    /**
     * Constructor for the custom exception.
     * @param message The error message associated with the exception.
     */
    public InvalidAgeException(String message) {
        super(message); // Call the constructor of the superclass
    }
}

public class CustomExceptionExample {
    /**
     * This method checks if the given age is valid.
     * @param age The age to be validated.
     * @throws InvalidAgeException If the age is negative.
     */
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative.");
        } else {
            System.out.println("Age is valid: " + age);
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(-5); // This will throw an InvalidAgeException
        } catch (InvalidAgeException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        // Additional Exercise:
        // Create a method that checks if a given username is valid. 
        // If the username is empty or null, throw a custom exception 
        // called InvalidUsernameException. Handle this exception in the main method.
    }
}
