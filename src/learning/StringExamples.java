package learning;

public class StringExamples {
	
   public static void main(String[] args) {
	String s = "hello";
	
	String s1 = "hello";
	

	String s2 = "HELLO";
	
	var aa = "hello";
	
	var sd = 1234;
	
	System.out.println(s == s1);
	
	System.out.println(s.equals(s1));
	
	System.out.println("==============================");
	
	
    System.out.println(s == s2);
	
	System.out.println(s.equals(s2));
	
	System.out.println("==============================");
	
	String sa = new String("Java");
	String sb = new String("Java");

	System.out.println(sa == sb);
	System.out.println(sa.equals(sb));
}
}
