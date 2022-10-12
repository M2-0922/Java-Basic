public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        // String name, String address, String phoneNumber, String accountInformation, String accountName, String accountLocation
        Account account1 = new Account("Kubilay", "Istanbul", "123456789", "123456789", "Kubilay Cakmak", "Istanbul");

        account1.withdrawMoney();

    }
}
