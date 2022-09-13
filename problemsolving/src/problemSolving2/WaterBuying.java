
package problemSolving2;

import java.util.Scanner;

public class WaterBuying {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            long n = scan.nextLong();
            int a = scan.nextInt();
            int b = scan.nextInt();
            if(a<=b/2.0){
                System.out.println(n*a);
            }else{
                System.out.println((n/2)*b+(n%2)*a);
            }                
        }      
    }
    
}
