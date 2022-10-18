import java.io.*;

/*
 * @author kubilaycakmak
 * @date Oct 18, 2022
 * @version 1.0
 */
 
public class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("testFile.txt", false);
            fw.write("Hello CICCC, We are checking File Create and File Write!");
            fw.close();
            System.out.println("File is updated successfully!");
        } catch (IOException e) {
            System.out.println("Here we go, we got IOException!");
            e.printStackTrace();
        }
    }
}
