package Lab4;

import java.util.Scanner;

public class One {

    static int maxRow(int[][] arr, int n) {
        int res = 0;
        int ind = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    ++count;
                }
            }
            if (count > res) {
                res = count;
                ind = i;
            }
        }
        return ind;
    }

    static int maxCol(int[][] arr, int n) {
        int res = 0;
        int ind = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j][i] == 1) {
                    ++count;
                }
            }
            if (count > res) {
                res = count;
                ind = i;
            }
        }
        return ind;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 4;
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = (int) (Math.random() * 2);
            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        int row = maxRow(arr, n);
        int col = maxCol(arr, n);
        System.out.println("The largest row index: " + row);
        System.out.println("The largest column index: " + col);

    }
}
