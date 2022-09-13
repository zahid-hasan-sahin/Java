
package problemSolving2;

import java.util.Scanner;

public class BiliFolowers {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int l = scan.nextInt();
        System.out.println((Math.pow(l, 2)-Math.pow(h, 2))/(2*h));
        
        
    }
    
}
