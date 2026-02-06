package day4;

//Debug Program 3: HashMap Iteration Bug

/*
 * Why does this throw exception?
 * 
 * Why HashMap doesn’t allow structural modification during iteration?
 * 
 * What is the safe approach?
 */

import java.util.*;

public class MapIterationBug {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Spring");
        map.put(3, "SQL");

        for (Integer key : map.keySet()) {
            if (key == 2) {
                map.put(4, "Hibernate");
            }
        }
    }
}



/*
 * 🧠 Why does this throw exception?
 * 
 * map.keySet() returns a fail-fast iterator
 * 
 * For-each loop internally uses Iterator
 * 
 * map.put() causes structural modification
 * 
 * Iterator detects modCount change
 * 
 * Boom 💥 → ConcurrentModificationException
 * 
 * HashMap does NOT allow structural modification while iterating
 */