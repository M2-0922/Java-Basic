public class App {

    // Overloading 
    // If you have more than one method with same name, and methods should be different than
    // each other (different parameters)
    
    public static void sayHello(){
        System.out.println("Hello CICCC!");
    }

    public static void sayHello(String message){
        System.out.println("Hello" + message);
    }

    public static String sayHello(String message, String message2){
        Animal.greetings();
        return message + " " + message2;
    }

    public String greetingsString(){
        Animal.greetings();
        return "Hello";
    }

    public static void main(String[] args) throws Exception {
        // sayHello();
        // // sayHello("World");
        // System.out.println(sayHello("Hello", "World!"));
        // // 
        // Animal animal = new Animal();
        // System.out.println(animal.name);
        // System.out.println(Animal.name);
        // Animal.setName("asd");
        // System.out.println(Animal.getName());
        Animal animal = new Animal();
        System.out.println(animal.getName());
    }
}
