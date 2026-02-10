package day6_1;

public class BankTest {

    public static void main(String[] args) {

        BankAccount acc = new BankAccount(101, 5000);
          
        acc.deposit(2000);
        acc.withdraw(1500);

        System.out.println("Current Balance: " + acc.getBalance());

        // ❌ NOT allowed:
        // acc.balance = 10000;
        // acc.accountNumber = 202;
    }
}
