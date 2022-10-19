import java.util.ArrayList;
import java.util.List;

/*
 * @author kubilaycakmak
 * @date Oct 19, 2022
 * @version 1.0
 */
 
public class Main3 {
    
    public static void main(String[] args) {
        
        // List<Object> list = new ArrayList<>();
        List<String> list = new ArrayList<>();
        List<String> oldList = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>(50);

        oldList.add("Alex");
        oldList.add("Edward");
        oldList.add("Adam");

        list.add("Hello");
        list.add("Hola");
        list.add("Merhaba");
        list.add("Ahoy!");
        list.add("Oi!");
        list.add("Bonjour!");
        list.add(null);
        list.add(2, "Something");

        list.addAll(oldList);

        System.out.println(list);
        System.out.println("===================================");

        list.remove("Merhaba");
        System.out.println(list);
        System.out.println("===================================");

        list.remove(0);
        System.out.println(list);
        System.out.println("===================================");

        displayList(list);
        System.out.println("===================================");

        // list.sort(null);
        // System.out.println(list);

        System.out.println("ArrayList has " + list.size() + " element");

        // list.clear();
        // System.out.println("Is there any Oi!: " + list.contains("Oi!"));
        // list.get(0);
        // System.out.println(list.get(0));
        // System.out.println(list);
        // System.out.println("===================================");

    }


    public static void displayList(List<String> a){
        for (String string : a) {
            // if(string.equals("Hello")){
            //     System.out.println("There is Hello!");
            // }
            System.out.println("Element is: " + string);
        }
    }
}
