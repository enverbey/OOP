import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // 1. Creating an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // 2. Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        System.out.println("Fruits: " + fruits);

        // 3. Accessing elements
        System.out.println("First fruit: " + fruits.get(0)); // Output: Apple

        // 4. Modifying elements
        fruits.set(1, "Blueberry"); // Changing Banana to Blueberry
        System.out.println("Modified Fruits: " + fruits);

        // 5. Removing elements
        fruits.remove("Cherry"); // Remove Cherry
        System.out.println("After removal: " + fruits);

        // 6. Checking size
        System.out.println("Number of fruits: " + fruits.size()); // Output: 3

        // 7. Looping through an ArrayList
        System.out.println("Looping through the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 8. Clearing the ArrayList
        fruits.clear();
        System.out.println("After clearing, number of fruits: " + fruits.size()); // Output: 0

        // 9. Adding elements again
        fruits.add("Mango");
        fruits.add("Pineapple");
        System.out.println("Fruits after adding again: " + fruits);
    }
}
