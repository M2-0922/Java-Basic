/*
 * @author kubilaycakmak
 * @date Oct 13, 2022
 * @version 1.0
 */
 
class Dog implements Animal{

    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    public void travel() {
        System.out.println("Dog is travelling.");
    }
    
}
