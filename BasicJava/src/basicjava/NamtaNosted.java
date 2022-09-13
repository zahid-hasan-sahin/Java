
package basicjava;

import java.util.Scanner;

public class NamtaNosted {
    public static void main(String[] args){
        int f,t;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Where From : ");
        f =input.nextInt();
        System.out.print("Enter Where To : ");
         t = input.nextInt();
        for(int i=f;i<=t;i++){
            System.out.println("\n\n");
           for(int x=1;x<=10;x++){
           System.out.println(i+"x"+x+"="+x*i);
           }
            
        }
    }
    
}
