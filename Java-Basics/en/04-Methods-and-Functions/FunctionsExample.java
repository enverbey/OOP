public class FunctionsExample {
    // Method without return value (void)
    public static void printGreeting() {
        System.out.println("Hello, welcome to the Methods and Functions tutorial!");
    }

    // Method with return value
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    // Method with multiple parameters
    public static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {
        // Calling a method without return value
        printGreeting();

        // Calling a method with return value
        int sum = addNumbers(5, 10);
        System.out.println("The sum of 5 and 10 is: " + sum);

        // Calling a method with multiple parameters
        String fullName = getFullName("John", "Doe");
        System.out.println("Full Name: " + fullName);
    }
}
