package day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Debug Task
 * 
 * Sorting gives inconsistent results
 * 
 * What happens when ages are equal?
 * 
 * What rule of Comparator is violated?
 */
//Comparator Sorting Bug

public class SortBug {
    public static void main(String[] args) {

        List<Person2> list = new ArrayList<>();
        
        list.add(new Person2("Ravi", 30));
        list.add(new Person2("Anil", 25));
        list.add(new Person2("Suresh", 25));

      //  Collections.sort(list, (p1, p2) -> p1.age > p2.age ? 1 : -1);

       // list.forEach(p -> System.out.println(p.name + " " + p.age));
        
        Collections.sort(list, (p1, p2) -> {
            if (p1.getAge() > p2.getAge()) return 1;
            if (p1.getAge() < p2.getAge()) return -1;
            return 0;
        });

        for (Person2 p : list) {
            System.out.println(p.getName() + " " + p.getAge());
        }

		/*
		 * Collections.sort(list, (p1, p2) -> Integer.compare(p1.getAge(), p2.getAge())
		 * );
		 */
        
    }
}
