// Bu program, Java'da String sınıfını ve yaygın metotlarını gösterir

public class DataTypes {

    public static void main(String[] args) {
        // 1. String oluşturma
        String name = "John Doe"; // String tanımı ve başlatılması

        // 2. String'i yazdırma
        System.out.println("İsim: " + name);

        // 3. Yaygın String Metotları
        System.out.println("İsmin uzunluğu: " + name.length()); // String'in uzunluğu
        System.out.println("Büyük harf: " + name.toUpperCase()); // Büyük harfe çevirme
        System.out.println("Küçük harf: " + name.toLowerCase()); // Küçük harfe çevirme
        System.out.println("Alt dize (0'dan 4'e): " + name.substring(0, 4)); // 0 ile 4 arasındaki alt dizeyi alır
        System.out.println("2. indeksteki karakter: " + name.charAt(2)); // 2. indeksteki karakteri alır
        System.out.println("Doe içeriyor mu?: " + name.contains("Doe")); // "Doe" içerip içermediğini kontrol eder

        // 4. Birleştirme
        String greeting = "Merhaba, " + name + "!"; // String birleştirme
        System.out.println(greeting);
    }
}
