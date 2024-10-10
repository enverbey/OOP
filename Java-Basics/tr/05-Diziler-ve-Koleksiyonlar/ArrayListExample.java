import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // 1. Bir ArrayList oluşturma
        ArrayList<String> fruits = new ArrayList<>();

        // 2. Eleman ekleme
        fruits.add("Elma");
        fruits.add("Muz");
        fruits.add("Kiraz");
        fruits.add("Hurma");
        System.out.println("Meyveler: " + fruits);

        // 3. Elemanlara erişim
        System.out.println("İlk meyve: " + fruits.get(0)); // Çıktı: Elma

        // 4. Elemanları değiştirme
        fruits.set(1, "Yaban Mersini"); // Muz'u Yaban Mersini ile değiştirme
        System.out.println("Değiştirilmiş Meyveler: " + fruits);

        // 5. Elemanları kaldırma
        fruits.remove("Kiraz"); // Kiraz'ı kaldırma
        System.out.println("Kaldırdıktan sonra: " + fruits);

        // 6. Boyutu kontrol etme
        System.out.println("Meyve sayısı: " + fruits.size()); // Çıktı: 3

        // 7. ArrayList üzerinde döngü
        System.out.println("Liste üzerinde döngü:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 8. ArrayList'i temizleme
        fruits.clear();
        System.out.println("Temizledikten sonra, meyve sayısı: " + fruits.size()); // Çıktı: 0

        // 9. Tekrar eleman ekleme
        fruits.add("Mango");
        fruits.add("Ananas");
        System.out.println("Tekrar ekledikten sonra meyveler: " + fruits);
    }
}
