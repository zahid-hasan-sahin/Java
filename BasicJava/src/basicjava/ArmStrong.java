
package basicjava;
import java.util.Scanner;
public class ArmStrong {
    public static void main(String[] args){
        int u,temp,sum=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Nubmer : ");
        u = input.nextInt();
        temp = u;
        while(temp!=0){
            int r = temp%10;
            sum =sum+r*r*r;   
            temp = temp/10;
            
        }
        if (u==sum){
            System.out.println("This Number Is ArmStrong");
        }
        else
        {
            System.out.println("This Number Is Not A ArmStrong");
        }
    }
    
}
