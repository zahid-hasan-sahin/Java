
package basicjava;
import java.util.Scanner;
public class Pattern7 {
    public static void main(String [] args ){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int u = input.nextInt();
        for (int row = 1; row <=u; row++) {
            for (int col = 1; col <=u; col++) {
                char r = (char)(col+64);
                System.out.print(r);
            }
          System.out.println();
        }
    }
}
