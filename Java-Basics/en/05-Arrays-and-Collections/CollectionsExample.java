import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {
    public static void main(String[] args) {
        // 1. Using ArrayList
        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");

        System.out.println("Fruits List: " + fruits);
        Collections.sort(fruits); // Sorting the list
        System.out.println("Sorted Fruits List: " + fruits);

        // 2. Using HashSet
        HashSet<String> uniqueFruits = new HashSet<>();
        uniqueFruits.add("Apple");
        uniqueFruits.add("Banana");
        uniqueFruits.add("Apple"); // Duplicate entry (won't be added)

        System.out.println("Unique Fruits Set: " + uniqueFruits);

        // 3. Using HashMap
        HashMap<String, Integer> fruitCount = new HashMap<>();
        fruitCount.put("Apple", 2);
        fruitCount.put("Banana", 3);
        fruitCount.put("Orange", 5);

        System.out.println("Fruit Count Map: " + fruitCount);

        // 4. Accessing values in HashMap
        System.out.println("Number of Apples: " + fruitCount.get("Apple"));

        // 5. Looping through collections
        System.out.println("Looping through HashMap:");
        for (String fruit : fruitCount.keySet()) {
            System.out.println(fruit + ": " + fruitCount.get(fruit));
        }

        // 6. Using Collections with a List
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);

        // Sorting and finding max/min
        Collections.sort(numbers);
        System.out.println("Sorted Numbers: " + numbers);
        System.out.println("Max Number: " + Collections.max(numbers));
        System.out.println("Min Number: " + Collections.min(numbers));
    }
}
