// Bu program, Java'da değişkenlerin nasıl tanımlanacağını, başlatılacağını ve kullanılacağını gösterir

public class Variables {

    public static void main(String[] args) {
        // 1. Değişken Tanımlama
        int age; // Yaş isimli bir tamsayı değişkeni tanımlar (4 byte)
        char initial; // Baş harfi temsil eden bir karakter değişkeni tanımlar (2 byte)
        float height; // Boy için bir float değişkeni tanımlar (4 byte)
        double salary; // Maaş için bir double değişkeni tanımlar (8 byte)
        boolean isEmployed; // İstihdam durumunu belirten bir boolean değişkeni tanımlar (1 byte)

        // 2. Değişken Başlatma
        age = 25; // Yaş değişkenine 25 değerini atar
        initial = 'A'; // Baş harfe 'A' değerini atar
        height = 5.9f; // Boy değişkenine float bir değer atar (f eki dikkat edin)
        salary = 50000.50; // Maaş değişkenine bir değer atar
        isEmployed = true; // İstihdam durumunu true yapar

        // 3. Değişkenleri Yazdırma
        System.out.println("Yaş: " + age);
        System.out.println("Baş Harf: " + initial);
        System.out.println("Boy: " + height);
        System.out.println("Maaş: " + salary);
        System.out.println("İstihdam Durumu: " + isEmployed);

        // 4. Değişkenleri Yeniden Atama
        age = 30; // Yaş değişkenine yeni bir değer atar
        System.out.println("Güncellenmiş Yaş: " + age);
    }
}
