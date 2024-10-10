## **07-Input-Output 📁**

Bu klasör, Java'da dosya giriş ve çıkış işlemlerine odaklanmaktadır. Dosyaları okumak ve yazmak, herhangi bir Java geliştiricisi için hayati bir beceridir. Bu klasörde, bu kavramları gösteren iki ana örnek bulacaksınız: **FileIOExample.java** ve **ScannerExample.java**.

### 📜 İçindekiler

1. **FileIOExample.java** 📝
   - Bu dosya, bir dosyaya veri yazma ve dosyadan okuma gibi dosya işlemlerini nasıl gerçekleştireceğinizi gösterir. `BufferedWriter`, `BufferedReader` ve `FileReader` gibi sınıfları kullanır.

   **Örnek Kod:**
   ```java
   // Bir dosyaya yazma
   BufferedWriter writer = new BufferedWriter(new FileWriter("example.txt"));
   writer.write("Merhaba, Dünya!");
   writer.newLine(); // Sonraki satıra geçer
   writer.write("Java Dosya G/Ç'ye hoş geldiniz!");
   writer.close(); // Değişiklikleri kaydetmek için yazarın kapatılması önemlidir
   ```

   **Açıklama:**
   - **BufferedWriter**: Bu sınıf, bir karakter çıkış akışına metin yazmak için kullanılır. Tekil karakterler, diziler ve dizgiler için verimli yazım sağlamak amacıyla karakterleri tamponlar.
   - **FileWriter**: Bu sınıf, karakterleri bir dosyaya yazmak için kullanılır. Bu durumda, `example.txt` adında bir dosya oluşturmak veya açmak için kullanılır.
   - **write(String str)**: Bu yöntem, bir dizgiyi dosyaya yazar.
   - **newLine()**: Bu yöntem, dosyaya yeni bir satır yazarak bir sonraki çıktının yeni bir satırda başlamasını sağlar.
   - **close()**: `BufferedWriter`'ın kapatılması, tüm verilerin boşaltılması ve dosyaya kaydedilmesi için kritik öneme sahiptir.

   **Anahtar Yöntemler:**
   - `write(String str)`: Bir dizgiyi dosyaya yazar.
   - `newLine()`: Dosyaya yeni bir satır yazar.

2. **ScannerExample.java** 📖
   - Bu dosya, Scanner sınıfını kullanarak kullanıcıdan konsoldan girdi almayı göstermektedir.

   **Örnek Kod:**
   ```java
   Scanner scanner = new Scanner(System.in);
   System.out.print("Yaşınızı girin: ");
   int age = scanner.nextInt(); // Kullanıcı girdisinden bir tam sayı okur
   System.out.println("Siz " + age + " yaşındasınız.");
   scanner.close(); // Scanner'ı kapat
   ```

   **Açıklama:**
   - **Scanner**: Bu sınıf, kullanıcı girdisi almak için kullanılır. Temel türleri ve dizgileri düzenli ifadeler kullanarak ayrıştırabilir.
   - **nextLine()**: Bu yöntem, metnin tamamını, boşluklar dahil olmak üzere, okur. İsimler veya cümleler gibi tam kullanıcı girdilerini yakalamak için faydalıdır.
   - **nextInt()**: Bu yöntem, girdiden bir sonraki tam sayıyı okur. Kullanıcının geçerli bir tam sayı girdiğinden emin olmak önemlidir.
   - **nextDouble()**: Bu yöntem, girdiden bir sonraki double değerini okur. Yine, istisnaları önlemek için kullanıcı girdisini doğrulamak gereklidir.
   - **close()**: Scanner'ı kapatmak, kaynakları serbest bırakmak için iyi bir uygulamadır.

   **Anahtar Yöntemler:**
   - `nextLine()`: Bir metin satırını okur.
   - `nextInt()`: Bir tam sayı değerini okur.
   - `nextDouble()`: Bir double değerini okur.

   **Alıştırma:**
   - Kullanıcıdan adını ve yaşını sormak için bir program yazın, ardından her ikisini de içeren bir mesaj yazdırın. Bu alıştırmayı, kullanıcıdan favori rengini sormak ve tüm bilgileri birlikte görüntülemek üzere genişletebilirsiniz. 

---
