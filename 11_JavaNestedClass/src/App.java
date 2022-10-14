public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Vehicle vehicle = new Vehicle();
        System.out.println(vehicle.vehiclePart.getPartName());
        System.out.println(vehicle.vehiclePart.getPartPrice());
        Animal animal = new Animal();
        animal.sayHello();
    }
}
