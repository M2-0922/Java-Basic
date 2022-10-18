/*
 * @author kubilaycakmak
 * @date Oct 17, 2022
 * @version 1.0
 */
 
public class Main {
    public static void main(String[] args) {
        
        try {
            int numArr[] = {1,2,3,4,5};
            System.out.println(numArr[10]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
        System.out.println("Program continues");
    }
}
