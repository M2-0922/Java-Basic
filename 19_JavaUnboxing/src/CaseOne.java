/*
 * @author kubilaycakmak
 * @date Oct 19, 2022
 * @version 1.0
 */
 
public class CaseOne {
    public static void main(String[] args) {
        // compiler automatically converts it to the Integer wrapper class
        // to primitive data type
        Integer intObject = new Integer(10);
        myMethod(intObject); // passed obj of integer.
        // unboxing.
    }

    public static void myMethod(int a){
        System.out.println(a);
    }
}
