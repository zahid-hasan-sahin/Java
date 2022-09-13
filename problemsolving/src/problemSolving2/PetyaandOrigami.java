
package problemSolving2;

import java.util.Scanner;

public class PetyaandOrigami {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int  n = scan.nextInt();
        int k = scan.nextInt();
        System.out.println((int)(Math.ceil((n*2.0)/k)+ Math.ceil((n*5.0)/k)+Math.ceil((n*8.0)/k)));
        
    }
    
}
