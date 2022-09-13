
package problemSolving3;

import java.util.Scanner;

public class ComparetheTriplets {
    public static void main(String argss[]){
        Scanner scan = new Scanner(System.in);
       int t = scan.nextInt();
       int q = 0;
       while(q++<t){
           int a = scan.nextInt();
           int b = scan.nextInt();
           System.out.println("Case "+q+": "+(a+b));
       }
        
    }
}
