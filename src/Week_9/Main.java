package Week_9;

public class Main {
    public static void main(String []args){
        //Inheritance and substitution : Kalıtım alma - Yerine geçme
        //sub class : kalıtım alan class subclass dır.
        //polymorphism  : Çok biçimlilik

        //Student clası Person'dan extends (kalıtım) alıyor. Bu Inheritance

        //Kalıtım alınan bir class tipindeki referans ile üst class objesini tutabiliyoruz.
        //Örneğin burada Person tipindeki değişken ile Student objesini tutuyoruz
        //Buna Substitution (Yerine Geçme) deniyor.
        Person p = new Student();

        //p Person tipinde olmasına rağmen, live fonksiyonu çalıştığında
        //Student objesinin fonksiyonu çalıştı işte bu Polymorphism
        p.live();

        /*  Yukarıdaki kod için ChatGPT nin açıklaması

        Person p = new Student(); ifadesi kullanılarak p değişkeni,
        Student sınıfının bir örneğiyle atanmıştır. Bu durumda p değişkeni,
        tip olarak Person sınıfını temsil etse de, runtime (çalışma zamanında)
        polymorphism özelliği devreye girer.

        p.live(); ifadesi çağrıldığında, live metodu Student sınıfında override edilmişse,
        Student sınıfının live metodu çalışır. Bu durum, p değişkeninin aslında bir Student
         nesnesini referans ettiğini ve bu nesnenin metotlarını çağırabildiğini gösterir.

        Bu örnekte, p değişkeni compile-time (derleme zamanı) olarak Person olarak
        tanımlandığı halde, runtime (çalışma zamanı) sırasında gerçek türüne göre davranarak
        polymorphism özelliğini göstermektedir.
         */
    }


}
