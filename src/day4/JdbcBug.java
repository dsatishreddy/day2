package day4;

/*
 * Code works but is dangerous
 * 
 * What resources are not closed?
 * 
 * How to fix using try-with-resources?
 */

import java.sql.*;

public class JdbcBug {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "Teddy@143";

        String sql = "SELECT * FROM person";

        try (
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()
        ) {
            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

/*
 * JDBC resources are not auto-closed
 * 
 * Leaked connections exhaust DB pool
 * 
 * Production outages 😬
 */
/*
 * ✅ What did we fix? Issue Fix Connection leak try-with-resources Statement
 * leak auto-closed ResultSet leak auto-closed Exception safety handled 🧠
 * Interview One-Liners ❓ What resources must be closed in JDBC?
 * 
 * ➡️ ResultSet, Statement, Connection
 * 
 * ❓ Best way to close them?
 * 
 * ➡️ try-with-resources
 * 
 * ❓ Order of closing?
 * 
 * ➡️ Reverse order of creation
 */