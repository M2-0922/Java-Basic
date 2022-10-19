import java.util.*;

/*
 * @author kubilaycakmak
 * @date Oct 19, 2022
 * @version 1.0
 */

class Countries implements Comparable<Countries> {

    public String name;

    public Countries(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Countries o) {
        return name.length() - o.name.length();
    }

    @Override
    public String toString(){
        return name;
    }

}
 
public class Comparison {
    public static void main(String[] args) {

        // List<String> countries = new LinkedList<>();

        // countries.add("Ukrain");
        // countries.add("USA");
        // countries.add("Canada");
        // countries.add("India");
        // countries.add("Japan");

        List<Countries> lCountries = new LinkedList<>();

        lCountries.add(new Countries("Ukrain"));
        lCountries.add(new Countries("USA"));
        lCountries.add(new Countries("Canada"));
        lCountries.add(new Countries("India"));
        lCountries.add(new Countries("Japan"));

        System.out.println(lCountries);
        System.out.println("--------------");

        // Collections.sort(lCountries);
        lCountries.sort(null);
        System.out.println(lCountries);
        System.out.println("--------------");

        // System.out.println(countries);
        // System.out.println("--------------");
        // // countries.sort(null);
        // Collections.sort(countries);
        // System.out.println(countries);
    }
}
