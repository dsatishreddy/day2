package day6_3;

public class Bike extends Vehicle {

    // ❌ Compile-time error
    // public void start() {
    //     System.out.println("Bike is starting...");
    // }

    // ✅ Allowed: override non-final method
    @Override
    public void fuelType() {
        System.out.println("Bike uses petrol");
    }
}

/*
 * 5️⃣ Key Learning (VERY IMPORTANT) 🔒 Why final methods exist
 * 
 * Prevents changing critical logic
 * 
 * Ensures consistent behavior
 * 
 * Improves security & predictability
 * 
 * Example real-world use:
 * 
 * Thread.start()
 * 
 * Object.wait()
 * 
 * Banking / payment core logic
 * 
 * 🧠 Polymorphism insight Vehicle b = new Bike();
 * 
 * 
 * start() → Vehicle version (final)
 * 
 * fuelType() → Bike version (overridden)
 * 
 * 6️⃣ Interview-ready one-liners 🔥
 * 
 * Final methods cannot be overridden
 * 
 * Used to protect base-class behavior
 * 
 * Supports controlled inheritance
 * 
 * Compile-time restriction, not runtime
 * 
 * 7️⃣ Quick comparison table Feature final method non-final method Override
 * allowed ❌ No ✅ Yes Inheritance Controlled Flexible Use case Core logic Custom
 * behavior
 */