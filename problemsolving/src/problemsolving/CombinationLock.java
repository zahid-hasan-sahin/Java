package problemsolving;

import java.util.Scanner;

public class CombinationLock {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String a = scan.next();
        String b = scan.next();
        int res = 0;
        for (int i = 0; i < n; i++) {
            int ai = a.charAt(i) - '0';
            int bi = b.charAt(i) - '0';
            if (ai > bi) {
                res = res + Math.min(ai-bi,(bi+10)-ai);
            }else{
                res = res + Math.min(bi-ai,(ai+10)-bi);
            }

        }
        System.out.println(res);

    }

}
