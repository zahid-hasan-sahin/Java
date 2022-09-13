
package basicjava;
import java.util.Scanner;
public class Pattern5 {
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter The Number: ");
        int u = input.nextInt();
        for (int row = u; row >=1; row--) {
            for (int i = 1; i<=u-row; i++) {
                System.out.print(" ");
                }
            for (int col = 1; col <=row; col++) {
                System.out.print(col);
            }
             System.out.println();
        }
       
    }
    
}
