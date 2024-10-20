public class Car {
    private String color;
    private String model;
    private int year;
    private int speed;
    private int maxSpeed;

    // Constructor
    public Car(String color, String model, int year, int speed, int maxSpeed) {
        this.color = color;
        this.model = model;
        this.year = year;
        this.speed = speed;
        this.maxSpeed = maxSpeed;
    }

    // Methods
    public void accelerate() {
        if (speed <= maxSpeed-10) {
            speed += 10;
        }
        else if (speed < maxSpeed) {
            speed = maxSpeed;
        }
    }

    public void brake() {
        if (speed >= 10) {
            speed -= 10;
        }
        else if (speed > 0) {
            speed = 0;
        }
    }

    public void display() {
        System.out.println("Color: " + color);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Speed: " + speed);
        System.out.println("Max Speed: " + maxSpeed);
    }

    // Getters
    public String getColor() {
        return color;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public int getSpeed() {
        return speed;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }

    // Setters
    public void setColor(String color) {
        this.color = color;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}