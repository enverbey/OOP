## 04-Metodlar ve Fonksiyonlar 🔧

Java'da, yaygın olarak **fonksiyonlar** olarak adlandırdığımız şeyler aslında **metodlar** olarak adlandırılır. Ama neden böyle? 🤔 Bu bölüm, fonksiyonlar ile metodlar arasındaki farkları ele alacak ve Java'da metodları etkili bir şekilde kullanma konusunda sizi yönlendirecektir. Yol boyunca, kendi metodlarınızı yazmayı pratik etmek için örnekler ve alıştırmalar göreceksiniz.

---

### 📝 **Fonksiyon ile Metod Arasındaki Fark Nedir?**

Programlamada "fonksiyon" ve "metod" terimleri genellikle birbirinin yerine kullanılır, ancak ince farklar vardır:

- **Fonksiyon**: Bir fonksiyon, belirli bir görevi yerine getirmek için tasarlanmış bir kod bloğudur. Girdi alabilir (parametreler) ve bir çıktı döndürebilir. Python ve JavaScript gibi dillerde, bağımsız bir fonksiyon, herhangi bir nesne veya sınıfa bağlı olmadan var olabilir.

- **Metod**: Java gibi nesne yönelimli programlama dillerinde, bir **metod**, esasen bir fonksiyondur, ancak her zaman bir sınıf veya nesne ile ilişkilidir. Java'da, bir sınıfın dışında bir fonksiyon olamaz. Bu nedenle, bir sınıf içindeki her fonksiyona **metod** denir.

#### Java'da Basit Bir Metod Örneği:
```java
public class ExampleClass {
    // İki sayının toplamını döndüren metod
    public int addNumbers(int a, int b) {
        return a + b;
    }

    // Bir mesaj yazdıran metod
    public void printMessage() {
        System.out.println("Bu bir metod, bağımsız bir fonksiyon değil.");
    }
}
```

Bu örnekte, hem `addNumbers` hem de `printMessage`, bir sınıf (`ExampleClass`) içinde tanımlandığı için **metodlar**dır. Java'da metodlar, bir sınıfa veya nesneye aittir ve sınıfın örneği kullanılarak veya sınıfa ait statik metodlar olarak çağrılır.

---

### 🔍 **Java'da Neden Onlara Metod Diyoruz?**

Java, **tam anlamıyla nesne yönelimli bir dildir**, bu da her şeyin nesneler ve sınıflar etrafında döndüğü anlamına gelir. Java'da bir fonksiyon, bir sınıfın bağımsız olarak var olamayacağından, bu kod bloklarına **metod** denir.

C veya Python gibi diğer programlama dillerinde, sınıfa bağlı olmayan bağımsız fonksiyonlar olabilir. Örneğin, **C** dilinde şöyle yazabilirsiniz:
```c
int addNumbers(int a, int b) {
    return a + b;
}
```
Bu, C'de bağımsız bir fonksiyondur, ancak Java'da aynı mantık bir sınıfın içinde olmalı, bu da onu bir **metod** haline getirir.

---

### 📋 **Java'daki Metod Türleri**

- **Statik Metodlar**: Bunlar sınıfın kendisine aittir ve sınıfın bir örneği oluşturulmadan çağrılabilir.
  
  ```java
  public class MathUtil {
      public static int square(int num) {
          return num * num;
      }
  }

  public class Main {
      public static void main(String[] args) {
          // Statik bir metod çağrısı
          int result = MathUtil.square(5);
          System.out.println(result);  // Çıktı: 25
      }
  }
  ```

- **Örnek Metodlar**: Bunlar sınıfın bir nesnesine aittir ve çağrılmak için sınıfın bir örneğine ihtiyaç duyar.

  ```java
  public class Person {
      public String getFullName(String firstName, String lastName) {
          return firstName + " " + lastName;
      }
  }

  public class Main {
      public static void main(String[] args) {
          // Bir örnek oluşturarak örnek metod çağrısı
          Person person = new Person();
          String fullName = person.getFullName("John", "Doe");
          System.out.println(fullName);  // Çıktı: John Doe
      }
  }
  ```

---

### 🎯 **Alıştırmalar:**

1. **En Büyük Sayıyı Bulma**  
   Üç tam sayı alan ve en büyük olanını döndüren bir metod yazın.
   ```java
   public static int findMax(int a, int b, int c) {
       int max = a;
       if (b > max) max = b;
       if (c > max) max = c;
       return max;
   }
   ```

2. **Faktöriyel Hesaplama**  
   Verilen bir sayının faktöriyelini hesaplayan bir metod uygulayın (rekürsif olarak).
   ```java
   public static int factorial(int n) {
       if (n == 0) {
           return 1;
       } else {
           return n * factorial(n - 1);
       }
   }
   ```

3. **Bir Dizenin Palindrom Olup Olmadığını Kontrol Etme**  
   Bir dize alan ve eğer dize palindrom ise (ileri ve geri okunduğunda aynı olan) `true`, aksi takdirde `false` döndüren bir metod yazın.
   ```java
   public static boolean isPalindrome(String str) {
       int left = 0;
       int right = str.length() - 1;
       while (left < right) {
           if (str.charAt(left) != str.charAt(right)) {
               return false;
           }
           left++;
           right--;
       }
       return true;
   }
   ```

---

### 🎓 **Sonuç**

Java'da fonksiyonlar her zaman sınıflarla ilişkilidir ve dolayısıyla **metodlar** olarak adlandırılır. Farklı programlama dilleri arasında geçiş yaparken metodlar ile bağımsız fonksiyonlar arasındaki farkı anlamak önemlidir. Metodları etkili bir şekilde kullanarak, daha temiz, daha yeniden kullanılabilir ve modüler kod yazabilirsiniz.
