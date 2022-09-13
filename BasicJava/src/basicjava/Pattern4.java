
package basicjava;
import java.util.Scanner;
public class Pattern4 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter The Number : ");
        int u = input.nextInt();
        for (int row = 1; row<=u; row++) {
            for (int col =1; col <=row; col++) {
                System.out.print("* ");
          }
            System.out.println();
   }
            for (int row =u-1; row>=1; row--) {
            for (int col =1; col <=row; col++) {
                System.out.print("* ");
          }
            System.out.println();
   }
        }
    }
    

