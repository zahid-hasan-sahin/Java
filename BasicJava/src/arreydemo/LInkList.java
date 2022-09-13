
package arreydemo;
import java.util.LinkedList;
public class LInkList {
    public static void main(String[] args){
        
        LinkedList<String> link = new LinkedList<>();
        link.add("Zahid");
        link.add("Hasan");
        link.add("Sahin");
        link.add("Fahim");
        link.add("Samim");
        link.addLast("tuhin");
        
        for(String f : link){
            System.out.println(f);
        }
    }
    
}
