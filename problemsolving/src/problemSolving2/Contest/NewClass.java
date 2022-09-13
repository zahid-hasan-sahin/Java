
package problemSolving2;

import java.util.Scanner;

public class NewClass {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while(n-->0){
            int h = scan.nextInt();
            int m = scan.nextInt();
            System.out.println((24*60)-(h*60+m));
        }
        
        
        
        
    }
}
