package admissiontest.problem7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/databasetest";
        String uName = "root";
        String password = "";
        String query = "select * from cgpa";
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            System.out.println(e);
        }
        Connection con = DriverManager.getConnection(url, uName, password);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            String res = "";
            for (int i = 1; i <= 2; i++) {
                res += rs.getString(i) + " ";
            }
            System.out.println(res);
        }

        con.close();

    }
}
