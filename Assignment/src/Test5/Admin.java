
public class Admin extends Member {

    String rank;

    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Rank: " + rank);
    }
}
