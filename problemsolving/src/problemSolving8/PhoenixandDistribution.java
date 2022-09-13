package problemSolving8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PhoenixandDistribution {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            char a[] = scan.next().toCharArray();
            int[] f = new int[26];
            for (int i = 0; i < n; i++) {
                ++f[a[i] - 'a'];
            }
            StringBuilder sb = new StringBuilder();
            int last = 0;
            for (int i = 0; i < 26; i++) {
                if (f[i] != 0) {
                    last = i;
                }
            }
            sort(a);
            for (int i = 0; i < 26; i++) {
                if (f[i] != 0) {
                    if (f[i] < k) {
                        System.out.println(a[k - 1]);
                        continue k;
                    }
                    sb.append((char) (i + 'a'));
                    f[i] -= k;
                    break;
                }
            }
            for (int i = 0; i < 26; i++) {
                if (f[i] > 0) {
                    if (i == last) {
                        for (int j = 0; j < f[i] / k; j++) {
                            sb.append((char) (i + 'a'));
                        }
                        if (f[i] % k != 0) {
                            sb.append((char) (i + 'a'));
                        }
                        f[i] = 0;
                    }
                    break;

                }
            }
            for (int i = 0; i < 26; i++) {
                while (f[i] > 0) {
                    sb.append((char) (i + 'a'));
                    f[i]--;
                }
            }
            System.out.println(sb);
        }

    }

    static void sort(char[] a) {
        ArrayList<Character> ar = new ArrayList<Character>();
        for (int i = 0; i < a.length; i++) {
            ar.add(a[i]);
        }
        Collections.sort(ar);
        for (int i = 0; i < a.length; i++) {
            a[i] = ar.get(i);
        }
    }
}
