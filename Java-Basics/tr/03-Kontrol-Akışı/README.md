## 03-Kontrol-Akışı 🚦

Bu klasör, Java'da `if-else`, döngüler (`for`, `while`, `do-while`) ve `switch` gibi kontrol yapıları öğrenmek için temel bir rehber niteliğindedir. 👨‍💻 Bu yapılar, programınızın akışını kontrol etmenize ve belirli koşullara göre kararlar almanıza olanak tanır. Aşağıdaki dosyalar, bu yapıların açıklamalarını ve örneklerini sunmaktadır.

### 📝 İçerik

### 1. IfElseExample.java ❓🔀

**If-else yapısı**, koşullara bağlı olarak farklı işlemler yapmanızı sağlar. Eğer bir koşul doğruysa, belirli bir blok çalıştırılır, aksi takdirde başka bir blok çalıştırılır.

**Örnek Kod:**
```java
int number = 10;

if (number > 0) {
    System.out.println("Sayı pozitiftir.");
} else if (number == 0) {
    System.out.println("Sayı sıfırdır.");
} else {
    System.out.println("Sayı negatiftir.");
}
```

🧑‍🏫 **Açıklama:** Bu örnekte, `if-else` yapısı bir sayının pozitif, negatif veya sıfır olup olmadığını kontrol eder.

🎯 **Alıştırmalar:**
- Bir sayı girişi alan ve sayının pozitif, negatif veya sıfır olduğunu yazdıran bir program yazın.
- Kullanıcının yaşına göre "Çocuk", "Genç" veya "Yetişkin" olduğunu belirleyen bir program yazın.

---

### 2. Loops.java 🔄

**Döngüler**, belirli bir kod bloğunu tekrar tekrar çalıştırmak için kullanılır. Java'da en yaygın kullanılan döngüler `for`, `while` ve `do-while` döngüleridir.

**Örnek Kod (For Döngüsü):**
```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

**Örnek Kod (While Döngüsü):**
```java
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}
```

**Örnek Kod (Do-While Döngüsü):**
```java
int j = 1;
do {
    System.out.println(j);
    j++;
} while (j <= 5);
```

🧑‍🏫 **Açıklama:** `for` döngüsü genellikle tekrar sayısı bilindiğinde kullanılırken, `while` ve `do-while` döngüleri bir koşul doğru olduğu sürece devam eder.

🎯 **Alıştırmalar:**
- 1'den 100'e kadar olan tüm tek sayıları yazdıran bir program yazın.
- Belirli bir sayıya kadar olan tüm sayıların çarpımını hesaplayan bir program yazın.

---

### 3. SwitchExample.java 🔀💡

**Switch yapısı**, bir değişkenin değerine bağlı olarak farklı kod bloklarını çalıştırmanızı sağlar. Bu, birden fazla if-else ifadesine temiz bir alternatif sunar.

**Örnek Kod:**
```java
int day = 3;
switch (day) {
    case 1:
        System.out.println("Pazartesi");
        break;
    case 2:
        System.out.println("Salı");
        break;
    case 3:
        System.out.println("Çarşamba");
        break;
    default:
        System.out.println("Geçersiz gün!");
}
```

🧑‍🏫 **Açıklama:** Bu örnekte, `switch` ifadesi bir sayı girdisine bağlı olarak haftanın gününü yazdırır.

🎯 **Alıştırmalar:**
- Bir ay numarası alarak, hangi mevsime ait olduğunu yazdıran bir program oluşturun.
- Kullanıcıya bir menü sunan ve seçimine göre farklı mesajlar yazdıran bir program geliştirin.

---

### 🌟 Genel Alıştırmalar 🎓
1. **Hesap Makinesi Programı**: Kullanıcıdan iki sayı ve bir işlem (toplama, çıkarma, çarpma, bölme) alarak sonucu hesaplayan bir program yazın.
2. **Döngülerle Desen Çizimi**: Kullanıcıdan bir sayı alarak, `*` karakteri ile bir üçgen veya kare gibi şekiller çizen bir program yazın.