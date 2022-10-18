/*
 * @author kubilaycakmak
 * @date Oct 17, 2022
 * @version 1.0
 */
 
public class CheckingAccount {

    private String nameOfAccountHolder;
    private double balance;

    public CheckingAccount(String nameOfAccountHolder){
        this.nameOfAccountHolder = nameOfAccountHolder;
        this.balance = 0;
    }

    public void deposit(double amount) throws CustomException{
        if(amount < 0){
            throw new CustomException("You cannot deposit a negative amount");
        }
        this.balance += amount;
    }

    public String getNameOfAccountHolder() {
        return nameOfAccountHolder;
    }

    public double getBalance() {
        return balance;
    }
    
}
