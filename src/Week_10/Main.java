package Week_10;

public class Main {
    public static void main(String []args) throws CloneNotSupportedException {
        //Memory usage konusu için "Java Memory" ve "Note" dosyalarına bakınız.

        Trap t1 = new Trap("XZombie");
        Trap t2 = t1.clone();

        t1.displayName();
        t2.displayName();

        //They have different object !

        t1.name = "YZOMBIE";
        t1.displayName();
        t2.displayName();

    }
}
