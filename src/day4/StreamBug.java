package day4;

/*
 * Program throws NoSuchElementException
 * 
 * Why get() is risky?
 * 
 * How to fix using Optional safely?
 */
		
		
import java.util.*;
import java.util.stream.*;

public class StreamBug {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(10, 20, 30, 40);
        
     // Issue

     // Integer result = nums.stream()
     //        .filter(n -> n > 50)
     //      .findFirst()
     //    .get();

    //    System.out.println(result);
        
        
        
        //Different ways to fix  Fix 1: orElse (Most common)
        
        Integer results = nums.stream()
                .filter(n -> n > 50)
                .findFirst()
                .orElse(null);   // or default value

        System.out.println(results);
        
        //✅ Fix 2: orElse with default value
        
        Integer result2 = nums.stream()
                .filter(n -> n > 50)
                .findFirst()
                .orElse(-1);

        System.out.println(result2);
        
        
        //✅ Fix 3: ifPresent (Best practice)
        
        nums.stream()
        .filter(n -> n > 50)
        .findFirst()
        .ifPresent(System.out::println);

       //✅ Fix 4: orElseThrow (Controlled exception)
        
        Integer result3 = nums.stream()
                .filter(n -> n > 50)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Value not found"));

        System.out.println(result3);

        
        
        
        

    }
}




/*
 * 🧠 Why is get() risky?
 * 
 * Optional.get() assumes value must be present
 * 
 * No safety check
 * 
 * Breaks functional style
 * 
 * 👉 Never use get() without checking
 */



/*
 * ❓ Why does this throw NoSuchElementException?
 * 
 * ➡️ Because .get() is called on Optional.empty()
 * 
 * ❓ How to fix safely?
 * 
 * ➡️ Use orElse, ifPresent, or orElseThrow
 * 
 * ❓ Should we use Optional in fields?
 * 
 * ➡️ ❌ No ➡️ ✅ Use Optional in return types only
 */