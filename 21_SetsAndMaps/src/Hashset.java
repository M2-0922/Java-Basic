import java.util.HashSet;

/*
 * @author kubilaycakmak
 * @date Oct 21, 2022
 * @version 1.0
 */
 
public class Hashset {
    public static void main(String[] args) {
        
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Java");
        hashSet.add("Python");
        hashSet.add("JavaScript");
        hashSet.add("Java");
        hashSet.add("AI");
        hashSet.add("C#");

        System.out.println(hashSet);

        if(hashSet.remove("C#")){ // return true if element in hashset.
            System.out.println("C# deleted.");
        }
        // Hashset does not allow duplicates.
        // Hashset does not keep the order.

    }
}

