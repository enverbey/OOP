## 04-Methods-and-Functions 🔧

In Java, what we commonly refer to as **functions** are actually called **methods**. But why is that? 🤔 This section will cover the differences between functions and methods and guide you through how to use methods effectively in Java. Along the way, you'll see examples and exercises to practice writing your own methods.

---

### 📝 **What is the Difference Between a Function and a Method?**

In programming, the terms "function" and "method" are often used interchangeably, but there are subtle differences:

- **Function**: A function is a block of code designed to perform a particular task. It can take input (parameters) and may return an output. In languages like Python and JavaScript, a standalone function can exist without being tied to any object or class.
  
- **Method**: In object-oriented programming languages like Java, a **method** is essentially a function, but it is always associated with a class or an object. You can't have a function outside a class in Java. Hence, every function inside a class is referred to as a **method**.

#### Example of a Simple Method in Java:
```java
public class ExampleClass {
    // Method that returns the sum of two numbers
    public int addNumbers(int a, int b) {
        return a + b;
    }

    // Method that prints a message
    public void printMessage() {
        System.out.println("This is a method, not a standalone function.");
    }
}
```

In this example, both `addNumbers` and `printMessage` are **methods** because they are defined within a class (`ExampleClass`). In Java, methods belong to a class or an object, and you call them using the instance of that class or as static methods if they belong to the class itself.

---

### 🔍 **Why Do We Call Them Methods in Java?**

Java is a **pure object-oriented language**, meaning everything revolves around objects and classes. Since a function cannot exist independently of a class in Java, the language refers to these blocks of code as **methods**.

In other programming languages, like **C** or **Python**, you can have standalone functions that are not tied to a class. For instance, in **C**, you can write:
```c
int addNumbers(int a, int b) {
    return a + b;
}
```
This is a standalone function in C, but in Java, the same logic has to be inside a class, turning it into a **method**.

---

### 📋 **Types of Methods in Java**

- **Static Methods**: These belong to the class itself and can be called without creating an instance of the class.
  
  ```java
  public class MathUtil {
      public static int square(int num) {
          return num * num;
      }
  }

  public class Main {
      public static void main(String[] args) {
          // Calling a static method
          int result = MathUtil.square(5);
          System.out.println(result);  // Output: 25
      }
  }
  ```

- **Instance Methods**: These belong to an object of the class and require an instance of the class to be called.

  ```java
  public class Person {
      public String getFullName(String firstName, String lastName) {
          return firstName + " " + lastName;
      }
  }

  public class Main {
      public static void main(String[] args) {
          // Creating an object to call an instance method
          Person person = new Person();
          String fullName = person.getFullName("John", "Doe");
          System.out.println(fullName);  // Output: John Doe
      }
  }
  ```

---

### 🎯 **Exercises:**

1. **Find the Maximum Number**  
   Write a method that takes three integers and returns the maximum of the three.
   ```java
   public static int findMax(int a, int b, int c) {
       int max = a;
       if (b > max) max = b;
       if (c > max) max = c;
       return max;
   }
   ```

2. **Calculate Factorial**  
   Implement a method that calculates the factorial of a given number using recursion.
   ```java
   public static int factorial(int n) {
       if (n == 0) {
           return 1;
       } else {
           return n * factorial(n - 1);
       }
   }
   ```

3. **Check if a String is a Palindrome**  
   Write a method that takes a string and returns `true` if the string is a palindrome (reads the same forwards and backwards), and `false` otherwise.
   ```java
   public static boolean isPalindrome(String str) {
       int left = 0;
       int right = str.length() - 1;
       while (left < right) {
           if (str.charAt(left) != str.charAt(right)) {
               return false;
           }
           left++;
           right--;
       }
       return true;
   }
   ```

---

### 🎓 **Conclusion**

In Java, functions are always associated with classes and thus referred to as **methods**. Understanding the difference between methods and standalone functions is important when transitioning between different programming languages. By using methods effectively, you can write cleaner, more reusable, and modular code.