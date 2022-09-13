package problemSolving2;

import java.util.Scanner;

public class BadPrices {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        StringBuffer sb = new StringBuffer();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] price = new int[n];
            for (int i = 0; i < n; i++) {
                price[i] = scan.nextInt();
            }
            int recentMin = 10000000;
            int res=0;
            for (int i = n - 1; i >= 0; i--) {
                if(price[i]<=recentMin){
                    recentMin = price[i];
                }else{
                    ++res;
                }
            }
            sb.append(res+"\n");

        }
        System.out.println(sb);

    }
}
