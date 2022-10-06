import java.util.Scanner;

public class oct06Java {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");

        // Declare a variable
        String greeting;
        // Declare a variable
        String greeting2;

        // Assign a value to the variable
        // new keyword is used to create an instance of a class
        greeting = new String("Hello, World!");
        // System.out.println(greeting.equals("Hello, World!")); // false
        // System.out.println(greeting.contains("Hello")); // true
        // System.out.println(greeting.contains("World!")); // true

        // Declare and assign a variable
        int len;

        len = greeting.length();

        String temp = greeting.substring(7);
        // System.out.println(temp);


        // String methods
        
        // System.out.println(greeting.toUpperCase()); // HELLO, WORLD!
        // System.out.println(greeting.toLowerCase()); // hello, world!
        // System.out.println(greeting.trim()); // Hello, World!
        // System.out.println(greeting.replace("World", "Universe")); // Hello, Universe!
        // System.out.println(greeting); // Hello, World!
        // System.out.println(greeting.indexOf(2)); // 2
        // System.out.println(greeting.indexOf("World")); // 7
        // System.out.println(greeting.concat("This is new")); // Hello, World! This is new

        // Declare Scanner object
        Scanner scan;
        // Scanner scan2;
        // Scanner scan3;

        // Assign a value to the variable
        // scan = new Scanner(System.in);
        // System.out.println("Enter a number: ");

        // int number = scan.nextInt();

        // System.out.println("You entered: " + number);
        // scan.close();

        // scan2 = new Scanner(System.in);

        // System.out.println("Enter a word: ");

        // String word = scan2.nextLine();

        // if(word.equals("Hello")) {
        //     System.out.println("You entered Hello");
        // } else {
        //     System.out.println("You did not enter Hello");
        // }
        // scan2.close();
        // System.out.printf("PI = %8.10f%n", Math.PI);
        System.out.printf("%10d%n", 123);
    }
}
