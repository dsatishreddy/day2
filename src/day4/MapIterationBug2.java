package day4;

import java.util.*;

//Fix 2: Collect keys first, modify later (BEST & SAFE)

public class MapIterationBug2 {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Spring");
        map.put(3, "SQL");

        List<Integer> keysToAdd = new ArrayList<>();

        for (Integer key : map.keySet()) {
            if (key == 2) {
                keysToAdd.add(4);
            }
        }

        for (Integer key : keysToAdd) {
            map.put(key, "Hibernate");
        }

        System.out.println(map);
    }
}
