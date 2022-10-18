import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
       
        System.out.println("===================================");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("===================================");
        Scanner sc = new Scanner(System.in); 
        System.out.print("Please select a step from menu: ");
        int step = 0;
        // sc.close();
        try {
            step = sc.nextInt(); // waiting a number
        }catch (InputMismatchException e) {
            System.out.print("Please enter a valid number: ");
        }catch(IllegalStateException e){
            System.out.println("Scanner is closed");
        }catch (ArithmeticException e) {
            System.out.println("You cannot divide by zero");
        }catch (Exception e) {
            System.out.println("Something went wrong");
        }finally{
            System.out.println(step); 
            sc.close();
        }
    }

    public static void sayHello(){
        System.out.println("Hello!");
    }
}
