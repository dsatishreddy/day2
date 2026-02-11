package day7;

public class TestPayment {

    public static void main(String[] args) {

        Payment payment = new CreditCardPayment();

        payment.pay(30000);
        payment.pay(60000);

        System.out.println("Max Limit: " + Payment.MAX_LIMIT);
    }
}



/*
 * 🎯 Important Learning 🔥 1️⃣ Interface Variables
 * 
 * All variables in interface are:
 * 
 * public
 * 
 * static
 * 
 * final
 * 
 * Meaning:
 * 
 * 🌍 Public → accessible everywhere
 * 
 * 📌 Static → belongs to interface, not object
 * 
 * 🔒 Final → cannot change value
 * 
 * If you try:
 * 
 * MAX_LIMIT = 60000;
 * 
 * 
 * You get:
 * 
 * Cannot assign a value to final variable
 * 
 * 🔥 2️⃣ Why Interface Variables Are Final?
 * 
 * Because interface defines rules/contract.
 * 
 * Example in real systems:
 * 
 * double TAX_RATE = 0.18; int TIMEOUT = 30; int MAX_RETRY = 3;
 * 
 * 
 * These should NOT change per object.
 * 
 * 🔥 3️⃣ Multiple Inheritance via Interface
 * 
 * Java does NOT allow:
 * 
 * class A extends B, C // ❌ Not allowed
 * 
 * 
 * But allows:
 * 
 * class CreditCardPayment implements Payment, Refundable
 * 
 * 
 * Example:
 * 
 * interface Refundable { void refund(double amount); }
 * 
 * 
 * Now:
 * 
 * public class CreditCardPayment implements Payment, Refundable { ... }
 * 
 * 
 * This is multiple inheritance of behavior contract.
 * 
 * Very important for:
 * 
 * Spring Security
 * 
 * Marker interfaces
 * 
 * Microservice architecture
 * 
 * 🧠 Interface vs Abstract Class (Quick Compare) Feature Interface Abstract
 * Class Variables public static final only Any type Methods abstract
 * (default/static allowed in Java 8+) Can have both Multiple inheritance ✅ Yes
 * ❌ No Constructors ❌ No ✅ Yes 🏦 Real-World Example
 * 
 * Spring:
 * 
 * public interface PaymentService { void pay(); }
 * 
 * 
 * Then:
 * 
 * @Component public class UpiPayment implements PaymentService
 * 
 * @Component public class CardPayment implements PaymentService
 * 
 * 
 * Spring injects based on interface type.
 * 
 * That is real runtime polymorphism.
 * 
 * 💡 Interview Question
 * 
 * Q: Why are interface variables public static final?
 * 
 * Answer:
 * 
 * Interface defines contract.
 * 
 * Variables represent constants.
 * 
 * They must not change per implementation.
 */