
package basicjava;
import java.util.Scanner;
public class Pattern12 {
   public static void main(String[] args){
       Scanner input = new Scanner (System.in);
       System.out.print("Enter The Number : ");
       int u = input.nextInt();
       for (int row = 1; row <=u; row++) {
           for (int col = 1; col <=u; col++) {
               if(row+col==u+1||row==col){
                   System.out.print("*");
               }
               else{
                   System.out.print(" ");
               }
              
           
           }
           System.out.println();
       }
   } 
}
