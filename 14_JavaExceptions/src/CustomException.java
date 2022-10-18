/*
 * @author kubilaycakmak
 * @date Oct 17, 2022
 * @version 1.0
 */
 
public class CustomException extends Exception {
    
    private String message;

    public CustomException(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
    
}
