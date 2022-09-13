
package ObjectOrientedPrigramming;
import java.util.Scanner;
public class RecurtionTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Number: ");
         int i;
       i = input.nextInt();
        Recurtion ob = new Recurtion();
        
        System.out.println("Facterial Of "+i+" Is "+ob.fact(i));
        
        
        
    }    
}
