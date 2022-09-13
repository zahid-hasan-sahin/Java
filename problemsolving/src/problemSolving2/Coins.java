
package problemSolving2;

import java.util.Scanner;

public class Coins {
    public static void main(String arsg[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int s = scan.nextInt();
        System.out.println((int)Math.ceil(s/(double)n));
        
        
    }
    
}
