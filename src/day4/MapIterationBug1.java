package day4;

import java.util.*;

//✅ Fix 1: Use Iterator + iterator.remove() (Interview favorite)

public class MapIterationBug1 {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Spring");
        map.put(3, "SQL");

        Iterator<Integer> itr = map.keySet().iterator();

        while (itr.hasNext()) {
            Integer key = itr.next();
            if (key == 2) {
                itr.remove(); // safe removal
            }
        }

        System.out.println(map);
    }
}
