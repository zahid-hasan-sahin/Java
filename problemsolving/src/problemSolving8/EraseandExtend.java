package problemSolving8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EraseandExtend {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        String s = scan.next();
        StringBuilder sb = new StringBuilder();
        ArrayList<String> a = new ArrayList<String>();
        for (int i = 0; i < Math.min(n, k); i++) {
            sb = sb.append(s.charAt(i));
            StringBuilder sk = new StringBuilder(sb);
            int p = k - sb.length();
            int r = sb.length();
            while (sk.length() != k) {

                sk.append(sb.substring(0, Math.min(sb.length(), p)));
                p -= r;
            }

            String sr = String.valueOf(sk);
            a.add(sr);
        }
        Collections.sort(a);
        System.out.println(a.get(0));
    }

}
