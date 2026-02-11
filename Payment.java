package day7;

public interface Payment {

    int MAX_LIMIT = 50000;   // Automatically public static final

    void pay(double amount); // Automatically public abstract
}
