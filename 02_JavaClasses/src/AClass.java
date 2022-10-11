/*
 * @author kubilaycakmak
 * @date Oct 11, 2022
 * @version 1.0
 */
 
public class AClass {
    String s;

    // AClass(){
    //     s = "Hello";
    // }

    AClass(String newS) {
        s = newS;
    }

    public void print(){
        System.out.println(s);
        // return s;
    }

    public String sayHello(){
        return "Hello";
    }

    public void voidSayHello(){
        System.out.println("Hello");
    }

    // String test = sayHello(); // Hello
    // String test2 = voidSayHello(); // undefined;

    // String s = "undefined";
}
