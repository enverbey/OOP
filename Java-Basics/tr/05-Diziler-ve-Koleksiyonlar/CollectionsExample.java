import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {
    public static void main(String[] args) {
        // 1. ArrayList kullanma
        List<String> fruits = new ArrayList<>();
        fruits.add("Muz");
        fruits.add("Elma");
        fruits.add("Portakal");

        System.out.println("Meyve Listesi: " + fruits);
        Collections.sort(fruits); // Listeyi sıralama
        System.out.println("Sıralanmış Meyve Listesi: " + fruits);

        // 2. HashSet kullanma
        HashSet<String> uniqueFruits = new HashSet<>();
        uniqueFruits.add("Elma");
        uniqueFruits.add("Muz");
        uniqueFruits.add("Elma"); // Tekrar eden giriş (eklenmeyecek)

        System.out.println("Benzersiz Meyve Seti: " + uniqueFruits);

        // 3. HashMap kullanma
        HashMap<String, Integer> fruitCount = new HashMap<>();
        fruitCount.put("Elma", 2);
        fruitCount.put("Muz", 3);
        fruitCount.put("Portakal", 5);

        System.out.println("Meyve Sayısı Haritası: " + fruitCount);

        // 4. HashMap'te değerlere erişim
        System.out.println("Elma sayısı: " + fruitCount.get("Elma"));

        // 5. Koleksiyonlar üzerinde döngü
        System.out.println("HashMap üzerinde döngü:");
        for (String fruit : fruitCount.keySet()) {
            System.out.println(fruit + ": " + fruitCount.get(fruit));
        }

        // 6. Liste ile Koleksiyonlar kullanma
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);

        // Sıralama ve maksimum/minimum bulma
        Collections.sort(numbers);
        System.out.println("Sıralanmış Sayılar: " + numbers);
        System.out.println("Maksimum Sayı: " + Collections.max(numbers));
        System.out.println("Minimum Sayı: " + Collections.min(numbers));
    }
}
