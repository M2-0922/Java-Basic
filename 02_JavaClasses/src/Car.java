/*
 * @author kubilaycakmak
 * @date Oct 11, 2022
 * @version 1.0
 */
 
public class Car {

    // Fields
    private String model;
    private String make;
    private int year;
    private int speed;
    private String driver;
    private boolean isRunning;

    // default constructor
    public Car() {
        this.model = "Audi";
        this.make = "A4";
        this.year = 2019;
        this.speed = 0;
        this.driver = "Jane Doe";
        this.isRunning = false;
    }
    // second constructor
    public Car(String model, String make, int year, int speed, String diver, boolean isRunning) {
        this.model = model;
        this.make = make;
        this.year = year;
        this.speed = speed;
        this.driver = diver;
        this.isRunning = isRunning;
    }

    public Car(String model){
        this.model = model;
    }

    public Car(String model, String make){
        this.model = model;
    }

    // Methods/Behaviors
    public void start(){
        this.isRunning = true;
        this.speed = 10;
        System.out.println("Car is starting...");
    }

    public void stop(){
        this.isRunning = false;
        this.speed = 0;
        System.out.println("Car is stopping...");
    }

    public void getInformation(){
        System.out.println("Model: " + this.model);
        System.out.println("Make: " + this.make);
        System.out.println("Year: " + this.year);
        System.out.println("Speed: " + this.speed);
        System.out.println("Driver: " + this.driver);
    }

    public boolean getIsRunning() {
        return this.isRunning;
    }

    public void setIsRunning(boolean isRunning) {
        this.isRunning = isRunning;
    }

    public String getModel() {
        // return this.model;
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getDriver() {
        return this.driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

}
