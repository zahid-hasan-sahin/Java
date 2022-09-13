package problemSolving8;

import java.util.Scanner;
import java.util.ArrayList;

public class CampSchedule {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String t = scan.next();
        int n = s.length();
        int m = t.length();
        int mx = m;
        int l = 0;
        int r = m - 1;
        Hash h1 = new Hash("");
        Hash h2 = new Hash("");
        while (l <= r) {
            h1.addLast(t.charAt(l));
            h2.addFirst(t.charAt(r));
            if (h1.compare(h2)) {

                mx = r;
            }
            --r;
            ++l;
        }
        mx = Math.max(r / 2, mx);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < mx; i++) {
            sb.append(t.charAt(i));
        }
        int o = 0;
        int z = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                ++o;
            } else {
                ++z;
            }
        }
        System.out.println(sb);
        StringBuilder res = new StringBuilder();
        int i = 0;
        int p = sb.length();
        while (sb.length() != 0) {
            if (sb.charAt(i % p) == '1') {
                if (o == 0) {
                    break;
                }
                res.append(1);
                --o;

            }

            if (sb.charAt(i % p) == '0') {
                if (z == 0) {
                    break;
                }
                res.append(0);
                --z;

            }
            ++i;
        }

        while (o != 0) {
            res.append("1");
            --o;
        }

        while (z != 0) {
            res.append("0");
            --z;
        }
        System.out.println(res);

    }

}

class Hash {

    /*
        case sensitive
     */
    String str;
    long base1 = 127;
    long mod1 = 999999929;
    long base2 = 131;
    long mod2 = 999999937;
    long hashValue1 = 0;
    long hashValue2 = 0;
    ArrayList<Long> power1;
    ArrayList<Long> power2;

    Hash(String s) {
        str = s;
        power1 = new ArrayList<Long>();
        power2 = new ArrayList<Long>();
        power1.add(1l);
        power2.add(1l);
        hashValue1 = compute(s, base1, mod1, power1);
        hashValue2 = compute(s, base2, mod2, power2);
    }

    void addFirst(char c) {
        long pow = power1.get(power1.size() - 1);

        hashValue1 = (hashValue1 + (c) * pow) % mod1;
        pow = (pow * base1) % mod1;
        power1.add(pow);

        pow = power2.get(power2.size() - 1);
        hashValue2 = (hashValue2 + (c) * pow) % mod2;
        pow = (pow * base2) % mod2;
        power2.add(pow);

    }

    void addLast(char c) {
        long pow = power1.get(power1.size() - 1);
        hashValue1 = hashValue1 * base1;

        hashValue1 = (hashValue1 + (c)) % mod1;
        pow = (pow * base1) % mod1;
        power1.add(pow);

        pow = power2.get(power2.size() - 1);
        hashValue2 = hashValue2 * base2;
        hashValue2 = (hashValue2 + (c)) % mod2;
        pow = (pow * base2) % mod2;
        power2.add(pow);

    }

    boolean compare(Hash ob) {
        if (ob.hashValue1 == this.hashValue1 && ob.hashValue2 == this.hashValue2) {
            return true;
        }
        return false;

    }

    long compute(String s, long p, long m, ArrayList<Long> power) {
        long hash_value = 0;
        long pow = 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            hash_value = (hash_value + (c) * pow) % m;
            pow = (pow * p) % m;

            power.add(pow);
        }
        return hash_value;
    }
}
