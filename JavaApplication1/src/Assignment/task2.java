package Assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class task2 {

    static void selectionSort(int a[], int n) {

        for (int i = 0; i < n - 1; i++) {

            int m = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[m]) {
                    m = j;
                }
            }

            int t = a[m];
            a[m] = a[i];
            a[i] = t;
        }
    }

    public static void main(String args[]) throws FileNotFoundException, IOException {
        File f = new File("D:\\Coding_Code\\Java\\JavaApplication1\\src\\Assignment\\input2.txt");
        Scanner scan = new Scanner(f);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        selectionSort(a, n);
        FileWriter wr = new FileWriter("D:\\Coding_Code\\Java\\JavaApplication1\\src\\Assignment\\output2.txt");
        for (int i = 0; i < m; i++) {
            wr.write(a[i] + " ");
        }
        wr.close();
    }
}
