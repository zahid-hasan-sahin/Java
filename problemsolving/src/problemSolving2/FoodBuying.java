package problemSolving2;

import java.util.Scanner;

public class FoodBuying {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = 0, p = 0, res = 0;
            while (n >=10) {
                int bc = (n / 10) + (n % 10);
                res += ((n/10)*10) ;
                n = bc;


            }
            System.out.println(res+n);

        }

    }
}
