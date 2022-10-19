// import java.util.*;

// class Names implements Comparable<Names> {

//     private String name;

//     public Names(String name) {
//         this.name = name;
//     }

//     @Override
//     public int compareTo(Names o) {
//         return 0;
//         // return o.name.length() - name.length();
        
//         // if(name.length() == o.name.length()) {
//         //     // return name.compareTo(o.name);
//         //     return 0;
//         // }else if(name.length() < o.name.length()) {
//         //     return 1;
//         // }else {
//         //     return -1;
//         // }
//     }

//     @Override
//     public String toString() {
//         return name;
//     }

// }

// public class App {
//     public static void main(String[] args) throws Exception {

//         // List names = new LinkedList();
//         // names.add("USA");
//         // names.add("India");
//         // names.add("Russia");
//         // names.add("Japan");

//         List<Names> names = new LinkedListExample<>();
//         names.add(new Names("aa"));
//         names.add(new Names("bbb"));
//         names.add(new Names("cccc"));
//         names.add(new Names("ddddd"));
//         names.add(new Names("eeeeee"));
//         names.add(new Names("ggggggg"));


//         System.out.println(names);
//         System.out.println("====================================");
//         Collections.sort(names);
//         System.out.println(names);
//     }
// }
