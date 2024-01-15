package Week_10_2;

public class Car implements Cloneable{

    public String carName;

    Car(String n)
    {
        carName = n;
    }

    protected Car clone() throws CloneNotSupportedException {
        return (Car) super.clone();
    }

}
