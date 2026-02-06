package day4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WithIterator {

	    public static void main(String[] args) {

	        List<String> names = new ArrayList<>();
	        names.add("A");
	        names.add("B");
	        names.add("C");

	        Iterator<String> itr = names.iterator();

	        while (itr.hasNext()) {
	            String name = itr.next();
	            if (name.equals("B")) {
	                itr.remove(); // safe removal
	            }
	        }

	        System.out.println(names); // [A, C]
	    }
	}


