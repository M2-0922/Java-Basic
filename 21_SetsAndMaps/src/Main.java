import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

class Main{
    public static void main(String[] args) {
        // section1();  
        // section2();  
        section3();
    }

    public static void section1(){

        HashSet<Integer> hSet = new HashSet<>();
        // makes unique
        // does not allow duplicates.
        // does not keep the orders.
        hSet.add(42);
        hSet.add(12);
        hSet.add(61);
        hSet.add(99);
        hSet.add(4);
        hSet.add(27);
        hSet.add(4);

        System.out.println(hSet);
        // 
        System.out.println("======================");

        ArrayList<Integer> arrayList = new ArrayList<>();
        // not uniques
        // allows duplicates.
        // keeps the order
        arrayList.add(42);
        arrayList.add(12);
        arrayList.add(61);
        arrayList.add(99);
        arrayList.add(4);
        arrayList.add(27);
        arrayList.add(4);

        System.out.println(arrayList);
        // 
        System.out.println("======================");

        LinkedHashSet<Integer> lHashSet = new LinkedHashSet<>();
        // Linked Hash Set keeps the order.
        // does not allow duplicates.

        lHashSet.add(42);
        lHashSet.add(12);
        lHashSet.add(61);
        lHashSet.add(99);
        lHashSet.add(4);
        lHashSet.add(27);
        lHashSet.add(4);

        System.out.println(lHashSet);
        // 
        System.out.println("======================");

    }

    public static void section2(){

        HashSet<Animal> animals = new HashSet<>(); 

        // Animal animalOne = ;
        // Animal animalTwo = ;

        animals.add(new Animal("Dog", 1));
        animals.add(new Animal("Cat", 2));
        animals.add(new Animal("Bird", 1));
        animals.add(new Animal("Dog", 1));

        // System.out.println(animals);
        // System.out.println(animals.hashCode());

        for(Animal animal: animals){
            System.out.println(animal);
        }
    }

    public static void section3(){

        HashMap<Integer, String> hMap = new HashMap<>();

        hMap.put(1, "John");
        hMap.put(2, "Jane");
        hMap.put(3, "Adam");
        hMap.put(4, "Adam");
        hMap.put(2, "Edward");

        for(Map.Entry<Integer, String> entry: hMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("=================================");

        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(1, "John");
        treeMap.put(2, "Jane");
        treeMap.put(3, "Adam");
        treeMap.put(2, "Edward");
        treeMap.put(4, "Adam");

        // System.out.println(treeMap.size());

        for(Map.Entry<Integer, String> entry: treeMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}

class Animal{
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal [name=" + name + ", age=" + age + "]";
    }

    // @Override
    // public int hashCode() {
    //     final int prime = 31;
    //     int result = 1;
    //     result = prime * result + ((name == null) ? 0 : name.hashCode());
    //     result = prime * result + age;
    //     return result;
    // }

    // @Override
    // public boolean equals(Object obj) {
    //     if (this == obj)
    //         return true;
    //     if (obj == null)
    //         return false;
    //     if (getClass() != obj.getClass())
    //         return false;
    //     Animal other = (Animal) obj;
    //     if (name == null) {
    //         if (other.name != null)
    //             return false;
    //     } else if (!name.equals(other.name))
    //         return false;
    //     if (age != other.age)
    //         return false;
    //     return true;
    // }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;

        Animal animal = (Animal) obj;

        if(age != animal.age) return false;
        return name != null ? name.equals(animal.name) : animal.name == null;
    }

}