package person_management.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import person_management.model.Person;
import person_management.util.DBUtil;

public class PersonDAO {

    public void insertPersons(List<Person> persons) throws Exception {

        Connection con = DBUtil.getConnection();
        String sql = "INSERT INTO person VALUES (?, ?, ?, ?)";

        PreparedStatement ps = con.prepareStatement(sql);

        for (Person p : persons) {
            ps.setInt(1, p.getId());
            ps.setString(2, p.getName());
            ps.setInt(3, p.getAge());
            ps.setString(4, p.getCity());
            ps.executeUpdate();
        }

        ps.close();
        con.close();
    }

    // ✅ CORRECT METHOD
    public Collection<Person> fetchPersons() throws Exception {

        Collection<Person> persons = new ArrayList<>();

        Connection con = DBUtil.getConnection();
        String sql = "SELECT * FROM person";

        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            Person p = new Person(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getInt("age"),
                    rs.getString("city")
            );
            persons.add(p);
        }

        rs.close();
        stmt.close();
        con.close();

        return persons;
    }
}
