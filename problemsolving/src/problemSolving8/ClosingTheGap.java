package problemSolving8;

import java.util.Scanner;

public class ClosingTheGap {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            long sum = 0;
            for (int i = 0; i < n; i++) {
                sum += scan.nextInt();
            }
            if(sum%n==0){
                System.out.println("0");
            }else{
                System.out.println("1");
            }
        }
    }

}
