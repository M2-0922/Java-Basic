import java.util.LinkedList;
import java.util.Queue;

/*
 * @author kubilaycakmak
 * @date Oct 19, 2022
 * @version 1.0
 */
 
public class QueueExample {
    
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);

        System.out.println("Elements of queue: " + q);
        System.out.println("------------------");

        int removedElement = q.remove();
        System.out.println("Removed element is " + removedElement);
        System.out.println("Elements of queue: " + q);
        System.out.println("------------------");

        int head = q.peek();
        System.out.println("Head of queue is " + head);
        System.out.println("Elements of queue: " + q);
        System.out.println("------------------");

        int size = q.size();
        System.out.println("Size of queue is " + size);
        System.out.println("------------------");

    }

    
}
