package day7;

public class TestAccount {

    public static void main(String[] args) {

        Account acc = new SavingsAccount(10000);

        acc.printAccountType();   // Final method
        acc.calculateInterest();  // Overridden method
    }
}













/*
 * 🎯 Important Learning 🔥 1️⃣ Abstract Method public abstract void
 * calculateInterest();
 * 
 * 
 * No body
 * 
 * Must be implemented
 * 
 * Enables runtime polymorphism
 * 
 * 🔥 2️⃣ Final Method public final void printAccountType()
 * 
 * 
 * Has implementation
 * 
 * Cannot be overridden
 * 
 * Guarantees consistent behavior
 * 
 * If you try:
 * 
 * @Override public void printAccountType() { }
 * 
 * 
 * You get:
 * 
 * Cannot override final method
 * 
 * 🧠 Abstract vs Final (Very Important Table) Feature abstract method final
 * method Has body? ❌ No ✅ Yes Must override? ✅ Yes ❌ Cannot override Purpose
 * Force child behavior Lock behavior 🏦 Real-World Banking Logic
 * 
 * Think like this:
 * 
 * Every bank account:
 * 
 * Must calculate interest (but logic differs)
 * 
 * Must print account type in standard format
 * 
 * So:
 * 
 * abstract calculateInterest(); // customizable final printAccountType(); //
 * fixed rule
 * 
 * 🔥 Template Method Pattern Idea
 * 
 * This is how Template Pattern works.
 * 
 * Example:
 * 
 * public abstract class Account {
 * 
 * public final void processAccount() { printAccountType(); // fixed
 * calculateInterest(); // customizable }
 * 
 * protected abstract void calculateInterest();
 * 
 * private void printAccountType() {
 * System.out.println("Processing account..."); } }
 * 
 * 
 * Now child classes can only change the interest logic, not the flow.
 * 
 * 👉 This pattern is heavily used in:
 * 
 * Spring Framework
 * 
 * Servlet API
 * 
 * JDBC Template
 * 
 * Payment processing systems
 * 
 * 🚀 Why This Is Important For You
 * 
 * Since you’re preparing for backend / Spring roles:
 * 
 * Spring internally uses:
 * 
 * abstract classes
 * 
 * final methods
 * 
 * template pattern
 * 
 * runtime polymorphism
 * 
 * Understanding this = stronger design knowledge.
 */