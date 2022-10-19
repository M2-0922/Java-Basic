import java.util.ArrayList;

/*
 * @author kubilaycakmak
 * @date Oct 19, 2022
 * @version 1.0
 */
 
public class CaseThree {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(5);

        int num = list.get(0); // unboxing Integer to int (primitive type)

        System.out.println(num);
    }
}
