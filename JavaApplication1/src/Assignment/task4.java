package Assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class task4 {

    static void merge(int a[], int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i) {
            L[i] = a[p + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = a[q + 1 + j];
        }

        int i = 0, j = 0;

        int k = p;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                a[k] = L[i];
                i++;
            } else {
                a[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            a[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            a[k] = R[j];
            j++;
            k++;
        }
    }

    static void merge_Sort(int a[], int p, int r) {
        if (p < r) {

            int q = (p + r) / 2;
            merge_Sort(a, p, q);
            merge_Sort(a, q + 1, r);

            merge(a, p, q, r);
        }
    }

    public static void main(String args[]) throws FileNotFoundException, IOException {
        File f = new File("D:\\Coding_Code\\Java\\JavaApplication1\\src\\Assignment\\input4.txt");
        Scanner scan = new Scanner(f);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        merge_Sort(a, 0, n - 1);
        FileWriter wr = new FileWriter("D:\\Coding_Code\\Java\\JavaApplication1\\src\\Assignment\\output4.txt");
        for (int i = 0; i < n; i++) {
            wr.write(a[i] + " ");
        }
        wr.close();

    }
}
