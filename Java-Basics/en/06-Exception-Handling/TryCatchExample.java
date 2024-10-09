public class TryCatchExample {
    public static void main(String[] args) {
		try {
            // Attempt to divide by zero
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle the exception
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            // This block always executes
            System.out.println("Execution finished.");
        }
    }
}

/**
 * This class demonstrates the use of try-catch blocks in Java.
 * 
 * The try block contains code that might throw an exception. 
 * In this example, an ArithmeticException occurs when attempting 
 * to divide by zero.
 * 
 * The catch block handles the exception, allowing the program 
 * to continue running by providing a user-friendly message.
 * 
 * The finally block executes regardless of whether an exception 
 * was thrown, making it useful for cleanup operations.
 * 
 * You don't have to add finally block if you don't need it.
 */