
package problemSolving2;

import java.util.Scanner;

public class DrazilandDate {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = Math.abs(scan.nextInt());
        int b = Math.abs(scan.nextInt());
        int s = scan.nextInt();
        System.out.println((a+b)<=s && ((a+b)-s)%2==0?"YES":"NO");
        
    }
    
}
