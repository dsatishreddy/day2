package day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.HashSet;
import java.util.Set;

public class JdbcInsertExample {
	public static void main(String[] args) {

		Set<Person> persons = new HashSet<>();

		persons.add(new Person(1, "Ravi", 30));
		persons.add(new Person(1, "Ravi", 30));

		System.out.println(persons.size());

		String url = "jdbc:mysql://localhost:3306/testdb";
		String user = "root";
		String password = "Teddy@143";

		String sql = "INSERT INTO persons VALUES (?, ?, ?)";

		try (Connection con = DriverManager.getConnection(url, user, password);
				PreparedStatement ps = con.prepareStatement(sql);) {

			for (Person p : persons) { 
				ps.setInt(1, p.getId());
				ps.setString(2, p.getName());
				ps.setInt(3, p.getAge());

				ps.executeUpdate();
			}
			System.out.println("Person inserted successfully");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
