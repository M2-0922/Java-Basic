public class oct05Java {
    public static void main(String[] args) throws Exception {

        // System.out.println("Hello, World!");

        int a = 10;
        int b = 5;

        // Arithmetic Operators

        // System.out.println(a + b);
        // System.out.println("=====================================");
        // System.out.println(a - b);
        // System.out.println("=====================================");
        // System.out.println(a * b);
        // System.out.println("=====================================");
        // System.out.println(a / b);
        // System.out.println("=====================================");
        // System.out.println(a % b);
        // System.out.println("=====================================");

        // Assignment Operators

        int c = 10;
        c += 5; // c = c + 5;
        c++; // c = c + 1;
        c--;
        c *= 5; //c = c * 5;
        c /= 5; //c = c / 5;

        // Bitwise Operators

        int d = 10;
        int e = 5;
        // bitwise and
        // 0101 & 0111=0101 = 5
        System.out.println(d & e); // 0
        System.out.println("=====================================");
        // bitwise or
        // 0101 | 0111=0111 = 7
        System.out.println(d | e);
        System.out.println("=====================================");
         // bitwise xor
        // 0101 ^ 0111=0010 = 2
        System.out.println(d ^ e);
        System.out.println("=====================================");
       // bitwise not
        // ~00000000 00000000 00000000 00000101=11111111 11111111 11111111 11111010
        // will give 1's complement (32 bit) of 5 = -6
        System.out.println(~d);
        System.out.println("=====================================");
        System.out.println(d << 1);

        if(d == 10 && e == 5){
            System.out.println("Hello");
        }else if (d == 10 || e == 5){
            System.out.println("Hello");
        }else{
            System.out.println("Bye");
        }

        // Logical Operators

        if(d == 10 && e == 5){
            System.out.println("Hello");
        }else if (d == 10 || e == 5){
            System.out.println("Hello");
        }else{
            System.out.println("Bye");
        }

        String firstName = "John";
        String lastName = "Doe";

        if(firstName == "John" && lastName == "Doe"){
            System.out.println("Hello John Doe");
        }else if (firstName == "Jane" && lastName == "Doe"){
            System.out.println("Hello Jane Doe");
        }

        // And Operator
        // 1 && 1 = 1 (true)
        // 1 && 0 = 0 (false)
        // 0 && 1 = 0 (false)
        // 0 && 0 = 0 (false)

        // Or Operator
        // 1 || 1 = 1 (true)
        // 1 || 0 = 1 (true)
        // 0 || 1 = 1 (true)
        // 0 || 0 = 0 (false)
        
        // Relational Operators
        // ==, !=, >, <, >=, <=

        if(d == 10){
            System.out.println("D is equal to 10");
        }else if(d != 10){
            System.out.println("D is not equal to 10");
        }else if(d > 10){
            System.out.println("D is greater than 10");
        }else if(d < 10){
            System.out.println("D is less than 10");
        }else if(d >= 10){
            System.out.println("D is greater than or equal to 10");
        }else if(d <= 10){
            System.out.println("D is less than or equal to 10");
        }

        // Ternary Operator

        int f = 10;
        int g = 5;

        int h = (f < g) ? f : g;
        System.out.println(h); // 5

        // After ? (question mark) if the condition is true then it will return the value of f
        // After : (colon) if the condition is false then it will return the value of g
        
        // Making a decision with If-Else

        int i = 10;
        int j = 5;

        if(i < j){
            System.out.println("i is less than j");
            int count = 5;

        }else if(i > j){
            System.out.println("i is greater than j");
        }else{
            System.out.println("i is equal to j");
        }

        // System.out.println(count);

    }
}
