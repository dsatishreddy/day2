package day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();
        list.add(new Person(1, "Ravi", 30));
        list.add(new Person(2, "Anita", 40));
        list.add(new Person(3, "Suresh", 35));

        Collections.sort(list, new NameComparator());
        System.out.println("Sorted by Name: " + list);

        Collections.sort(list, new AgeComparator());
        System.out.println("Sorted by Age: " + list);
    }
}



/*
 * 💡 Comparable defines natural ordering, Comparator defines custom ordering.
 * 
 * 💡 Use Comparator when you need multiple sorting strategies.
 * 
 * 💡 Comparator avoids modifying existing class.
 */