
package ObjectOrientedPrigramming;

public class CallByValueTest {
    public static void main(String[] args){
        CallByValue x = new CallByValue();
        x.name = "zahid";
        System.out.println(x.name);
        x.met(x);
        System.out.println(x.name);
        
    }
    
}
