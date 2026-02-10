package day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentManagement {

    public static void main(String[] args) {

        // Store students in ArrayList
        List<Student> students = new ArrayList<>();
        
        Student s5 = new Student(5, "ganesh", 44);
        
        students.add(s5);

        students.add(new Student(1, "Sathish", 60));
        students.add(new Student(2, "Sreeni", 90));
        students.add(new Student(3, "Rudvi", 95));
        students.add(new Student(4, "Tanishq", 80));

        // Print students who scored above 70
        System.out.println("Students scoring above 70:");
        for (Student s : students) {
            if (s.getMarks() > 70) {
                System.out.println(s);
            }
        }

        // Sort students by marks
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getMarks() - s2.getMarks(); // ascending
            }
        });

        System.out.println("\nStudents sorted by marks:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
