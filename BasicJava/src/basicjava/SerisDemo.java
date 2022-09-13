
package basicjava;

import java.util.Scanner;

public class SerisDemo {
    public static void main(String [] args ){
        int i,x,y,z;
        Scanner input =new Scanner(System.in);
        System.out.print("Enter Where From : ");
        x = input.nextInt();
        System.out.print("Enter Where to : ");
        y = input.nextInt();
        System.out.print("Enter Defarance : ");
        z = input.nextInt();
        int sum = 0;
        for (i=x;i<=y;i=i+z){
            System.out.print(i);
                
           sum = sum+i;   
           if(i!=y){
               System.out.print("+"); 
           }
        }
        System.out.println("=" +sum);
        
        
    }
    
}
