package Week_10_2;

public class Main {
    public static void main(String []args) throws CloneNotSupportedException {

        Car c = new Car("Honda");

        Person p1 = new Person("Enver", c);
        Person p2;
        p2 = (Person) p1.shallowClone();

        System.out.println("Before : ");
        p1.displayInformation();
        p2.displayInformation();

        p2.c.carName = "AUDI";
        p2.name = "Harun";

        System.out.println("After : ");
        p1.displayInformation();
        p2.displayInformation();

        System.out.println("<------------------------------->");

        Car car = new Car("Honda");

        Person person1 = new Person("Enver", car);
        Person person2 = (Person) person1.deepClone();

        System.out.println("Before : ");
        person1.displayInformation();
        person2.displayInformation();

        person2.c.carName = "AUDI";
        person2.name = "Harun";

        System.out.println("After : ");
        person1.displayInformation();
        person2.displayInformation();

    }

}
