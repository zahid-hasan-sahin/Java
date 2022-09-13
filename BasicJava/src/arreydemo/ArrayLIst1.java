
package arreydemo;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayLIst1 {
    private static Object n;
    public static void main(String[] args){
        ArrayList<Integer> num = new ArrayList<>();
        num.add(45);
        num.add(50);
        num.add(30);
        num.add(90);
     System.out.println("Values: "+num);
     System.out.println("Total Size: "+num.size());
     System.out.println("index of 90: "+num.indexOf(90));
    
     System.out.println(num.contains(45));
        
    }
    
}
