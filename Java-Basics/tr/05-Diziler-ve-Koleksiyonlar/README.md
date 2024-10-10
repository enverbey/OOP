# 05-Diziler ve Koleksiyonlar 📦

Bu klasör, Java'daki diziler ve koleksiyonlar hakkında temel bilgileri içermektedir. Bu kavramları anlamak, Java programlarınızda verileri verimli bir şekilde yönetmek ve manipüle etmek için kritik öneme sahiptir.

### 📝 İçindekiler

1. **ArraysExample.java**: Bu dosya dizilere giriş sağlar; dizilerin nasıl oluşturulacağını, erişileceğini, değiştirileceğini ve üzerinde döngü kurulacağını gösterir. Ayrıca, dizi elemanlarının toplamını bulma ve sıralama örneklerini içerir.

2. **ArrayListExample.java**: Bu dosya, Java'daki dinamik dizi uygulaması olan `ArrayList`'i tanıtır. `ArrayList`'te eleman eklemeyi, erişmeyi, değiştirmeyi ve kaldırmayı öğrenirsiniz. Ayrıca, sıralama ve listeyi temizleme gibi önemli işlemleri de kapsar.

3. **HashMapExample.java**: Bu dosya, anahtar-değer çiftlerini depolayan ve anahtarlar üzerinden değerlerin verimli bir şekilde erişimini sağlayan `HashMap` kullanımını açıklar.

4. **CollectionsExample.java**: Bu dosya, Java'daki çeşitli koleksiyon sınıflarının kullanımını gösterir; `ArrayList`, `HashSet` ve `HashMap` gibi sınıfların işlevselliklerini ve yaygın işlemlerini sergiler.

### ⚠️ Öğrenciler için Önemli Not:

**HashMapExample.java** ve **CollectionsExample.java** dosyaları bu klasörde yer almasına rağmen, daha ileri düzey kavramlar içerebilir. Bu dosyaları zor buluyorsanız, öğreniminize devam etmekte tereddüt etmeyin! Öncelikle sağlam bir temel oluşturmak için **ArraysExample.java** ve **ArrayListExample.java** dosyalarına odaklanın.

### 🏗️ Temel Kavramlar

#### 1. Diziler

- **Tanım**: Dizi, aynı türde birden fazla değeri depolayabilen sabit boyutlu bir veri yapısıdır. Dizideki her elemana bir indeks kullanılarak erişilebilir.

**Örnek:**
```java
int[] numbers = {1, 2, 3, 4, 5};
```

- **Yaygın İşlemler**:
  - **Eleman Erişimi**: `numbers[0]` ilk elemanı alır.
  - **Eleman Değiştirme**: `numbers[1] = 10;` ikinci elemanı 10 olarak değiştirir.
  - **Döngü ile Gezinme**: Dizi üzerinde döngü kullanarak gezinmek.

#### 2. ArrayList

- **Tanım**: `ArrayList`, `List` arayüzünün yeniden boyutlandırılabilen dizi uygulamasıdır. Dinamik boyutlandırma sağlar ve Java Koleksiyonları Çerçevesi'nin bir parçasıdır.

**ArrayList Oluşturma Örneği:**
```java
ArrayList<String> fruits = new ArrayList<>();
```

- **Yaygın Metotlar**:
  - **add(eleman)**: Listeye bir eleman ekler.
    ```java
    fruits.add("Apple");
    ```
  - **get(indeks)**: Belirtilen indeksteki elemanı alır.
    ```java
    String firstFruit = fruits.get(0);
    ```
  - **set(indeks, eleman)**: Belirtilen indeksteki bir elemanı değiştirir.
    ```java
    fruits.set(1, "Banana");
    ```
  - **remove(eleman)**: Belirtilen elemanı listeden kaldırır.
    ```java
    fruits.remove("Apple");
    ```
  - **size()**: Listede bulunan eleman sayısını döndürür.
    ```java
    int numberOfFruits = fruits.size();
    ```
  - **clear()**: Listeden tüm elemanları kaldırır.
    ```java
    fruits.clear();
    ```

### 🎯 Tavsiye Edilen Alıştırmalar:

- **ArraysExample.java**:
  - Tam sayılardan oluşan bir dizi oluşturun ve maksimum ve minimum değerleri bulmak için bir program yazın.
  - Dizinin elemanları için kullanıcı girdisi alacak şekilde örneği değiştirin.

- **ArrayListExample.java**:
  - Favori filmlerinizi depolamak için bir `ArrayList` oluşturun ve listeye ekleme, kaldırma ve görüntüleme yöntemlerini yazın.
  - Kullanıcı tanımlı bir listede her meyvenin tekrar sayısını hesaplayan bir program yazın.

- **HashMapExample.java**:
  - Bir cümledeki kelimelerin sıklığını sayan bir program yazın ve bunu bir `HashMap` kullanarak yapın.
  
- **CollectionsExample.java**:
  - Tam sayılardan oluşan bir liste oluşturun ve sıralama, maksimum ve minimum değer bulma işlemlerini gösterin.

--- 
