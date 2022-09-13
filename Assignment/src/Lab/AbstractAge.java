package Lab;

// this is super class for all other class adult,Elderly,Teen,child 
//this is abstract class also
public abstract class AbstractAge {

    //setting  age range 
    public static int child = 12;
    public static int teen = 19;
    public static int adult = 59;
    public static int elderly = 200;

    //nextLogger for store next Chain element
    protected AbstractAge nextLogger;

    //setting next chain element
    public void setNextLogger(AbstractAge nextLogger) {
        this.nextLogger = nextLogger;
    }
    //this is for store age
    protected int level;

    //this is for setting age
    public void logMessage(int level) {
        if (this.level <= level) {
            write();
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level);
        }
    }
    //for writing output
    abstract protected void write();

}
