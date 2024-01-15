package Week_10_2;

public class Person implements Cloneable{
    public String name;
    Car c;

    Person(String name, Car c)
    {
        this.name = name;
        this.c = c;
    }
    protected Person shallowClone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }

    protected Person deepClone() throws CloneNotSupportedException {
        Person p = (Person) super.clone();
        p.c = (Car) c.clone();
        return p;
    }

    public void displayInformation(){
        System.out.println("My name is " + name + "My car is " + c.carName);
    }
}
