import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // 1. Creating a HashMap
        HashMap<String, Integer> ageMap = new HashMap<>();

        // 2. Adding elements
        ageMap.put("Alice", 25);
        ageMap.put("Bob", 30);
        ageMap.put("Charlie", 35);
        System.out.println("Age Map: " + ageMap);

        // 3. Accessing elements
        System.out.println("Alice's age: " + ageMap.get("Alice")); // Output: 25

        // 4. Modifying elements
        ageMap.put("Bob", 32); // Updating Bob's age
        System.out.println("Updated Age Map: " + ageMap);

        // 5. Removing elements
        ageMap.remove("Charlie"); // Removing Charlie from the map
        System.out.println("After removal: " + ageMap);

        // 6. Checking size
        System.out.println("Number of entries: " + ageMap.size()); // Output: 2

        // 7. Looping through HashMap
        System.out.println("Looping through the HashMap:");
        for (String key : ageMap.keySet()) {
            System.out.println(key + ": " + ageMap.get(key));
        }

        // 8. Clearing the HashMap
        ageMap.clear();
        System.out.println("After clearing, number of entries: " + ageMap.size()); // Output: 0

        // 9. Adding elements again
        ageMap.put("David", 28);
        ageMap.put("Eva", 22);
        System.out.println("Age Map after adding again: " + ageMap);
    }
}
