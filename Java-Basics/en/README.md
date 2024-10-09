## **06-Input-Output 📁**

This folder focuses on file input and output operations in Java. Understanding how to read from and write to files is essential for any Java developer. In this folder, you'll find two primary examples that demonstrate these concepts: **FileIOExample.java** and **ScannerExample.java**.

### 📜 Contents

1. **FileIOExample.java** 📝
   - This file demonstrates how to perform file operations, including writing data to a file and reading data from it. It utilizes classes such as `BufferedWriter`, `BufferedReader`, and `FileReader`.

   **Example Code:**
   ```java
   // Writing to a file
   BufferedWriter writer = new BufferedWriter(new FileWriter("example.txt"));
   writer.write("Hello, World!");
   writer.newLine(); // Moves to the next line
   writer.write("Welcome to Java File I/O!");
   writer.close(); // Closes the writer to save the changes
   ```

   **Explanation:**
   - **BufferedWriter**: This class is used to write text to a character output stream. It buffers characters to provide efficient writing of single characters, arrays, and strings.
   - **FileWriter**: This class is used to write characters to a file. In this case, it's used to create or open a file named `example.txt`.
   - **write(String str)**: This method writes a string to the file.
   - **newLine()**: This method writes a new line to the file, allowing the next output to start on a new line.
   - **close()**: It’s crucial to close the `BufferedWriter` to ensure all data is flushed and saved to the file.

   **Key Methods:**
   - `write(String str)`: Writes a string to the file.
   - `newLine()`: Writes a new line to the file.

2. **ScannerExample.java** 📖
   - This file showcases how to use the Scanner class to read user input from the console.

   **Example Code:**
   ```java
   Scanner scanner = new Scanner(System.in);
   System.out.print("Enter your age: ");
   int age = scanner.nextInt(); // Reads an integer value from user input
   System.out.println("You are " + age + " years old.");
   scanner.close(); // Close the scanner
   ```

   **Explanation:**
   - **Scanner**: This class is used to get user input. It can parse primitive types and strings using regular expressions.
   - **nextLine()**: This method reads an entire line of text, including spaces. It’s useful for capturing complete user inputs like names or sentences.
   - **nextInt()**: This method reads the next integer from the input. It is important to ensure that the user enters a valid integer.
   - **nextDouble()**: This method reads the next double from the input. Again, it is essential to validate the user input to avoid exceptions.
   - **close()**: Closing the scanner is a good practice to free up resources.

   **Key Methods:**
   - `nextLine()`: Reads a line of text.
   - `nextInt()`: Reads an integer value.
   - `nextDouble()`: Reads a double value.

   **Exercise:**
   - Write a program that asks the user for their name and age, then prints a message including both. You can also extend this exercise by asking for their favorite color and displaying all the information together.
