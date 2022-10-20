import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/*
 * @author kubilaycakmak
 * @date Oct 20, 2022
 * @version 1.0
 */

class Data<T> {

    private T data;

    Data(T data){
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Data [data=" + data + "]";
    }

}
 
public class Main {
    public static void main(String[] args) {
        
         // list.add("Hello");
        // System.out.println(list);

        // List <Data<String>> list = new LinkedList<>();
        // List<Data<String>> list2 = new LinkedList<>();
        LinkedList<Data<String>> list = new LinkedList<>();
        ArrayList
        Data<String> element1 = new Data<>("Hello");

        list.add(element1);
        list.add(new Data<>("Hola"));
        list.add(new Data<>("Bonjour"));
        list.add(new Data<>("Oi"));

        List<Data<Integer>> listInteger = new LinkedList<>();

        listInteger.add(new Data<>(1));
        listInteger.add(new Data<>(2));
        listInteger.add(new Data<>(3));
        listInteger.add(new Data<>(4));
        listInteger.add(new Data<>(5));


        displayList(list);
        System.out.println("------------------");
        displayList(listInteger);

    }

    public static <T> void displayList(List<Data<T>> list){
        // for (Data<T> data : list) {
        //     System.out.println("Element of List: " + data.getData());
        // }

        ListIterator<Data<T>> iterator = list.listIterator();
        
        while(iterator.hasNext()){
            System.out.println("Element of List: " + iterator.next().getData());
        }

    }

    // public static void displayListInteger(List<Data<Integer>> list){
    //     for (Data<Integer> data : list) {
    //         System.out.println("Element of List: " + data.getData());
    //     }
    // }


}
