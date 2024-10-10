public class ArraysExample {
    public static void main(String[] args) {
        // 1. Bir dizi oluşturma
        int[] numbers = {1, 2, 3, 4, 5};
        
        // 2. Bir dizideki elemanlara erişim
        System.out.println("İlk eleman: " + numbers[0]);  // Çıktı: 1
        System.out.println("İkinci eleman: " + numbers[1]); // Çıktı: 2
        
        // 3. Elemanları değiştirme
        numbers[2] = 10; // Üçüncü elemanı değiştirme
        System.out.println("Değiştirilmiş üçüncü eleman: " + numbers[2]); // Çıktı: 10

        // 4. Dizi uzunluğu
        System.out.println("Dizi uzunluğu: " + numbers.length); // Çıktı: 5

        // 5. Bir dizi üzerinde döngü
        System.out.println("Dizi elemanları:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // 6. Dizi elemanlarının toplamını bulma
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Dizi elemanlarının toplamı: " + sum); // Çıktı: 18

        // 7. Dizi sıralama örneği
        int[] unsortedArray = {5, 3, 2, 4, 1};
        java.util.Arrays.sort(unsortedArray);
        System.out.println("Sıralanmış dizi:");
        for (int num : unsortedArray) {
            System.out.println(num);
        }
    }
}
