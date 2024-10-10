
# 06-İstisna Yönetimi 📌

Bu klasör, Java'da istisna yönetimi hakkında temel bilgileri içermektedir. İstisna yönetimi, programınızdaki hataları ele almanıza ve daha dayanıklı bir kod yazmanıza olanak tanır.

### 📝 İçindekiler

1. **CustomExceptionExample.java**: Bu dosya, Java'da özel istisnaların nasıl oluşturulacağını ve kullanılacağını gösterir. Özel bir istisna tanımlamak, kendi hata koşullarınızı belirlemenizi sağlar ve kodunuzun daha okunabilir ve yönetilebilir olmasına yardımcı olur.

2. **TryCatchExample.java**: Bu dosya, Java'da try-catch bloklarının kullanımını açıklamaktadır. Burada, sıfıra bölme işlemi sırasında bir `ArithmeticException` hatası oluşur ve bu hata try-catch bloğu ile yakalanır.

### ⚠️ Önemli Not:

Özel istisnalar, belirli hata koşullarını tanımlamak için kullanılır ve hata mesajlarının özelleştirilmesine olanak tanır. Try-catch blokları ise programın belirli bir bölümünde oluşabilecek hataları yönetmek için kullanılır.

### 🏗️ Temel Kavramlar

#### 1. Özel İstisnalar

- **Tanım**: Özel istisnalar, programınızda belirli hata koşullarını temsil eden kendi istisna sınıflarınızı oluşturmanıza olanak tanır.

**Örnek:**
```java
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
```

- **Kullanım**:
  - `checkAge(int age)` metodu, yaşın geçerliliğini kontrol eder ve geçersizse özel bir istisna fırlatır.
  
```java
try {
    checkAge(-5); // Bu, InvalidAgeException'ı fırlatır
} catch (InvalidAgeException e) {
    System.out.println("Yakalanan istisna: " + e.getMessage());
}
```

#### 2. Try-Catch Blokları

- **Tanım**: Try-catch blokları, belirli bir kod bloğunda oluşabilecek hataları yakalamak ve yönetmek için kullanılır.

**Örnek:**
```java
try {
    int result = 10 / 0; // Sıfıra bölme işlemi
} catch (ArithmeticException e) {
    System.out.println("Hata: Sıfıra bölme yapılamaz.");
} finally {
    System.out.println("İşlem tamamlandı.");
}
```

- **Kullanım**:
  - Try bloğunda hata olabilecek kod yer alır. Catch bloğu ise bu hatayı yakalayarak programın devam etmesini sağlar.

### 🎯 Tavsiye Edilen Alıştırmalar:

- **CustomExceptionExample.java**:
  - Verilen bir kullanıcı adının geçerliliğini kontrol eden bir metot oluşturun. Eğer kullanıcı adı boş veya null ise, `InvalidUsernameException` adında bir özel istisna fırlatın. Bu istisnayı ana metodda yönetin.

- **TryCatchExample.java**:
  - Kullanıcıdan iki sayı alarak bölme işlemi yapmayı deneyin ve sıfıra bölme hatası durumunda uygun bir hata mesajı verin.

--- 
