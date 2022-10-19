import java.util.LinkedList;

/*
 * @author kubilaycakmak
 * @date Oct 19, 2022
 * @version 1.0
 */
 
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);
        System.out.println("------------");

        list.add(1,10);
        System.out.println(list);
        System.out.println("------------");

        list.remove();
        System.out.println(list);
        System.out.println("------------");

        list.remove(list.size() - 1);
        System.out.println(list);
        System.out.println("------------");

        // list.clear();

        if(list.isEmpty()) {
            System.out.println("List is empty");
        }else{
            System.out.println("List has some elements");
        }
        
    }
}
