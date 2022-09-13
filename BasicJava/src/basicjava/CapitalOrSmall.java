
package basicjava;
import java.util.Scanner;

public class CapitalOrSmall {
    public static void main(String[] args){
        char ch;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Charecta : ");
        ch = input.next().charAt(0);
        if(ch >='a' && ch <='z'){
            System.out.println("Small");
        }
        else if(ch >='A' && ch <='Z'){
        System.out.println("Big");
    }else{
            System.out.println("This is not an char");
        }
        
    }
    
}
