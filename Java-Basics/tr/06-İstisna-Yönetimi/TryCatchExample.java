public class DenemeYakalamaÖrneği {
    public static void main(String[] args) {
        try {
            // Sıfıra bölmeyi dene
            int sonuç = 10 / 0;
            System.out.println("Sonuç: " + sonuç);
        } catch (ArithmeticException e) {
            // İstisnayı yakala
            System.out.println("Hata: Sıfıra bölme yapılamaz.");
        } finally {
            // Bu blok her zaman çalışır
            System.out.println("İşlem tamamlandı.");
        }
    }
}

/**
 * Bu sınıf, Java'da try-catch bloklarının kullanımını gösterir.
 * 
 * Try bloğu, bir istisna oluşturabilecek kodu içerir.
 * Bu örnekte, sıfıra bölme işlemi sırasında bir ArithmeticException oluşur.
 * 
 * Catch bloğu, istisnayı yakalar ve programın devam etmesini sağlayarak kullanıcıya dostça bir mesaj sunar.
 * 
 * Finally bloğu, istisna fırlatılıp fırlatılmadığına bakılmaksızın çalışır, bu yüzden temizlik işlemleri için faydalıdır.
 * 
 * Eğer gerekli değilse finally bloğunu eklemeye gerek yoktur.
 */
