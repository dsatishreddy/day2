package person_management;


import java.util.*;

import person_management.dao.PersonDAO;
import person_management.model.Person;

public class PersonApp {

    public static void main(String[] args) throws Exception {

        List<Person> persons = new ArrayList<>();

        persons.add(new Person(1, "Ravi", 30, "Hyderabad"));
        persons.add(new Person(2, "Anita", 25, "Bangalore"));
        persons.add(new Person(3, "Suresh", 35, "Chennai"));

        // Sort
        persons.sort(Comparator.comparingInt(Person::getAge));

        // Insert into DB
        PersonDAO dao = new PersonDAO();
        dao.insertPersons(persons);

        // Fetch & Print
        dao.fetchPersons()
           .stream()
           .forEach(System.out::println);
    }
}



/*
 * This project reads Person data, stores it in a List, sorts it using
 * Comparator for flexible ordering, persists it into a database using JDBC,
 * retrieves it back, and prints the data using Java Stream API. It demonstrates
 * collections, sorting, JDBC, and modern Java features together.
 */