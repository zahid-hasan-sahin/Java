
package basicjava;

import java.util.Scanner;

public class ConditionalOparetor {
    public static void main(String[] args){
       int x,y,result;
       Scanner input = new Scanner(System.in);
       System.out.print("Enter Two Number : ");
       x = input.nextInt();
       y = input.nextInt();
       result = (x>y)?x:y;
       System.out.println("Big Number Is :"+result);
       
       
        
    }
    
}
