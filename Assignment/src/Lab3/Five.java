package Lab3;

import java.util.Random;

public class Five {

    static int minIndex(int[] a) {
        int n = a.length;
        int min = 0;
        for (int i = 0; i < n; i++) {
            if (a[min] > a[i]) {
                min = i;
            }
        }
        return min;
    }

    static int maxIndex(int[] a) {
        int n = a.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (a[max] < a[i]) {
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Random r = new Random();
        int[] a = new int[100];
        for (int i = 0; i < 100; i++) {
            a[i] = r.nextInt();
        }
        int mnInd = minIndex(a);
        int mxInd = maxIndex(a);
        System.out.println(a[mnInd] + " is minimum value and index is " + mnInd);
        System.out.println(a[mxInd] + " is maximum value and index is " + mxInd);
    }
}
