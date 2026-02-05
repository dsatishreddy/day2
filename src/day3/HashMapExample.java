package day3;

import java.util.HashMap;
import java.util.Map;

/*HashMap works by hashing the key, storing data in buckets, 
handling collisions using LinkedList or Red-Black Tree, and retrieving values using hashCode() and equals().
*/

public class HashMapExample {
	
	public static void main(String[] args)
	{
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(1, "India");
		map.put(2, "America");
		map.put(3,  "Australia");
		map.put(4,  "Pakisthan");
		
	   System.out.println("Initial HashMap: " + map);
		
	   map.remove(4);
	   
	   System.out.println("After removal" + map);
	   
	   //Iterate HashMap (3 Common Ways)
	   
	   //1. Using entrySet() (BEST PRACTICE)
	   
	   System.out.println("Iterating using entry set");
	   for (Map.Entry<Integer, String> entry : map.entrySet()) {
           System.out.println(entry.getKey() + " -> " + entry.getValue());
       }
	   
	   
	   //2. Using keySet()
	   
       System.out.println("Iterating using keySet:");
       for (Integer key : map.keySet()) {
           System.out.println(key + " -> " + map.get(key));
       }
       
       for(Integer key : map.keySet()) {
    	   System.out.println(key + "->" + map.get(key));
       }

       
       //3. Using forEach() (Java 8+)
       
       System.out.println("Iterating using forEach:");
       map.forEach((key, value) -> {
           System.out.println(key + " -> " + value);
       });
	}

}
