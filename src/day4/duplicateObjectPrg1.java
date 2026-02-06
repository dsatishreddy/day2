package day4;

//HashMap – equals & hashCode Issue
/*
 * Why is map.size() 2 instead of 1?
 * 
 * Why is duplicate key not replaced?
 * 
 * What methods are missing in Person?
 */

import java.util.*;

public class duplicateObjectPrg1 {
    public static void main(String[] args) {

        Map<Person1, String> map = new HashMap<>();

        Person1 p1 = new Person1(1, "Ravi");
        Person1 p2 = new Person1(1, "Ravi");

        map.put(p1, "Developer");
        map.put(p2, "Tester");

        System.out.println(map.size());
        System.out.println(map);
    }
}
