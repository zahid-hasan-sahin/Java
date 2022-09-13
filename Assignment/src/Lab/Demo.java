package Lab;
//this is tester class

public class Demo {

    //making change and for sending instance
    private static AbstractAge getChainOfLoggers() {

        AbstractAge c = new Child(AbstractAge.child);
        AbstractAge t = new Teen(AbstractAge.teen);
        AbstractAge a = new Adult(AbstractAge.adult);
        AbstractAge e = new Elderly(AbstractAge.elderly);

        c.setNextLogger(t);
        t.setNextLogger(a);
        a.setNextLogger(e);

        return c;
    }

    public static void main(String[] args) {
        //getting instance of AbstractAge class
        AbstractAge loggerChain = getChainOfLoggers();

        //Calling logMessage messege with sending age as parameter.
        loggerChain.logMessage(10);

        loggerChain.logMessage(50);

        loggerChain.logMessage(100);

        loggerChain.logMessage(20);
    }
}
