
package basicjava;
import java.util.Scanner;
public class RevarseDemo {
    public static void main(String[] args){
        int u,r,sum=0;
        Scanner input = new Scanner (System.in);
        System.out.print("Enter The Number : ");
        u = input.nextInt();
        int temp = u;
        while(temp!=0){
            r = temp % 10;
            sum = sum*10+r;
           
            temp = temp/10;
            
        }
         System.out.print(sum +"\n");
     
    }
}
