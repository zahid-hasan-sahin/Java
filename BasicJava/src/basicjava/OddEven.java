
package basicjava;
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args){
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Any Intezer Number: ");
        num = input.nextInt();
        if(num%2==0){
            System.out.println("This Number Is An jor");
        }
        else{
            System.out.println("This Number Is An Bijor");
        }
    }
    
}
