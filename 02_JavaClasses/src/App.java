
public class App {
    public static void main(String[] args) throws Exception {
        // Car audi = new Car();
        // Car ford = new Car();
        // Car bmw = new Car();

        // System.out.println("Audi is running: " + audi.getIsRunning()); // true

        // Car toyota = new Car("Toyota", "Camry", 2019, 0, "John Doe", false);
        // Car honda = new Car("Honda");
        // Car nissan = new Car("Nissan", "Altima");
        
        // instance variable
        // System.out.println(audi.driver);
        // System.out.println(audi.model);
        // Cannot access directly because it is private
        // System.out.println(audi.getModel());
        // Can access via the getter method
        // System.out.println(audi.getSpeed());

        // ford.setModel("Ford");
        // ford.setMake("F150");
        // ford.setSpeed(10);
        // ford.setYear(2019);

        // System.out.println(ford.getModel());

        // System.out.println(toyota.getModel());

        // System.out.println(audi.getSpeed()); // 0
        // System.out.println(audi.getIsRunning()); // false

        // audi.start(); // Car is starting...

        // System.out.println(audi.getSpeed()); // 10
        // System.out.println(audi.getIsRunning()); // true

        // audi.stop(); // Car is stopping...

        // System.out.println(audi.getSpeed()); // 0
        // System.out.println(audi.getIsRunning()); // false


        AClass a = new AClass("Hola!");
        a.print();
    }
}
