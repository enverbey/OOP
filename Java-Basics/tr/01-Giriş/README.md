# 🚀 Java Giriş

**Java Temel Bilgileri** deposuna hoş geldiniz! Bu bölümde, Java'nın temellerini, ortamınızı nasıl kuracağınızı ve ilk Java programınızı nasıl yazacağınızı ele alacağız.

---

## 🤔 Neden Java?

Java, **yüksek seviyeli, nesne yönelimli bir programlama dili** olup, **güçlü ve ölçeklenebilir uygulamalar** oluşturmak için yaygın olarak kullanılır. Java'nın bu kadar popüler olmasının ana nedenlerinden biri, platform bağımsızlığıdır. Java kodu, **Java Sanal Makinesi (JVM)**'yi destekleyen **herhangi bir makinede** çalıştırılabilir; yani kodunuzu bir kez yazıp her yerde çalıştırabilirsiniz!

Java, 1995 yılında Sun Microsystems (şu anda Oracle'ın bir parçası) tarafından tanıtıldı. İlk çıktığında, **platform bağımsızlığı** özelliği C/C++ gibi rakip dillerin aksine devrim niteliğindeydi. O zamanlarda farklı işletim sistemleri için ayrı sürümler yazmak gerekiyordu, fakat Java ile tek bir kod her yerde çalışabiliyordu.

Java'nın sunduğu avantajlar şunlardır:
- 🏆 **En Yaygın Kullanılan Dil**: Java, dünya genelinde en çok kullanılan programlama dillerinden biridir ve web uygulamalarından mobil ve masaüstü çözümlere kadar her alanda kullanılır.
- 🔧 **Otomatik Bellek Yönetimi**: Java'nın öne çıkan özelliklerinden biri, **otomatik bellek yönetimi (Çöp Toplayıcı - Garbage Collection)** özelliğidir. C/C++ gibi dillerde belleği manuel olarak yönetmeniz gerekirken, Java bunu sizin yerinize yapar. Bu da geliştiriciliği kolaylaştırır ve bellekle ilgili hataları (örneğin bellek sızıntıları) önlemeye yardımcı olur. Bu konuyu dersin ilerleyen bölümlerinde daha ayrıntılı olarak ele alacağız.
- 📚 **Güçlü Ekosistem**: Java, geliştiriciliği daha kolay, hızlı ve güvenilir hale getiren zengin bir kütüphane, çerçeve ve araç setine sahiptir.

## 🛠️ Java'yı Kurmak

1. **JDK'yı (Java Geliştirme Kiti) Kurun**: [Oracle'ın resmi web sitesinden](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) veya [OpenJDK](https://openjdk.java.net/) üzerinden JDK'yı indirebilirsiniz. `JAVA_HOME` ortam değişkenini doğru şekilde ayarladığınızdan emin olun.
2. **Bir IDE Seçin**: Verimli geliştirme için [IntelliJ IDEA](https://www.jetbrains.com/idea/download/) veya [VS Code](https://code.visualstudio.com/) gibi popüler IDE'leri kullanmanızı öneririz.

---

## 👨‍💻 Hello World Programı

Aşağıda basit bir **Hello World** programı örneği verilmiştir:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### 🧐 Kod Açıklaması:

1. **`public class HelloWorld`**:
   - **`public`**: Bu erişim belirleyicisi, sınıfın başka sınıflar tarafından erişilebileceğini ifade eder. Java'da sınıflar `public`, `private` veya `protected` olarak tanımlanabilir.
   - **`class`**: Bu anahtar kelime, bir sınıfı bildirmek için kullanılır. Bir sınıf, nesnelerin özelliklerini ve davranışlarını tanımlayan bir şablondur.
   - **`HelloWorld`**: Bu, sınıfın adıdır. Java'da sınıf isimleri büyük harfle başlamalıdır.

2. **`public static void main(String[] args)`**:
   - **`public`**: Bu, metodun sınıf dışından çağrılabileceğini ifade eder. `main` metodu, JVM'in programı çalıştırabilmesi için `public` olmalıdır.
   - **`static`**: Bu, metodun sınıfa ait olduğunu ve sınıfın bir örneği oluşturulmadan çağrılabileceğini ifade eder.
   - **`void`**: Bu, metodun herhangi bir değer döndürmediğini belirtir.
   - **`main`**: Java uygulamalarının giriş noktası olan metodun adıdır. JVM, programı çalıştırırken `main` metodunu arar.
   - **`String[] args`**: Bu, komut satırından programa geçirilebilecek `String` argümanlarının bir dizisidir.

### 🖥️ Programın İşleyişi:

- **`System`**: `java.lang` paketindeki **System** sınıfını ifade eder. Bu sınıf, standart giriş, çıkış ve hata akışlarına erişim sağlar.
- **`out`**: `System` sınıfının statik bir alanıdır ve konsola çıkış yapmak için kullanılır.
- **`println`**: Bir mesajı yazdırıp yeni bir satıra geçmeyi sağlayan `PrintStream` sınıfının bir metodudur.

---

## 🎯 Sırada Ne Var?

Bir sonraki bölümde **Java değişkenleri ve veri türleri** konusuna dalacağız. Veri depolama ve işleme yöntemlerini keşfetmeye başlayacağız. Bizi izlemeye devam edin!
