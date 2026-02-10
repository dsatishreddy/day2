package day6_3;

public class TestVehicle {

    public static void main(String[] args) {

        Vehicle v = new Vehicle();
        v.start();
        v.fuelType();

        Vehicle b = new Bike();
        b.start();       // calls Vehicle's start()
        b.fuelType();   // calls Bike's overridden method
    }
}
