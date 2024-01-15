package Week_4;

//Cat class extends from Animal class, this is INHERITANCE
public class Cat extends Animal{

    //We over ride sound method on Animal's.
    @Override
    public void sound() {
        System.out.println("miyav miyav");
    }

    //We have two cat's constructor, this is overloading!!
    public Cat()
    {
        super("Default cat");
    }
    public Cat(String name){
        super(name);
    }
}
