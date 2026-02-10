package day6_1;

public class BankAccount {

    // final variable → can be set only once
    final int accountNumber;

    // private variable → cannot be accessed directly
    private double balance;

    // constructor to initialize final variable
    public BankAccount(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    // controlled access to balance (optional but useful)
    public double getBalance() {
        return balance;
    }
}





/*
 * 
 * 
 * 3️⃣ Why this satisfies the task 🔐 Encapsulation
 * 
 * balance is private
 * 
 * Cannot be accessed directly
 * 
 * Access only via deposit() and withdraw()
 * 
 * 🧱 final variable behavior
 * 
 * accountNumber is final
 * 
 * Set only once in constructor
 * 
 * Cannot be modified later
 */

