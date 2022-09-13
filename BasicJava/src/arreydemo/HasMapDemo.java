
package arreydemo;
import java.util.HashMap;

public class HasMapDemo {
    public static void main(String[] args){
        
        HashMap<Integer,String> has = new HashMap<>();
        
         has.put(100, "zahid");
          has.put(110, "Sahin");
         System.out.println(has.size());
         System.out.println(has.get(100));
         System.out.println(has.isEmpty());
        
        
    }
    
}
