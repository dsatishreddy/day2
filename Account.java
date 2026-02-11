package day7;

public abstract class Account {

    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    // Abstract method (must be implemented by child)
    public abstract void calculateInterest();

    // Final method (cannot be overridden)
    public final void printAccountType() {
        System.out.println("This is a Bank Account");
    }
}
