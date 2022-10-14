/*
 * @author kubilaycakmak
 * @date Oct 12, 2022
 * @version 1.0
 */
 
public class Bank {

    private String name;
    private String address;
    private String phoneNumber;
    private String accountInformation;

    public Bank(){}

    public Bank(String name, String address, String phoneNumber, String accountInformation){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.accountInformation = accountInformation;
    }

    public void withdrawMoney(){
        System.out.println("You can withdraw money from this bank.");
    }

    public void withdrawMoney(int amount) {

    }

    public void withdrawMoney(int amount, String message) {
        
        // System.out.println(message);
    }

    public void depositMoney(){
        System.out.println("You can deposit money to this bank.");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccountInformation() {
        return this.accountInformation;
    }

    public void setAccountInformation(String accountInformation) {
        this.accountInformation = accountInformation;
    }
    
}
