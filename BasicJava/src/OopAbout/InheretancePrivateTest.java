
package OopAbout;

public class InheretancePrivateTest {
    public static void main (String [] args){
        InheretancePrivate1 ob = new InheretancePrivate1();
        ob.setName("sahin");
        ob.setAge(20);
        ob.setEdu("Chapai");
        ob.Display();
        InheretancePrivate ob1 = new InheretancePrivate1();
        InheretancePrivate ob2 = new InheretancePrivate();
        Inheretance ob3 = new Inheretance();
        System.out.println(ob2 instanceof InheretancePrivate1);
        
        
    }
    
}
