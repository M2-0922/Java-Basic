import java.util.HashMap;
import java.util.Map;

/*
 * @author kubilaycakmak
 * @date Oct 21, 2022
 * @version 1.0
 */
 
public class HashMapExample {

    public static void main(String[] args) {

        // HashMap<K, V> hMap = new HashMap<>();
        HashMap<String, Object> hMap = new HashMap<>();

        hMap.put("name", "Jane");
        hMap.put("age", 30);
        hMap.put("isMarried", false);
        hMap.put("name2", null);
        
        // hMap.put("name", "Alex");
        // hMap.put("name2", "Jane");
        
        // System.out.println(hMap);

        // HashMap does not keep the orders.
        // HashMap does not allow duplicates.
        // HashMap does allow to put `null` values.

        for(Map.Entry<String, Object> entry: hMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    
}
