package Week_5;

public class Main extends Thread{
    public static void main(String[] args) {
        MyNumber e = new MyNumber(1, 2);
        MyNumber y = new MyNumber(4, 5);

        Thread t1 = new Thread(e);
        t1.start();

        //static variable in class
        //They are using same integer (i)
        e.showNumber();
        y.showNumber();

        //static function in class
        //We just use class name, does not use reference to call static function
        MyNumber.heyy();

        //Animal class is a Interface, and dog is implements from Animal class.
        Dog dog = new Dog();
        dog.sound();

        //Encapsulation : "Bir değişkenin doğrudan erişimini sınırlamak ve
        // bu değişkenin değerine ulaşmak veya bu değeri değiştirmek için
        // getter ve setter fonksiyonları oluşturmak.
    }


}