package day6_2;

import java.util.ArrayList;
import java.util.List;

public class FinalReferenceDemo {

    public static void main(String[] args) {

        // final reference
        final List<String> names = new ArrayList<>();

        // ✅ Allowed: modifying the object
        names.add("Sathish");
        names.add("Sreeni");
        names.add("Rudvi");

        System.out.println(names);

        names.remove("Sathish");
        System.out.println(names);

        // ❌ NOT allowed: reassigning the reference
        // names = new ArrayList<>();

    }
}

/*
 * final stops reassignment, NOT modification
 */

/*
 * 2️⃣ What is happening internally? 🔒 final applies to the reference final
 * List<String> names
 * 
 * 
 * names always points to the same ArrayList object
 * 
 * You cannot make it point to another object
 * 
 * 🧠 But the object itself is mutable names.add("NewName"); // ✅ allowed
 * names.remove("Sathish"); // ✅ allowed
 * 
 * 
 * Because:
 * 
 * ArrayList is mutable
 * 
 * final does NOT freeze the object
 * 
 * 3️⃣ What will FAIL (compile-time error) names = new ArrayList<>();
 * 
 * 
 * ❌ Error like:
 * 
 * The final local variable names cannot be assigned
 * 
 * 4️⃣ Real-life analogy (easy to remember)
 * 
 * final reference = fixed remote control
 * 
 * Object = TV
 * 
 * 👉 You can:
 * 
 * Change channels (add/remove elements) 👉 You cannot:
 * 
 * Use the remote for another TV (reassign reference)
 * 
 * 5️⃣ Interview one-liners 🔥
 * 
 * final reference ≠ immutable object
 * 
 * final applies to the variable, not the data
 * 
 * Mutability depends on the class, not final
 * 
 * 6️⃣ Bonus (How to make it truly immutable?) List<String> names = List.of("A",
 * "B", "C");
 * 
 * 
 * or
 * 
 * List<String> names = Collections.unmodifiableList(new ArrayList<>());
 * 
 * 
 * Now:
 * 
 * names.add("X"); // ❌ Runtime exception
 */