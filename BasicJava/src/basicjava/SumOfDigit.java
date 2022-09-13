
package basicjava;
import java.util.Scanner;
public class SumOfDigit {
    public static void main(String [] args){
        int u,temp,r,v,sum=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        u = input.nextInt();
        temp = u;  
        while(temp!=0){
           r = temp%10;
           v = temp/10;
           sum = sum + r;
           temp = v;
        }
        System.out.println("Total: "+sum);
        
        
    }
    
}
