package day4;

import java.util.ArrayList;
import java.util.List;

public class UsingRemovalIf 
{
	    public static void main(String[] args) {

	        List<String> names = new ArrayList<>();
	        names.add("A");
	        names.add("B");
	        names.add("C");

	        names.removeIf(name -> name.equals("B"));

	        System.out.println(names); // [A, C]
	        
	        System.out.println("=========================");
	        
	        
	        //traditional approch
	        
	        for (int i = 0; i < names.size(); i++) {
	            if (names.get(i).equals("B")) {
	                names.remove(i);
	                i--; // important!
	            }
	        }
	        
	        System.out.println(names);

	    }
	    
	    
	    

}
