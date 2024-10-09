public class ArraysExample {
    public static void main(String[] args) {
        // 1. Creating an array
        int[] numbers = {1, 2, 3, 4, 5};
        
        // 2. Accessing elements in an array
        System.out.println("First element: " + numbers[0]);  // Output: 1
        System.out.println("Second element: " + numbers[1]); // Output: 2
        
        // 3. Modifying elements
        numbers[2] = 10; // Changing the third element
        System.out.println("Modified third element: " + numbers[2]); // Output: 10

        // 4. Array Length
        System.out.println("Array length: " + numbers.length); // Output: 5

        // 5. Looping through an array
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // 6. Finding the sum of array elements
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of array elements: " + sum); // Output: 18

        // 7. Array sorting example
        int[] unsortedArray = {5, 3, 2, 4, 1};
        java.util.Arrays.sort(unsortedArray);
        System.out.println("Sorted array:");
        for (int num : unsortedArray) {
            System.out.println(num);
        }
    }
}
