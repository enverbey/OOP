## 03-Control-Flow 🚦

This folder serves as a basic guide for learning control structures in Java such as `if-else`, loops (`for`, `while`, `do-while`), and `switch`. 👨‍💻 These structures allow you to control the flow of your program and make decisions based on specific conditions. The following files provide examples and exercises to explain these structures.

### 📝 Contents

### 1. IfElseExample.java ❓🔀

The **if-else structure** allows for performing different actions based on conditions. If a condition is true, a specific block is executed, otherwise another block runs.

**Example Code:**
```java
int number = 10;

if (number > 0) {
    System.out.println("The number is positive.");
} else if (number == 0) {
    System.out.println("The number is zero.");
} else {
    System.out.println("The number is negative.");
}
```

🧑‍🏫 **Explanation:** In this example, the `if-else` structure checks whether a number is positive, negative, or zero.

🎯 **Exercise:**
- Write a program that takes a number as input and prints whether it's positive, negative, or zero.
- Write a program that determines if the user is a "Child," "Teenager," or "Adult" based on their age.

---

### 2. Loops.java 🔄

**Loops** are used to repeatedly execute a block of code. The most common loops in Java are `for`, `while`, and `do-while`.

**Example Code (For Loop):**
```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

**Example Code (While Loop):**
```java
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}
```

**Example Code (Do-While Loop):**
```java
int j = 1;
do {
    System.out.println(j);
    j++;
} while (j <= 5);
```

🧑‍🏫 **Explanation:** The `for` loop is often used when the number of iterations is known, while `while` and `do-while` loops continue as long as a condition is true.

🎯 **Exercise:**
- Write a program that prints all odd numbers from 1 to 100.
- Write a program that calculates the product of all numbers up to a given number.

---

### 3. SwitchExample.java 🔀💡

The **switch structure** allows for executing different code blocks based on the value of a variable. It provides a cleaner alternative to multiple if-else statements.

**Example Code:**
```java
int day = 3;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Invalid day!");
}
```

🧑‍🏫 **Explanation:** In this example, the `switch` statement prints the day of the week based on the number input.

🎯 **Exercise:**
- Create a program that asks for a month number and prints the corresponding season.
- Develop a program that presents a menu to the user and prints different messages based on their selection.

---

### 🌟 General Exercises 🎓
1. **Calculator Program**: Write a program that takes two numbers and an operation (addition, subtraction, multiplication, division) from the user and calculates the result.
2. **Pattern Drawing with Loops**: Ask the user for a number and draw shapes (like a triangle or a square) using the `*` character based on the input.

