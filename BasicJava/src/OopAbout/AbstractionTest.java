
package OopAbout;

public class AbstractionTest {
    public static void main(String[] args){
        AbstractionMsg ob = new AbstractionSahin();
        ob.msg();
        ob = new AbstractionZahid();
        ob.msg();
        ob.call();
    }
    
}
