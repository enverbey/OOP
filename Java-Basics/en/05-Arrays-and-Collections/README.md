# 05-Arrays-and-Collections 📦

This folder contains essential information about arrays and collections in Java. Understanding these concepts is crucial for efficient data handling and manipulation in your Java programs.

### 📝 Contents

1. **ArraysExample.java**: This file provides an introduction to arrays, showing how to create, access, modify, and iterate through arrays. It also includes examples for finding the sum and sorting array elements.

2. **ArrayListExample.java**: This file introduces the `ArrayList`, a dynamic array implementation in Java. You'll learn how to add, access, modify, and remove elements from an `ArrayList`. It also covers important operations like sorting and clearing the list.

3. **HashMapExample.java**: This file explains the usage of `HashMap`, a collection that stores key-value pairs, allowing for efficient retrieval of values based on keys.

4. **CollectionsExample.java**: This file demonstrates the usage of various collection classes in Java, including `ArrayList`, `HashSet`, and `HashMap`, showcasing their functionalities and common operations.

### ⚠️ Important Note for Students:

While **HashMapExample.java** and **CollectionsExample.java** are included in this folder, they may present more advanced concepts. If you find these files challenging, don’t hesitate to move forward with your learning! Focus on the **ArraysExample.java** and **ArrayListExample.java** files first to build a solid foundation.



### 🏗️ Basic Concepts

#### 1. Arrays

- **Definition**: An array is a fixed-size data structure that can store multiple values of the same type. Each element in the array can be accessed using an index.

**Example:**
```java
int[] numbers = {1, 2, 3, 4, 5};
```

- **Common Operations**:
  - **Accessing Elements**: `numbers[0]` retrieves the first element.
  - **Modifying Elements**: `numbers[1] = 10;` changes the second element to 10.
  - **Iterating**: Use a loop to traverse through the array.

#### 2. ArrayList

- **Definition**: An `ArrayList` is a resizable array implementation of the `List` interface. It allows dynamic resizing and is part of the Java Collections Framework.

**Example of Creating an ArrayList:**
```java
ArrayList<String> fruits = new ArrayList<>();
```

- **Common Methods**:
  - **add(element)**: Adds an element to the list.
    ```java
    fruits.add("Apple");
    ```
  - **get(index)**: Retrieves an element at the specified index.
    ```java
    String firstFruit = fruits.get(0);
    ```
  - **set(index, element)**: Modifies an element at the specified index.
    ```java
    fruits.set(1, "Banana");
    ```
  - **remove(element)**: Removes the specified element from the list.
    ```java
    fruits.remove("Apple");
    ```
  - **size()**: Returns the number of elements in the list.
    ```java
    int numberOfFruits = fruits.size();
    ```
  - **clear()**: Removes all elements from the list.
    ```java
    fruits.clear();
    ```

### 🎯 Recommended Exercises:

- **ArraysExample.java**:
  - Create an array of integers and write a program to find the maximum and minimum values.
  - Modify the example to handle user input for the array elements.

- **ArrayListExample.java**:
  - Create an `ArrayList` to store your favorite movies and write methods to add, remove, and display the list.
  - Write a program to count the occurrences of each fruit in a user-defined list.

- **HashMapExample.java**:
  - Write a program that counts the frequency of words in a sentence using a `HashMap`.
  
- **CollectionsExample.java**:
  - Create a list of integers and demonstrate sorting, finding the maximum, and minimum values.

---
