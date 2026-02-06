package day4;


/*
 * Why no exception?
 * 
 * Why behavior is different from HashMap?
 * 
 * Is this safe or risky?
 */
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentBug {
    public static void main(String[] args) {

        Map<Integer, String> map = new ConcurrentHashMap<>();

        map.put(1, "A");
        map.put(2, "B");

        for (Integer key : map.keySet()) {
            map.remove(key);
        }

        System.out.println(map);
    }
}


/*
 * ConcurrentHashMap iterators are NOT fail-fast
 * 
 * They are weakly consistent
 * 
 * Structural modification during iteration is allowed
 * 
 * 👉 That’s why no ConcurrentModificationException
 */
/*
 * | Feature                        | HashMap             | ConcurrentHashMap |
 * | Iterator type                  | Fail-fast           | Weakly consistent |
 * | Modification during iteration  | ❌ Exception        | ✅ Allowed        | 
 * | Thread safety                  | ❌ Not thread-safe  | ✅ Thread-safe    |
 * 
 * 
 */


/*
 * ❓ Is this safe or risky? ✅ Safe in terms of:
 * 
 * No exception
 * 
 * Thread-safe operations
 * 
 * No data corruption
 * 
 * ⚠️ Risky in terms of:
 * 
 * Unpredictable iteration behavior
 * 
 * Iterator may skip or miss entries
 * 
 * Not suitable for business-critical logic
 */