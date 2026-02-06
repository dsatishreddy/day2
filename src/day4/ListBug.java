package day4;

//2: ConcurrentModificationException

/*
 * Program crashes at runtime
 * 
 * Why can’t we modify a list while iterating?
 * 
 * How to fix it (Iterator / removeIf)?
 */

import java.util.*;

public class ListBug {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("A");
        names.add("B");
        names.add("C");

        for (String name : names) {
            if (name.equals("B")) {
                names.remove(name);
            }
        }

        System.out.println(names);
    }
}



/*
 * ❓ Why can’t we modify a list while iterating?
 * 
 * For-each loop uses Iterator
 * 
 * Iterator tracks modCount
 * 
 * Direct modification changes modCount
 * 
 * Iterator detects mismatch → ConcurrentModificationException
 */
