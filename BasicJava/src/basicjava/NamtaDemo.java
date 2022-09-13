
package basicjava;

import java.util.Scanner;

public class NamtaDemo {
    public static void main(String[] args){
        int u;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        u = input.nextInt();
        int result =1;
        for (int i =1; i <=10; i++) {
            result = u * i;
            System.out.println(u+" x "+i+"="+result);
            
            
        }
        
    }
    
}
