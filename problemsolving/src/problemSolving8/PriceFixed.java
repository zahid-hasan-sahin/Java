package problemSolving8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PriceFixed {

    static void merge(st arr[], int l, int m, int r) {

        int n1 = m - l + 1;
        int n2 = r - m;
        st L[] = new st[n1];
        st R[] = new st[n2];

        for (int i = 0; i < n1; ++i) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[m + 1 + j];
        }

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i].val >= R[j].val) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    static void sort(st arr[], int l, int r) {
        if (l < r) {

            int m = l + (r - l) / 2;

            sort(arr, l, m);
            sort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        st[] a = new st[n];
        st[] dec = new st[n];
        for (int i = 0; i < n; i++) {
            a[i] = new st();
            dec[i] = new st();
        }

        for (int i = 0; i < n; i++) {
            a[i].need = scan.nextLong();
            a[i].val = scan.nextLong();

            dec[i].need = a[i].need;
            dec[i].val = a[i].val;
        }
        sort(dec, 0, n - 1);

        int l = 0;
        int r = n - 1;
        long tot = 0;
        long res = 0;
        while (l < r) {
            if (tot >= dec[r].val) {
                res += dec[r].need;
                tot += dec[r].need;
                --r;
                continue;
            }
            if (tot + dec[l].need >= dec[r].val) {
                long k = dec[r].val - tot;
                res += (k * 2);
                tot += k;
                dec[l].need -= k;
                res += (dec[r].need);
                tot += (dec[r].need);
                --r;
            } else {
                res += (dec[l].need * 2);
                tot += (dec[l].need);
                ++l;
            }
        }
       

        if (dec[l].need != 0 && tot + dec[l].need >= dec[l].val) {
            if (tot >= dec[r].val) {
                res += dec[r].need;
                tot += dec[r].need;
            } else {
                long k = dec[l].val - tot;
                res += (k * 2);
                dec[l].need -= k;
                res += dec[l].need;
            }
        } else {
            res += (dec[l].need * 2);
        }

        System.out.println(res);
    }

}

class st {

    long val, need;

}
