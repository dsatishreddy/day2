package day6_3;

public class Vehicle {

    // final method → cannot be overridden
    public final void start() {
        System.out.println("Vehicle is starting...");
    }

    // non-final method → CAN be overridden
    public void fuelType() {
        System.out.println("Vehicle uses fuel");
    }
}
