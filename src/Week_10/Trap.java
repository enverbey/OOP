package Week_10;

public class Trap implements Cloneable {
    public String name;

    public Trap(String n){
        name = n;
    }

    public Trap clone() throws CloneNotSupportedException {
        return (Trap) super.clone();
    }

    public void displayName(){
        System.out.println("Trap name is " + name);
    }

}
