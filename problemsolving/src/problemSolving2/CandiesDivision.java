
package problemSolving2;

import java.util.Scanner;

public class CandiesDivision {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            int k = scan.nextInt();
            int temp = n/k;
            System.out.println((n-(temp*k))<= k/2?n:((temp*k)+k/2));
        }
        
    }
    
}
