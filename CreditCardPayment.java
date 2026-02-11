package day7;

public class CreditCardPayment implements Payment {

    @Override
    public void pay(double amount) {

        if (amount > MAX_LIMIT) {
            System.out.println("Payment exceeds maximum limit!");
        } else {
            System.out.println("Paid " + amount + " using Credit Card");
        }
    }
}
