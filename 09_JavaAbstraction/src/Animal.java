/*
 * @author kubilaycakmak
 * @date Oct 13, 2022
 * @version 1.0
 */
 
abstract public class Animal {
    private String name;

    // Abstract method
    public abstract void animalSound();

    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}
