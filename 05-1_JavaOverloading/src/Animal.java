/*
 * @author kubilaycakmak
 * @date Oct 14, 2022
 * @version 1.0
 */
 
public class Animal {

    public static String name = "Jane";

    public static void greetings(){
        System.out.println("Hello!");
    }

    public String getName() {
        greetings();
        return name;
    }

    public void setName(String name) {
        greetings();
        Animal.name = name;
    }

    
}
