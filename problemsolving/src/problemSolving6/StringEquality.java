package problemSolving6;

import java.util.Scanner;

public class StringEquality {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            String a = scan.next();
            String b = scan.next();
            int[] af = new int[26];
            for (int i = 0; i < n; i++) {
                ++af[a.charAt(i) - 'a'];
            }
            int[] bf = new int[26];
            for (int i = 0; i < n; i++) {
                ++bf[b.charAt(i) - 'a'];
            }
            for (int i = 0; i < 26; i++) {
                if (af[i] < bf[i]) {
                    System.out.println("NO");
                    continue k;
                } else if (af[i] > bf[i]) {
                    int r = af[i] - bf[i];
                    int p = r / k;
                    if (p == 0 || r % k != 0) {
                        System.out.println("NO");
                        continue k;
                    } else {
                        af[i + 1] += r;
                    }

                }
            }
            System.out.println("YES");
        }
    }

}
