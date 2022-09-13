package problemSolving2;

import java.util.Scanner;

public class FromHerotoZero {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        StringBuffer sb = new StringBuffer();
        while (t-- > 0) {
            long n = scan.nextLong();
            long k = scan.nextLong();
            long res = 0;
            while (n > 0) {
                if (n % k == 0) {
                    n = n / k;
                    ++res;
                } else {
                    res += n % k;
                    long temp = n/k;
                    n = k*temp;
                }

            }
            sb.append(res+"\n");
        }
        System.out.println(sb);
    }

}
