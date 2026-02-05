package day3;
import java.util.*;

public class ComparableExample {
    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();
        list.add(new Person(1, "Ravi", 30));
        list.add(new Person(2, "Anita", 25));
        list.add(new Person(3, "Suresh", 35));

        Collections.sort(list); // uses compareTo()

        System.out.println(list);
    }
}
