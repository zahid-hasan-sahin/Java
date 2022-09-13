
package basicjava;
import java.util.Scanner;
public class Tempareture {
   public static void main(String[] args){
       double f,cel;
       Scanner input = new Scanner(System.in);
       System.out.print("Enter In farenhaeight: ");
       f = input.nextDouble();
       cel = 0.555 *(f-32);
       System.out.println("In Celcius : "+cel);
       
   } 
}
