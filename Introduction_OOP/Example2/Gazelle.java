public class Gazelle {
    private boolean live;
    
    // Constructor
    public Gazelle(String name) {
        this.live = true;
    }

    // Methods
    public void display() {
        System.out.println("Name: " + name + (live ? " (Alive)" : " (Dead)"));
    }

    // Getters
    public boolean isLive() {
        return live;
    }

    // Setters
    public void makeDead() {
        live = false;
    }

}