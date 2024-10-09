## 06-Exception-Handling 🚫

This folder focuses on exception handling in Java, which is crucial for developing robust applications. Exceptions are events that disrupt the normal flow of a program's execution. Understanding how to handle these exceptions helps ensure that your program can respond gracefully to errors. Below are the provided files, their functionalities, and relevant exercises.

Note: You may not be familiar with inheritance concepts yet. If you find the CustomExceptionExample.java file challenging to understand, do not spend too much time on it—feel free to move on and revisit it later.

### Files and Functionality

#### 1. TryCatchExample.java 🛠️

This class demonstrates the use of try-catch blocks to handle exceptions gracefully.

**Key Features:**
- **Try Block**: Contains code that might throw an exception. In this example, an attempt is made to divide by zero, which results in an `ArithmeticException`.
- **Catch Block**: Handles the exception by providing a user-friendly message.
- **Finally Block**: Executes regardless of whether an exception was thrown, allowing for cleanup operations (e.g., closing resources).

**Example Code:**
```java
int result = 10 / 0; // This line will throw ArithmeticException
```

**Exercise:**
- Modify the code to ask the user for input instead of hardcoding the number. Handle any potential exceptions that may arise from user input.

---

#### 2. CustomExceptionExample.java 🧑‍💼

This class illustrates how to create and use custom exceptions in Java.

**Key Features:**
- **Custom Exception Class**: Defines `InvalidAgeException` to handle specific error conditions related to age validation.
- **Throwing Custom Exceptions**: The `checkAge` method checks the age and throws the custom exception if the age is invalid.

**Example Code:**
```java
if (age < 0) {
    throw new InvalidAgeException("Age cannot be negative.");
}
```

**Exercise:**
- Implement a new method to validate usernames, throwing an `InvalidUsernameException` if the username is empty or null.

---

### Conclusion

Understanding exception handling is essential for creating resilient applications. By implementing try-catch blocks and defining custom exceptions, you can enhance the user experience by preventing abrupt program termination and providing meaningful feedback.
