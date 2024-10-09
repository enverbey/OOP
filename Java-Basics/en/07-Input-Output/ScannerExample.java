import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting a string input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        // Getting an integer input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("You are " + age + " years old.");

        // Getting a double input
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();
        System.out.println("Your height is " + height + " meters.");

        // Clear the scanner buffer
        scanner.nextLine(); // Consume the leftover newline

        // Getting multiple inputs
        System.out.print("Enter your favorite hobbies (separated by commas): ");
        String hobbies = scanner.nextLine();
        System.out.println("Your hobbies are: " + hobbies);

        scanner.close(); // Close the scanner
    }
}
