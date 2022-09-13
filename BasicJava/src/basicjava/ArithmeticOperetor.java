
package basicjava;
import java.util.Scanner;

public class ArithmeticOperetor {
    public static void main(String[] args){
       int num1,num2,result;
       Scanner input = new Scanner(System.in);
       System.out.print("ENTER FIRST NUMBER: ");
       num1 = input.nextInt();
      
       System.out.print("ENTER SECOND NUMBER: ");
       num2 = input.nextInt();
       result = num1 + num2;
       
       System.out.println("Multi= "+result);
       
       result = num1 - num2;
       System.out.println("Del= "+result);
       
       result = num1 * num2;
       System.out.println("gun = "+result);
       
      double result3 = (double)num1 / num2;
       System.out.println("vag = "+result3);
       
       result = num1 % num2;
       System.out.println("ses = "+result);
       
     
    }
    
}
