/*
 * @author kubilaycakmak
 * @date Oct 12, 2022
 * @version 1.0
 */
 
public class Account extends Bank {

    private String accountName;
    private String accountLocation;

    public Account(){}

    public Account(String accountName, String accountLocation){
        this.accountName = accountName;
        this.accountLocation = accountLocation;
    }

    public Account(String name, String address, String phoneNumber, String accountInformation, String accountName, String accountLocation){
        super(name, address, phoneNumber, accountInformation);
        this.accountName = accountName;
        this.accountLocation = accountLocation;
    }

    @Override
    public void withdrawMoney(){
        System.out.println("Heyyo, I changed the function logic.");
        System.out.println("You can withdraw money from this account and this branch.");
    }

    public String getAccountName() {
        return this.accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountLocation() {
        return this.accountLocation;
    }

    public void setAccountLocation(String accountLocation) {
        this.accountLocation = accountLocation;
    }
    
}
