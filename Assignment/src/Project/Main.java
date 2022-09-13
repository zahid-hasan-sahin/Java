package Project;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while (true) {
            System.out.println("Pres 1 - Add Employee\n"
                    + "Pres 2 - Remove Employee\n"
                    + "Pres 3 - List Of Employee\n"
                    + "Pres 4 - Edit Employee Data\n"
                    + "Pres 5 - Payroll Details\n"
                    + "Pres 6 - Make Payroll\n"
                    + "Pres 7 - End\n"
                    + "Enter your Command:");
            Scanner scan = new Scanner(System.in);
            int com = scan.nextInt();
            if (com == 1) {
                EmplyeeDataHandle.addEmployeeToDatabase();
                System.out.println("\n\n");
            } else if (com == 2) {
                EmplyeeDataHandle.deleteEmployeeFromDatabase();
                System.out.println("\n\n");
            }
            if (com == 3) {
                EmplyeeDataHandle.ListOfEmployee();
                System.out.println("\n\n");
            }
            if (com == 4) {
                EmplyeeDataHandle.updateEmployeeData();
                System.out.println("\n\n");
            }
            if (com == 5) {
                EmplyeeDataHandle.payrollDetiailsFromDatabase();
                System.out.println("\n\n");
            }
            if (com == 6) {
                EmplyeeDataHandle.PayDatabase();
                System.out.println("\n\n");
            }
            if (com == 7) {
                System.exit(0);
            }
        }
    }
}
