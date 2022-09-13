
package basicjava;

import java.util.Scanner;

public class Factorial {
    public static void main(String [] args){
       
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The number: ");
        int u = input.nextInt();
        int sum = 1;
        for(int i=u;i>=1;i--){
           
           sum = sum*i;
         
    }
        System.out.println("Facterial of "+u+" = "+ sum);
    }
}
