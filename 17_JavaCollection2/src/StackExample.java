import java.util.Stack;

/*
 * @author kubilaycakmak
 * @date Oct 19, 2022
 * @version 1.0
 */
 
public class StackExample {
    public static void main(String[] args) {
        
        Stack<Integer> stack = new Stack<>();

        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        System.out.println(stack);
        System.out.println("-----------");

        System.out.println("Element: " + stack.pop() + " removed from stack");
        System.out.println(stack);
        System.out.println("-----------");

        System.out.println("Last element/Top element of stack is: " + stack.peek());
        System.out.println(stack);
        System.out.println("-----------");

        if(stack.isEmpty()){
            System.out.println("Stack is empty!");
        }else{
            System.out.println("Stack is not empty!");
        }

        System.out.println(stack);
        System.out.println(stack.search(0));
        System.out.println("-----------");
        
        if(stack.search(7) == -1){
            System.out.println("Element 7 is not in stack");
        }
    }
}
