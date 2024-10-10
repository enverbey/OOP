/**
 * Bu sınıf, Java'da özel istisnaların nasıl oluşturulacağını ve kullanılacağını gösterir.
 * 
 * Özel bir istisna, kendi hata koşullarınızı tanımlamanıza olanak tanır,
 * böylece kodunuz daha okunabilir ve yönetilebilir hale gelir.
 */
class GeçersizYaşİstisnası extends Exception {
    /**
     * Özel istisna için yapıcı.
     * @param mesaj İstisna ile ilişkilendirilen hata mesajı.
     */
    public GeçersizYaşİstisnası(String mesaj) {
        super(mesaj); // Üst sınıfın yapıcısını çağır
    }
}

public class ÖzelİstisnaÖrneği {
    /**
     * Bu metot verilen yaşın geçerli olup olmadığını kontrol eder.
     * @param yaş Geçerliliği kontrol edilecek yaş.
     * @throws GeçersizYaşİstisnası Eğer yaş negatifse.
     */
    public static void kontrolEtYaş(int yaş) throws GeçersizYaşİstisnası {
        if (yaş < 0) {
            throw new GeçersizYaşİstisnası("Yaş negatif olamaz.");
        } else {
            System.out.println("Yaş geçerli: " + yaş);
        }
    }

    public static void main(String[] args) {
        try {
            kontrolEtYaş(-5); // Bu, GeçersizYaşİstisnası fırlatır
        } catch (GeçersizYaşİstisnası e) {
            System.out.println("Yakalanan istisna: " + e.getMessage());
        }

        // Ek Alıştırma:
        // Verilen bir kullanıcı adının geçerliliğini kontrol eden bir metot oluşturun.
        // Eğer kullanıcı adı boş veya null ise, InvalidUsernameException adında bir özel istisna fırlatın.
        // Bu istisnayı ana metotta yönetin.
    }
}
