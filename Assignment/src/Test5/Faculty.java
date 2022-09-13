
public class Faculty extends Member {

    String department;

    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Department: " + department);
    }
}
