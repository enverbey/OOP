import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // 1. Bir HashMap oluşturma
        HashMap<String, Integer> ageMap = new HashMap<>();

        // 2. Eleman ekleme
        ageMap.put("Alice", 25);
        ageMap.put("Bob", 30);
        ageMap.put("Charlie", 35);
        System.out.println("Yaş Haritası: " + ageMap);

        // 3. Elemanlara erişim
        System.out.println("Alice'in yaşı: " + ageMap.get("Alice")); // Çıktı: 25

        // 4. Elemanları değiştirme
        ageMap.put("Bob", 32); // Bob'un yaşını güncelleme
        System.out.println("Güncellenmiş Yaş Haritası: " + ageMap);

        // 5. Elemanları kaldırma
        ageMap.remove("Charlie"); // Haritadan Charlie'yi kaldırma
        System.out.println("Kaldırdıktan sonra: " + ageMap);

        // 6. Boyutu kontrol etme
        System.out.println("Girdi sayısı: " + ageMap.size()); // Çıktı: 2

        // 7. HashMap üzerinde döngü
        System.out.println("HashMap üzerinde döngü:");
        for (String key : ageMap.keySet()) {
            System.out.println(key + ": " + ageMap.get(key));
        }

        // 8. HashMap'i temizleme
        ageMap.clear();
        System.out.println("Temizledikten sonra, girdi sayısı: " + ageMap.size()); // Çıktı: 0

        // 9. Tekrar eleman ekleme
        ageMap.put("David", 28);
        ageMap.put("Eva", 22);
        System.out.println("Tekrar ekledikten sonra Yaş Haritası: " + ageMap);
    }
}
