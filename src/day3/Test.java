package day3;

import java.util.HashMap;
import java.util.Map;

public class Test
{
	public static void main(String[] args) {
	Map<Employee, String> map = new HashMap<>();

	Employee e1 = new Employee(101, "Sathish");
	Employee e2 = new Employee(101, "Sathish");

	map.put(e1, "Developer");
	 
	System.out.println(map.get(e2)); // ✅ Developer
	}
}


/*
 * 8️⃣ What Happens Internally in HashMap During put():
 * 
 * Call hashCode()
 * 
 * Find bucket
 * 
 * Call equals() to check duplicate key
 * 
 * During get():
 * 
 * Call hashCode()
 * 
 * Find bucket
 * 
 * Call equals() to find key
 * 
 * ❗ If hashCode is different → equals is never called
 * 
 * 9️⃣ Interview One-Liners (MEMORIZE 💯)
 * 
 * 💡 Why override both?
 * 
 * Because HashMap uses hashCode() for bucket location and equals() for key
 * comparison. If they are inconsistent, retrieval fails.
 * 
 * 💡 What breaks if only equals is overridden?
 * 
 * HashMap looks in the wrong bucket.
 * 
 * 💡 What breaks if only hashCode is overridden?
 * 
 * Duplicate keys appear.
 */