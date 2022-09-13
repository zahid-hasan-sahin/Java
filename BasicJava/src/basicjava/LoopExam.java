
package basicjava;
import java.util.Scanner;
public class LoopExam {
    public static void main(String[] args){
        int sum=0,i,a,b;
       Scanner input = new Scanner(System.in);
       System.out.print("Enter Where From : ");
       a = input.nextInt();
       System.out.print("Enter Where To : ");
       b = input.nextInt();       
       for( i=a;i<=b;i++){
           if(i%2==0){
               System.out.print(i+"+");
           sum = sum+i;
           }
       }
       System.out.println("="+sum);
    }
}
