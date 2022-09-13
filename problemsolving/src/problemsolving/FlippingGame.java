package problemsolving;

import java.util.Scanner;

public class FlippingGame {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] num = new int[n];
        int one = 0;
        int zero = 0;
        int res = 0;
        int temp = 0;
        int ans = 0;
        int tone=0;
        int fin = 0;
        int lin = 0;
        for (int i = 0; i < n; i++) {
            num[i] = scan.nextInt();
            if (num[i] == 1) {
                one++;
                fin = one;
                
            } else {
                zero++;
                temp = zero;
                fin = 0;
            }
            if(fin>temp){
                lin = one;
                res = temp;
                ans = temp - 1;
                one = 0;
                zero = 0;
            }
        }
        System.out.println(one);
        System.out.println(zero);
        System.out.println(res);
        System.out.println(lin);

    }
    

}
