
package basicjava;
import java.util.Scanner;
public class PalindromeDemo {
    public static void main(String [] args){
    int u,result=0;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter The Number : ");
    u = input.nextInt();
    int temp = u;
    while(temp!=0){
        int r =temp%10;
        result = result*10+r;
        temp = temp/10;
        
    }
   if(result==u){
       System.out.println("This Number Is A palndrome");
   }else{
       System.out.println("This Number Is Not A palndrome");
   }
        
    
    }
}
