
package arreydemo;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListSort {
    public static void main(String[] args){
        ArrayList<Integer> num = new ArrayList<>();
        num.add(3);
        num.add(4);
        num.add(-5);
        num.add(-3); System.out.println(num);
        Collections.sort(num);
        System.out.println(num);
        Collections.sort(num,Collections.reverseOrder());
        System.out.println(num);
        
    }
    
}
