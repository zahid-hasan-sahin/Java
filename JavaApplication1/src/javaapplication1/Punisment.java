
package javaapplication1;
import java.util.Scanner;
public class Punisment {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int c = 0;
        System.out.print("Please Enter A Integer Value: ");
        int g = scan.nextInt();
        for (int i = 2; i < g; i++) {
            if(g%i!=0){
                c++;
                        
               
            }else{
                c=0;
                break;
                
                
            }
            if(c==0){
                System.out.println("Not Prime");
            }
            else{
                System.out.println("Prime");
                c = 0;
            }
            
            
        }
        
    }
}
