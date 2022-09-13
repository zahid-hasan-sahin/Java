package Lab;

//this is for Adult

public class Adult extends AbstractAge {
    //for setting age

    public Adult(int level) {
        this.level = level;
    }
// overriding write method for writing output

    @Override
    protected void write() {
        System.out.println("Adult and age is less than" + level);
    }
}
