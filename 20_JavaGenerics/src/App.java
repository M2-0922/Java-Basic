import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        // ArrayList list = new ArrayList();

        // list.add("Hello");
        // list.add(5);
        // list.add(false);
        // list.add(50.2);

        // int num = (int) list.get(2);
        // System.out.println(num);

        // ArrayList<Object> arrList = new ArrayList<>();

        // arrList.add(2);
        // arrList.add("Hello");
        
        // arrList.add(2.0f);

        // Container<Integer, String> container = new Container<Integer, String>(5, "Hello");

        // int a = container.getItemOne();
        // int b = container.getItemTwo();

        // Container<Integer, String> container = new Container<>(5, "Hello");
        // Container<Double> container2 = new Container<>(10.10, 20.0);
        Container<Integer, String> container3 = new Container<>(5, "Hello");
        
        // container.displayItems();
        // container2.displayItems();
    }
}


class Container<Generic1, Generic2> {
    // Fields
    private Generic1 itemOne;
    private Generic2 itemTwo;

    // Constructor
    public Container(Generic1 itemOne, Generic2 itemTwo) {
        this.itemOne = itemOne;
        this.itemTwo = itemTwo;
    }

    public void displayItems(){
        System.out.println("Priting content of the container..");
        System.out.println("Item one: " + itemOne);
        System.out.println("Item two: " + itemTwo);
    }

    // Getters and Setters
    public Generic1 getItemOne() {
        return itemOne;
    }

    public void setItemOne(Generic1 itemOne) {
        this.itemOne = itemOne;
    }

    public Generic2 getItemTwo() {
        return itemTwo;
    }

    public void setItemTwo(Generic2 itemTwo) {
        this.itemTwo = itemTwo;
    }
    
}