
package problemSolving2;

import java.util.Scanner;

public class TrickySum {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            long n = scan.nextInt();
            long res = 0;
            res = (n*(n+1))/2;
            long powOfTwoSum = 0;
            int i = 0;
            while(Math.pow(2,i)<=n){
                powOfTwoSum += Math.pow(2, i);
                ++i;
            }
            System.out.println(res-powOfTwoSum*2);
        }
        
    }
    
}
