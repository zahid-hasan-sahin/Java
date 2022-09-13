
package arreydemo;
import java.util.ArrayList;
public class ArrayList2 {
    public static void main(String[] args){
        ArrayList<Integer> num1 = new ArrayList<>();
        ArrayList<Integer> num2 = new ArrayList<>();
        ArrayList<Integer> num3 = new ArrayList<>();
       
        num1.add(10);
        num1.add(20);
        num1.add(30);
        
        num2.add(1);
        num2.add(2);
        num2.add(3);
        
        num3.addAll(num2);
        num3.addAll(num1);
        
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num3.equals(num1));
        
        
        
    }
    
}
