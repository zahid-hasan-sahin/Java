package Assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class task1 {
// Best case occurs when array is already sorted.

    static void bubbleSort(int a[], int n) {

        boolean swap;
        for (int i = 0; i < n - 1; i++) {
            swap = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swap = true;
                }
            }

            // If no elements were
            // swapped by inner loop, then break 
            if (swap == false) {
                break;
            }
        }
    }

    public static void main(String args[]) throws FileNotFoundException, IOException {
        //getting input
        File f = new File("D:\\Coding_Code\\Java\\JavaApplication1\\src\\Assignment\\input1.txt");
        Scanner scan = new Scanner(f);

        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        //calling bubbleSort
        bubbleSort(a, n);

        //putting  result in output File
        FileWriter wr = new FileWriter("D:\\Coding_Code\\Java\\JavaApplication1\\src\\Assignment\\output1.txt");
        for (int i = 0; i < n; i++) {
            wr.write(a[i] + " ");
        }
        wr.close();
    }
}
