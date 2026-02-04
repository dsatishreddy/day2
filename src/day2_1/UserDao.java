package day2_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UserDao {

    private static final String JDBC_URL =
            "jdbc:mysql://localhost:3306/testdb";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Teddy@143";

    private static final String INSERT_SQL =
            "INSERT INTO users (id, name, username, email, phone, website) " +
            "VALUES (?, ?, ?, ?, ?, ?)";

    public void saveUser(User user) throws Exception {

        Connection conn =
                DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

        PreparedStatement ps = conn.prepareStatement(INSERT_SQL);

        ps.setInt(1, user.getId());
        ps.setString(2, user.getName());
        ps.setString(3, user.getUsername());
        ps.setString(4, user.getEmail());
        ps.setString(5, user.getPhone());
        ps.setString(6, user.getWebsite());

        ps.executeUpdate();

        ps.close();
        conn.close();
    }
}
