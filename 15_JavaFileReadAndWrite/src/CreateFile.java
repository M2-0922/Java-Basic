import java.io.*;

/*
 * @author kubilaycakmak
 * @date Oct 18, 2022
 * @version 1.0
 */
 
public class CreateFile {
    public static void main(String[] args) {
        File file = new File("filename.txt");
        
        try {
            if(file.createNewFile()){
                System.out.println("File created: " + file.getName());
            }else{
                System.out.println("Sorry, something went wrong..");
            }
        } catch (IOException e) {
            System.out.println("This is IOException message");
            e.printStackTrace();
        }
    }
}
