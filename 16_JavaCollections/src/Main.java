/*
 * @author kubilaycakmak
 * @date Oct 18, 2022
 * @version 1.0
 */
 
public class Main {

    // public static final int MONDAY = 1;
    // public static final int TUESDAY = 2;
    // public static final int WEDNESDAY = 3;
    // public static final int THURSDAY = 4;
    // public static final int FRIDAY = 5;

    public static void main(String[] args) {

        Days day = Days.WEDNESDAY; // WEDNESDAY

        // System.out.println(day);
        // System.out.println(day.getClass());
        // System.out.println(day.toString());
        // Days day = Days.THURSDAY;

        // int day = 1;

        switch(day){
            case MONDAY:
                System.out.println("Boring Monday");
                break;
            case TUESDAY:
                System.out.println("Its okay Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Yeahh! Its middle of the week!");
                break;
            case THURSDAY:
                System.out.println("Almost there!");
                break;
            case FRIDAY:
                System.out.println("Hell Yeah!");
                break;
            case default:
                System.out.println("Default!");
                break;
        }
    }
}
