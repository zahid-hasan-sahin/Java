
package javaapplication1;
import java.util.Scanner;
public class ThereNumber {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Enter 3 Value: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if(a+b>c && a+c>b && b+c>a){
            System.out.println("Yes");
        }else{
            System.out.println("no");
        }
        
        
        
        
    }
}
