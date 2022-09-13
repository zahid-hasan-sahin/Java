package lightOj;

import java.util.Scanner;

public class PalindromicNumbers {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        int t = 1;
        while (q-- > 0) {
            int n = scan.nextInt();
            int m = n;
            int tmp = 0;
            while (n !=0) {
                tmp = (tmp * 10) + (n % 10);
                n = n/10;          
            }
            System.out.print("Case "+t+++": ");
            if(tmp==m){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
