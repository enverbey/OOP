public class Lion {
    private String name;
    private int level;
    private int gazelleEaten;
    private boolean live;

    
    // Constructor
    public Lion(String name) {
        this.name = name;
        this.level = 0;
        this.live = 1;
        this.gazelleEaten = 0;
    }

    // Methods
    public void levelUp() {
        if (live && level >= 10) {
            System.out.println("Lion is now a king.");
        }
        else if (live && gazelleEaten >= 5) {
            level++;
            gazelleEaten -= 3;
            if (level >= 5)
                gazelleEaten -= 2;
        }
        else if (!live) {
            System.out.println("Lion is dead. Cannot level up.");
        }
        else {
            System.out.println("Not enough gazelle eaten to level up.");
        }
    }


    private void tryEat(Gazelle gazelle, short chance) {
        Random rand = new Random();
        if (rand.nextInt(chance) == 1) {
            System.out.println("Lion caught a gazelle.");
            gazelleEaten++;
            gazelle.makeDead();
        }
        else {
            System.out.println("Lion missed the gazelle.");
        }
        
    }
    public void eatGazelle(Gazelle gazelle) {
        if (!live) {
            System.out.println("Lion is dead. Cannot eat.");
        }
        else if (level >= 10) {
            tryEat(gazelle, 2);
        }
        else if (level >= 5) {
            tryEat(gazelle, 3);
        }
        else {
            tryEat(gazelle, 4);
        }   
    }

    public void display() {
        System.out.println("Name: " + name + (live ? " (Alive)" : " (Dead)"));
        System.out.println("Level: " + age);
        System.out.println("Live: " + live);
    }

    // Getters
    public String getName() {
        return name;
    }
    public int getlevel() {
        return age;
    }
    public boolean isLive() {
        return live;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }
    private void setAge(int age) {
        this.age = age;
    }
    public void makeDead() {
        this.live = 0;
    }
}