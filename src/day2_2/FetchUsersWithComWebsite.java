package day2_2;

import java.sql.*;

public class FetchUsersWithComWebsite {

    public static void main(String[] args) {

        String jdbcUrl = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "Teddy@143";

        String selectSql =
                "SELECT id, name, username, email, phone, website " +
                "FROM users " +
                "WHERE website LIKE ?";

        try {
            // 1️⃣ Get DB connection
            Connection conn =
                    DriverManager.getConnection(jdbcUrl, username, password);

            // 2️⃣ Prepare statement
            PreparedStatement ps = conn.prepareStatement(selectSql);
            ps.setString(1, "%.com");

            // 3️⃣ Execute query
            ResultSet rs = ps.executeQuery();

            // 4️⃣ Read results
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getString("username") + " | " +
                        rs.getString("email") + " | " +
                        rs.getString("phone") + " | " +
                        rs.getString("website")
                );
            }

            // 5️⃣ Close resources
            rs.close();
            ps.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
