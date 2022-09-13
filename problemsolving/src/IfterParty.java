
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class IfterParty {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
       
        int q = scan.nextInt();
        int t = 1;
        while (q-- > 0) {
            int p = scan.nextInt();
            int l = scan.nextInt();
            int n = p - l;
            ArrayList<Integer> res = new ArrayList<Integer>();
            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    if (i > l) {
                        res.add(i);
                    }
                    if (i != n / i) {
                        if (n / i > l) {
                            res.add(n / i);
                        }
                    }
                }
            }
            Collections.sort(res);
            System.out.print("Case " + t++ + ": ");
            if (res.size() == 0) {
                System.out.println("impossible");
            } else {
                for (int i = 0; i < res.size(); i++) {
                    if (i == res.size()-1) {
                        System.out.println(res.get(i));
                    } else {
                        System.out.print(res.get(i) + " ");
                    }
                }
            }

        }

    }
}
