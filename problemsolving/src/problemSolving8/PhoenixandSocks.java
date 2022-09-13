package problemSolving8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class PhoenixandSocks {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = scan.nextInt();
            int l = scan.nextInt();
            int r = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            int[] al = new int[n + 10];
            int[] ar = new int[n + 10];
            for (int i = 0; i < l; i++) {
                ++al[a[i]];
            }
            for (int i = l; i < n; i++) {
                ++ar[a[i]];
            }
         
            int res = 0;
            if (l > r) {
                for (int i = 0; i <= n; i++) {
                    if (l == r) {
                        break;
                    }

                    while (l != r && al[i] != ar[i] && (al[i] - ar[i]) / 2 > 0) {

                        ++ar[i];
                        --al[i];
                        ++r;
                        --l;
                        ++res;
                    }

                }
            } else {
                for (int i = 0; i <= n; i++) {
                    if (l == r) {
                        break;
                    }
                    while (l != r && al[i] != ar[i] && (ar[i] - al[i]) / 2 > 0) {
                        --ar[i];
                        ++al[i];
                        --r;
                        ++l;
                        ++res;
                    }
                }
            }

            if (l > r) {
                for (int i = 0; i <= n; i++) {
                    if (l == r) {
                        break;
                    }
                    while (al[i] != 0 && l > r && al[i] > ar[i]) {
                        --al[i];
                        ++ar[i];
                        ++res;
                        ++r;
                        --l;
                    }
                }
            } else {
                for (int i = 0; i <= n; i++) {
                    if (l == r) {
                        break;
                    }
                    while (ar[i] != 0 && l < r && al[i] < ar[i]) {
                        ++al[i];
                        --ar[i];
                        ++res;
                        --r;
                        ++l;
                    }
                }
            }

            ArrayList<Integer> right = new ArrayList<Integer>();
            HashMap<Integer, Integer> left = new HashMap<Integer, Integer>();
            for (int i = 0; i <= n; i++) {
                while (al[i] != 0) {
                    left.put(i, left.getOrDefault(i, 0) + 1);
                    --al[i];
                }
                while (ar[i] != 0) {

                    right.add(i);
                    --ar[i];
                }
            }
         
            for (int i = 0; i < right.size(); i++) {
                if (left.getOrDefault(right.get(i), 0) == 0) {
                    ++res;
                } else {
                    left.put(right.get(i), left.get(right.get(i)) - 1);
                }
            }

            sb.append(res + "\n");
            
        }
         System.out.println(sb);
    }

}
