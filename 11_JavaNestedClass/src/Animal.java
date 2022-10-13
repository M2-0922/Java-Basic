/*
 * @author kubilaycakmak
 * @date Oct 13, 2022
 * @version 1.0
 */
 
public class Animal {

    private String name;
    private boolean canFly;

    Animal(){
        this.name = "Bird";
        this.canFly = false;
    }

    Animal(String name, boolean canFly){
        this.name = name;
        this.canFly = canFly;
    }

    public void sayHello(){

        // Local inner class
        class Hello{
            private String greetings = "Hello World";
            Hello(){}
            Hello(String greetings) {
                this.greetings = greetings;
            }
        }

        Hello greeting = new Hello("Hello CICCC");

        System.out.println(greeting.greetings);
    }

    
}
