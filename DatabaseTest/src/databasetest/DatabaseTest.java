package databasetest;

import java.sql.*;

public class DatabaseTest {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        String url = "jdbc:mysql://localhost:3306/db";
        String user = "root";
        String pass = "";
        int roll = 8;
        String name = "tuhin";
        String q = "select * from student";
        Connection con = DriverManager.getConnection(url, user, pass);
        
        Statement st = con.createStatement();
        ResultSet r = st.executeQuery(q);
     //   ResultSet t = st.executeQuery(q);
      
        while (r.next()) {
            String res = r.getString(1) + " " + r.getInt(2) + " " + r.getDouble(3);
            System.out.println(res);
        }
     
       // t.next();
       // System.out.println(t.getInt(2));
        
    }
    
}
