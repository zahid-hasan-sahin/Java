
package problemSolving2;

import java.util.Scanner;

public class NewYearandNaming {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        String[] s = new String[n];
        String[] t = new String[m];
        for (int i = 0; i < n; i++) {
            s[i] = scan.next();
        }for (int i = 0; i < m; i++) {
            t[i] = scan.next();
        }
        int q = scan.nextInt();
        while(q-->0){
            int y = scan.nextInt();
           
            System.out.println(s[y%n==0?n-1:y%n-1] + t[y%m==0?m-1:y%m-1]);
        }       
    } 
}
