package day4;

import java.util.*;

import java.util.concurrent.ConcurrentHashMap;

//✅ Fix 3: Use ConcurrentHashMap (Fail-safe)

public class MapIterationBug3 {
    public static void main(String[] args) {

        Map<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "Java");
        map.put(2, "Spring");
        map.put(3, "SQL");

        for (Integer key : map.keySet()) {
            if (key == 2) {
                map.put(4, "Hibernate"); // allowed
            }
        }

        System.out.println(map);
    }
}
