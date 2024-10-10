## 06-İstisna Yönetimi 🚫

Bu klasör, Java'daki istisna yönetimine odaklanmaktadır ve bu, sağlam uygulamalar geliştirmek için kritik öneme sahiptir. İstisnalar, bir programın yürütme akışını kesintiye uğratan olaylardır. Bu istisnaların nasıl yönetileceğini anlamak, programınızın hatalara nazikçe yanıt vermesini sağlamaya yardımcı olur. Aşağıda sağlanan dosyalar, işlevleri ve ilgili alıştırmalar yer almaktadır.

Not: Henüz kalıtım kavramları ile tanışmamış olabilirsiniz. Eğer `CustomExceptionExample.java` dosyasını anlamakta zorlanıyorsanız, çok fazla zaman harcamayın—ilerleyin ve daha sonra tekrar gözden geçirin.

### Dosyalar ve İşlevsellik

#### 1. TryCatchExample.java 🛠️

Bu sınıf, istisnaları zarif bir şekilde yönetmek için try-catch bloklarının kullanımını gösterir.

**Ana Özellikler:**
- **Try Bloğu**: Bir istisna fırlatabilecek kodu içerir. Bu örnekte, sıfıra bölme işlemi yapılmaya çalışılır ve bu bir `ArithmeticException` ile sonuçlanır.
- **Catch Bloğu**: İstisnayı, kullanıcı dostu bir mesaj sağlayarak yönetir.
- **Finally Bloğu**: İstisna fırlatılıp fırlatılmadığına bakılmaksızın çalışır, bu da temizlik işlemlerini (örneğin, kaynakların kapatılması) mümkün kılar.

**Örnek Kod:**
```java
int sonuç = 10 / 0; // Bu satır ArithmeticException fırlatacaktır.
```

**Alıştırma:**
- Kodu, sayıyı hardcode etmek yerine kullanıcıdan girdi alacak şekilde değiştirin. Kullanıcı girdisinden kaynaklanabilecek olası istisnaları yönetin.

---

#### 2. CustomExceptionExample.java 🧑‍💼

Bu sınıf, Java'da özel istisnaların nasıl oluşturulacağını ve kullanılacağını gösterir.

**Ana Özellikler:**
- **Özel İstisna Sınıfı**: Yaş doğrulama ile ilgili belirli hata koşullarını yönetmek için `GeçersizYaşİstisnası` tanımlar.
- **Özel İstisnaların Fırlatılması**: `checkAge` metodu yaşı kontrol eder ve eğer yaş geçersizse özel istisnayı fırlatır.

**Örnek Kod:**
```java
if (yaş < 0) {
    throw new GeçersizYaşİstisnası("Yaş negatif olamaz.");
}
```

**Alıştırma:**
- Kullanıcı adlarını doğrulamak için yeni bir metot uygulayın; eğer kullanıcı adı boş veya null ise `GeçersizKullanıcıAdıİstisnası` fırlatın.

---

### Sonuç

İstisna yönetimini anlamak, dayanıklı uygulamalar oluşturmak için esastır. Try-catch bloklarını uygulayarak ve özel istisnalar tanımlayarak, programın ani sonlanmasını önleyerek kullanıcı deneyimini geliştirebilir ve anlamlı geri bildirim sağlayabilirsiniz.

---

