/*
 * @author kubilaycakmak
 * @date Oct 17, 2022
 * @version 1.0
 */
 
public class Bank {

    public static void main(String[] args) {
        CheckingAccount myAccount = new CheckingAccount("Kubilay");
        System.out.println(myAccount.getBalance()); // 0.0
        System.out.println(myAccount.getNameOfAccountHolder()); // Kubilay

        try{
            myAccount.deposit(100);
            System.out.println(myAccount.getBalance()); // 100.0
            myAccount.deposit(-100);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("We are here in finally block");
        }
        System.out.println("Program continues");
    }
    
}
