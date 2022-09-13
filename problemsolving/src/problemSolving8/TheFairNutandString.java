package problemSolving8;

import java.util.ArrayList;
import java.util.Scanner;

public class TheFairNutandString {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int n = s.length();
        long res = 0;

        s += 'b';
        ArrayList<Integer> ar = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int c = 0;
            if (s.charAt(i) == 'a') {
                while (s.charAt(i) != 'b') {
                    if (s.charAt(i) == 'a') {
                        ++c;
                    }
                    ++i;
                }
                ar.add(c);
            }
        }
        long mod = 1000000007;
        for (int i = 0; i < ar.size(); i++) {

            res += ((res) % mod * (ar.get(i) % mod)) % mod;
            res %= mod;
            res = res + ar.get(i);
            res %= mod;

        }
        System.out.println(res);
    }
}
