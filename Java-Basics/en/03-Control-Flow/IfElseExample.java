public class IfElseExample {
    public static void main(String[] args) {
        int number = 10;

        // Simple if-else example
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number == 0) {
            System.out.println("The number is zero.");
        } else {
            System.out.println("The number is negative.");
        }

        // Nested if example
        int age = 20;
        if (age > 18) {
            if (age < 25) {
                System.out.println("Age is between 18 and 25.");
            }
        }
    }
}
