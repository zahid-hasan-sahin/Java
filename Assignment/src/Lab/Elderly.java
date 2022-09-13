package Lab;

//this is for Elder
public class Elderly extends AbstractAge {
//for setting age

    public Elderly(int level) {
        this.level = level;
    }
// overriding write method for writing output

    @Override
    protected void write() {
        System.out.println("Elderly and age is less than" + level);
    }
}
