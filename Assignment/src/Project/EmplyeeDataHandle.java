package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class EmplyeeDataHandle {

    static void addEmployeeToDatabase() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the id: ");
        int id = scan.nextInt();
        System.out.print("Enter the Name: ");
        String name = scan.next();
        System.out.print("Enter the age: ");
        int age = scan.nextInt();
        System.out.print("Enter Phone Number: ");
        String phoneNumber = scan.next();
        System.out.print("Enter salary: ");
        int salary = scan.nextInt();

        if (isExist(id)) {
            System.out.println("Employee Already exist");
        } else {
            if (age < 18) {
                System.out.println("Employee Should be elder than 18 year");
                return;
            }
            try {
                String url = "jdbc:mysql://localhost:3306/salarymanagment";
                String user = "root";
                String pass = "";
                Connection con = DriverManager.getConnection(url, user, pass);

                String q = "INSERT INTO employeedata VALUES(" + id + ",'" + name + "'," + age + "," + phoneNumber + "," + salary + ");";
                Statement st = con.createStatement();
                st.executeUpdate(q);

                q = "INSERT INTO salary VALUES(" + id + ",0,0 ,0 ,0 ,0 ,0 ,0 ,0 ,0, 0 ,0 ,0);";
                st = con.createStatement();
                st.executeUpdate(q);

                System.out.println("inserted!!!!!!!!!!!!!");
            } catch (Exception e) {
                System.out.println("Error in database");
            }
        }

    }

    static void deleteEmployeeFromDatabase() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the id: ");
        int id = scan.nextInt();
        try {
            String url = "jdbc:mysql://localhost:3306/salarymanagment";
            String user = "root";
            String pass = "";
            Connection con = DriverManager.getConnection(url, user, pass);

            String q = "delete from salary where id=" + id + ";";
            Statement st = con.createStatement();
            int res = st.executeUpdate(q);
            if (res == 0) {
                System.out.println("id not found");
            } else {
                System.out.println("Deleted!!!!!!!!!!!!!");
            }

            q = "delete from employeedata where id=" + id + ";";
            st = con.createStatement();
            st.executeUpdate(q);
        } catch (Exception e) {
            System.out.println("Error in database");
        }
    }

    static void ListOfEmployee() {
        try {
            String url = "jdbc:mysql://localhost:3306/salarymanagment";
            String user = "root";
            String pass = "";
            Connection con = DriverManager.getConnection(url, user, pass);

            String q = "SELECT * FROM employeedata;";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(q);
            int c = 0;
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String phone = rs.getString("phone");
                int salary = rs.getInt("salary");

                q = "SELECT * FROM salary where id=" + id + ";";
                st = con.createStatement();
                ResultSet temp = st.executeQuery(q);
                String paidMonth = "";
                while (temp.next()) {
                    if (temp.getInt("January") == 1) {
                        paidMonth += "January,";
                    }
                    if (temp.getInt("February") == 1) {
                        paidMonth += "February,";
                    }
                    if (temp.getInt("March") == 1) {
                        paidMonth += "March,";
                    }
                    if (temp.getInt("April") == 1) {
                        paidMonth += "April,";
                    }
                    if (temp.getInt("May") == 1) {
                        paidMonth += "May,";
                    }
                    if (temp.getInt("June") == 1) {
                        paidMonth += "June,";
                    }
                    if (temp.getInt("July") == 1) {
                        paidMonth += "July,";
                    }
                    if (temp.getInt("August") == 1) {
                        paidMonth += "August,";
                    }
                    if (temp.getInt("September") == 1) {
                        paidMonth += "September,";
                    }
                    if (temp.getInt("October") == 1) {
                        paidMonth += "October,";
                    }
                    if (temp.getInt("November") == 1) {
                        paidMonth += "November,";
                    }
                    if (temp.getInt("December") == 1) {
                        paidMonth += "December,";
                    }

                }
                System.out.println("{id=" + id + "} {Name= " + name + "} {age= " + age + "] {phone= " + phone + "} {salary" + salary + "} [Paid Months=" + paidMonth + "}");
                ++c;
            }
            if (c == 0) {
                System.out.println("No Employee found");
            }
        } catch (Exception e) {
            System.out.println("Error in database");
        }
    }

    static void updateEmployeeData() {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the Id: ");
            int id = scan.nextInt();
            String url = "jdbc:mysql://localhost:3306/salarymanagment";
            String user = "root";
            String pass = "";
            Connection con = DriverManager.getConnection(url, user, pass);

            String q = "SELECT * FROM employeedata where id=" + id + ";";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(q);
            int c = 0;
            if (rs.next()) {

                String name = rs.getString("name");
                int age = rs.getInt("age");
                String phone = rs.getString("phone");
                int salary = rs.getInt("salary");
                System.out.print("Update name{" + name + "} to :");
                String newName = scan.next();
                System.out.print("Update age{" + age + "} to :");
                int newAge = scan.nextInt();
                System.out.print("Update phone{" + phone + "} to :");
                String newPhone = scan.next();
                System.out.print("Update salary{" + salary + "} to :");
                int newSalary = scan.nextInt();
                q = "UPDATE employeedata  SET name = '" + newName + "', age=" + newAge + ", phone='" + newPhone + "', salary=" + newSalary + " WHERE id = " + id + ";";

                st.executeUpdate(q);
                System.out.println("Updated!!!!!");
                ++c;
            }

            if (c == 0) {
                System.out.println("No Employee found");
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Error in database");
        }
    }

    static void payrollDetiailsFromDatabase() {
        Scanner scan = new Scanner(System.in);
        System.out.println("{January, February, March, April, May, June, July, August, September, October, November, and December}");
        System.out.print("Enter Month Name: ");
        String mon = scan.next();
        try {
            String url = "jdbc:mysql://localhost:3306/salarymanagment";
            String user = "root";
            String pass = "";
            Connection con = DriverManager.getConnection(url, user, pass);

            String q = "SELECT id FROM salary where " + mon + "=1;";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(q);
            System.out.println("Paid Users id on month= " + mon + ":");
            while (rs.next()) {
                System.out.println(rs.getInt("id"));
            }

        } catch (Exception e) {
            System.out.println("Error in database");
        }
    }

    static void PayDatabase() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the id: ");
        int id = scan.nextInt();
        System.out.println("{January, February, March, April, May, June, July, August, September, October, November, and December}");
        System.out.print("Enter Month Name: ");
        String month = scan.next();
        if (isExist(id)) {
            try {
                String url = "jdbc:mysql://localhost:3306/salarymanagment";
                String user = "root";
                String pass = "";
                Connection con = DriverManager.getConnection(url, user, pass);

                String q = "update salary set " + month + "=1 where id=" + id + ";";
                Statement st = con.createStatement();
                st.executeUpdate(q);

            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Error in database");
            }

        } else {
            System.out.println("id in't valid");
        }

    }

    static boolean isExist(int id) {
        try {
            String url = "jdbc:mysql://localhost:3306/salarymanagment";
            String user = "root";
            String pass = "";
            Connection con = DriverManager.getConnection(url, user, pass);

            String q = "SELECT * FROM employeedata where id=" + id + ";";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(q);
            return rs.next();
        } catch (Exception e) {
            System.out.println("Error in database");
        }
        return false;
    }
}
