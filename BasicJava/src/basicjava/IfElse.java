package basicjava;
import java.util.Scanner;
public class IfElse{
    public static void main(String[] args){
        int x;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Any Intezar Number : ");
        x = input.nextInt();
        if(x>0){
            System.out.println("This Is An POsitive Number");
        }
        else if(x==0){
            System.out.println("This Is Zero");
        }
        else{
            System.out.println("This Is Negative NUmber");
        
    }
 
    }
}
