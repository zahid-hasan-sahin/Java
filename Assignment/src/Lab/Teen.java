package Lab;

//this is for teen

public class Teen extends AbstractAge {

    //for setting age
    public Teen(int level) {
        this.level = level;
    }

    // overriding write method for writing output
    @Override
    protected void write() {
        System.out.println("Teen and age is less than" + level);
    }
}
