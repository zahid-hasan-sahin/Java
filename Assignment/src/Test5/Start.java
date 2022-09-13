

public class Start {

    public static void main(String[] args) {
        Admin manager = new Admin();
        manager.name = "A";
        manager.age = 35;
        manager.address = "Address1";
        manager.salary = 50000;
        manager.phoneNumber = 01700000000;
        manager.rank = "Manger";
        
        Faculty employee = new Faculty();
        employee.name = "B";
        employee.age = 25;
        employee.address = "Address2";
        employee.salary = 25000;
        employee.phoneNumber = 01600000000;
        employee.department = "Sales";
        manager.showDetails();
        employee.showDetails();

    }
}
