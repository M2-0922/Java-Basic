/*
 * @author kubilaycakmak
 * @date Oct 13, 2022
 * @version 1.0
 */
 
public class Cat implements Animal {

    @Override
    public void eat() {
        System.out.println("Cat is eating.");
    }

    @Override
    public void travel() {
        System.out.println("Cat is travelling.");
    }
    
}
