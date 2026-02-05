package day3;
import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/*1️⃣ What is List<HashMap>?

It means:

List → stores multiple objects

Each object is a HashMap

Used when you want multiple records, where each record has key–value pairs*/


public class ListOfHashMapExample {

    public static void main(String[] args) {

        // Create List of HashMaps
        List<HashMap<String, Object>> list = new ArrayList<>();

        // First HashMap (Student 1)
        HashMap<String, Object> student1 = new HashMap<>();
        student1.put("id", 101);
        student1.put("name", "Rahul");
        student1.put("marks", 85);

        // Second HashMap (Student 2)
        HashMap<String, Object> student2 = new HashMap<>();
        student2.put("id", 102);
        student2.put("name", "Anita");
        student2.put("marks", 92);

        // Third HashMap (Student 3)
        HashMap<String, Object> student3 = new HashMap<>();
        student3.put("id", 103);
        student3.put("name", "Suresh");
        student3.put("marks", 78);

        // Add HashMaps to List
        list.add(student1);
        list.add(student2);
        list.add(student3);

        // Print all objects
        System.out.println("Printing List<HashMap> data:");
        for (HashMap<String, Object> map : list) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
            System.out.println("------------");
            
            
            
            //Alternate Way: Print Using forEach (Java 8+)
            
            System.out.println("======================================");
            list.forEach(map1 -> {
                map1.forEach((key, value) -> {
                    System.out.println(key + " : " + value);
                });
                System.out.println("------------");
            });
     
        }
    }
}
