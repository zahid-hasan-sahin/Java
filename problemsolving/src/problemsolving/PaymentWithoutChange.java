package problemsolving;

import java.util.Scanner;

public class PaymentWithoutChange {

    public static void main(String arrs[]) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        while (total-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
            int s = scan.nextInt();
            if(s/n<=a && s%n<=b && (a*n)+b>=s){
                System.out.println(" YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
