package Lab;

//this is for child
public class Child extends AbstractAge {
    
    //for setting age
    public Child(int level) {
        this.level = level;
    }

    // overriding write method for writing output
    @Override
    protected void write() {
        System.out.println("child and age is less than" + level);
    }
}
