package Lab4;

import java.util.Scanner;

public class Five {

    static void sort(int[] col, int[] id, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (col[j - 1] > col[j]) {
                    int temp1 = col[j - 1];
                    col[j - 1] = col[j];
                    col[j] = temp1;

                    int temp2 = id[j - 1];
                    id[j - 1] = id[j];
                    id[j] = temp2;
                }

            }
        }

    }

    public static void main(String[] args) {
       
        int n = 4;
        int[][] val = new int[n][7];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 7; j++) {
                val[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(val[i][j] + " ");
            }
            System.out.println();
        }
        int num = (int) (Math.random() * n);
        System.out.println("Sorting it by values in column " + num);

        int[] id = new int[n];
        int[] col = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
            col[i] = val[i][num];
        }
        sort(col, id, n);

        System.out.println("Output:");
        for (int i = 0; i < n; i++) {
            int curr = id[i];
            for (int j = 0; j < n; j++) {
                System.out.print(val[curr][j] + " ");
            }
            System.out.println();
        }
    }
}
