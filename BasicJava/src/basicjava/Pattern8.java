
package basicjava;
import java.util.Scanner;
public class Pattern8 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int u = input.nextInt();
        for (int row =1; row <=u; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print(" "+row*col);
                
            }
            System.out.println();
            
        }
    }
}
