
package problemSolving3;

import java.util.Scanner;

public class NewClass {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
        int n  = scan.nextInt();
        int m = scan.nextInt();
        if(n<=4){
            System.out.println("NO");
        }else{
            if(n%m==0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        
        }
    }
}
