package day7;

public final class PasswordUtil {

    public String encryptPassword(String password) {
        // Simple example (not real encryption)
        return Integer.toHexString(password.hashCode());
    }
}


/*
 * ✔ What does final mean here?
 * 
 * When a class is marked final:
 * 
 * ❌ It cannot be extended
 * 
 * ❌ No subclass can modify its behavior
 * 
 * ✅ Behavior becomes fixed and secure
 * 
 * ❌ Step 2: Try Extending It package day4;
 * 
 * public class MyPasswordUtil extends PasswordUtil {
 * 
 * }
 * 
 * 🔥 Compile Error: Cannot inherit from final 'PasswordUtil'
 * 
 * 
 * That’s the purpose of final class.
 */


/*
 * 🎯 Why Make a Class final? 1️⃣ Security
 * 
 * Imagine:
 * 
 * public final class PasswordUtil
 * 
 * 
 * If it was NOT final, someone could do:
 * 
 * public class HackPasswordUtil extends PasswordUtil {
 * 
 * @Override public String encryptPassword(String password) { return password;
 * // No encryption 😈 } }
 * 
 * 
 * Now encryption is bypassed.
 * 
 * ⚠ In real systems (banking, login, payment), this is dangerous.
 * 
 * So making it final:
 * 
 * Prevents overriding
 * 
 * Prevents tampering
 * 
 * Protects security logic
 */


/*
 * 
 * 2️⃣ Immutability
 * 
 * Final classes help create immutable objects.
 * 
 * Example:
 * 
 * public final class User { private final String name; private final int age;
 * 
 * // No setters }
 * 
 * 
 * No subclass can modify behavior.
 * 
 * 💡 Why is String Final? public final class String
 * 
 * 🔐 Reasons: 1️⃣ Security
 * 
 * Imagine if String was not final:
 * 
 * class MyString extends String { // override methods }
 * 
 * 
 * Someone could change:
 * 
 * file paths
 * 
 * DB credentials
 * 
 * URL values
 * 
 * passwords
 * 
 * Very dangerous.
 * 
 * 2️⃣ Immutability Guarantee
 * 
 * String is immutable because:
 * 
 * internal value is final
 * 
 * class is final
 * 
 * no method can modify original value
 * 
 * Example:
 * 
 * String s = "hello"; s.concat("world");
 * 
 * 
 * Original string does NOT change.
 * 
 * 3️⃣ Performance (JVM Optimization)
 * 
 * Because String is final:
 * 
 * JVM can safely cache strings (String Pool)
 * 
 * Can optimize memory
 * 
 * Thread-safe by default
 * 
 * 🔥 Real-World Examples of Final Classes Class Why Final String Security +
 * Immutability Integer Immutable Math Utility class PasswordUtil Security logic
 * LocalDate Immutable date object 🧠 Interview Question
 * 
 * Q: Why do we make utility classes final?
 * 
 * Answer:
 * 
 * To prevent inheritance
 * 
 * To protect core logic
 * 
 * To maintain immutability
 * 
 * To improve security
 * 
 * ⚡ Quick Concept Summary final on Meaning variable Cannot change value method
 * Cannot override class Cannot extend
 */