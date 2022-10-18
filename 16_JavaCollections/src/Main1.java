/*
 * @author kubilaycakmak
 * @date Oct 18, 2022
 * @version 1.0
 */
 
public class Main1 {
    public static void main(String[] args) {
        String x = "Hello";
        String x1 = "Hello";
        String y = "World";
        String z = x.concat(y);

        System.out.println(z);

        // System.out.println(z.length());
        // if(x.indexOf("h") == -1){
        //     System.out.println("lower case h is not inside of string x");
        // }
        // if(z == "HelloWorld"){
        //     System.out.println("Text is HelloWorld");
        // }else{
        //     System.out.println("Text is not HelloWorld"); 
        // }

        // if(z.equals("HelloWorld")){
        //     System.out.println("Text is HelloWorld");
        // }else{
        //     System.out.println("Text is not HelloWorld"); 
        // }

        // System.out.println(x);

        if(x == x1){
            System.out.println("they are the same");
        }else{
            System.out.println("they are not the same");
        }

    }
    
}
