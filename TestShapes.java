package day7;

public class TestShapes {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Circle();

        for (Shape s : shapes) {
            s.draw();   // Runtime Polymorphism happens here
        }
    }
}


/*
 * 
 * 
 * 🎯 What Just Happened? (Very Important)
 * 
 * Look carefully at this line:
 * 
 * Shape s = new Circle();
 * 
 * 🔎 Compile Time:
 * 
 * Java sees reference type → Shape
 * 
 * So compiler checks:
 * 
 * Does Shape have method draw()? ✅ Yes.
 * 
 * 🔎 Runtime:
 * 
 * JVM sees actual object → Circle
 * 
 * So JVM calls:
 * 
 * Circle's draw() method.
 * 
 * 👉 This is called Runtime Polymorphism 👉 Also called Dynamic Method Dispatch
 * 👉 Also called Runtime Method Binding
 * 
 * 🧠 Why Is This Powerful?
 * 
 * Because we can write generic code:
 * 
 * public void render(Shape shape) { shape.draw(); }
 * 
 * 
 * And pass ANY shape:
 * 
 * render(new Circle()); render(new Rectangle());
 * 
 * 
 * No change in method. No if-else. No instanceof.
 * 
 * That’s clean OOP design.
 * 
 * 🔥 Real-World Example (Very Important for Interviews)
 * 
 * Spring Boot Example:
 * 
 * PaymentService payment = new CreditCardPayment(); payment.pay();
 * 
 * 
 * or
 * 
 * PaymentService payment = new UpiPayment(); payment.pay();
 * 
 * 
 * Same reference. Different behavior.
 * 
 * That’s how microservices and strategy patterns work internally.
 * 
 * 📌 Rules for Runtime Polymorphism
 * 
 * Method must be overridden.
 * 
 * Must use inheritance.
 * 
 * Method cannot be:
 * 
 * final
 * 
 * static
 * 
 * private
 * 
 * ⚡ Difference: Compile-Time vs Runtime Polymorphism Type Happens When Example
 * Compile-time Overloading Same method name, different parameters Runtime
 * Overriding Parent reference → Child object 💡 Interview Question
 * 
 * Q: How does Java decide which method to call?
 * 
 * Answer:
 * 
 * Compiler checks reference type.
 * 
 * JVM decides using actual object type at runtime.
 * 
 * Since you're improving Java logic for backend roles, this concept is
 * extremely important for:
 * 
 * Strategy Pattern
 * 
 * Factory Pattern
 * 
 * Dependency Injection
 * 
 * Spring Bean Resolution
 * 
 */