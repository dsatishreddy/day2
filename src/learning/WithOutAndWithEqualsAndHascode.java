package learning;
import java.util.HashSet;

public class WithOutAndWithEqualsAndHascode {
	
	//with out equals and hashcode method.
    public static void main(String[] args) {

        Student s1 = new Student(1, "Ravi");
        Student s2 = new Student(1, "Ravi");

        HashSet<Student> set = new HashSet<>();
        set.add(s1);
        set.add(s2);

        System.out.println(set.size());
        
        
        System.out.println("=========================================");
        
        //with equals and hashcode method
        
        Student1 s3 = new Student1(1, "Ravi");
        Student1 s4 = new Student1(1, "Ravi");

        HashSet<Student1> setm = new HashSet<>();
        setm.add(s3);
        setm.add(s4);

        System.out.println(setm.size());
    }
}
