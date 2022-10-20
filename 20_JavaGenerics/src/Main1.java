import java.util.List;

/*
 * @author kubilaycakmak
 * @date Oct 20, 2022
 * @version 1.0
 */

class DataObject <K,V> {
    private K key;
    private V value;

    public DataObject(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public <E> void display(E element1, E element2){
        System.out.println("Element 1: " + element1);
        System.out.println("Element 2: " + element2);
    }

    public void displayNoGeneric(String element1, Integer element2){
        System.out.println("Element 1: " + element1);
        System.out.println("Element 2: " + element2);
    }

    public <E> void printListData(List<E> list){
        for(E element: list){
            System.out.println("Element: " + element);
        }
    }

    @Override
    public String toString() {
        return "Key is " + key + " and Value is " + value;
    }

}
 
public class Main1 {
    public static void main(String[] args) {

        DataObject<Integer, String> data = new DataObject<>(10, "Edward");

        System.out.println(data);

        data.display("Hey", false);
        System.out.println("============================");
        data.display(12, 20.0);
        data.display("hello", "hey");
        
        System.out.println("===========================");
        data.displayNoGeneric("Hello", 4);
        data.displayNoGeneric("hello", "hey");

    }
}
