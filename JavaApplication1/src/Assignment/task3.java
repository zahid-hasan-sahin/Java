package Assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class task3 {

    static void sort(int arr[], int[] id) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int p = id[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (arr[j] < key) {
                    arr[j + 1] = arr[j];
                    id[j + 1] = id[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = key;
            id[j + 1] = p;

        }
    }

    public static void main(String args[]) throws FileNotFoundException, IOException {
        File f = new File("D:\\Coding_Code\\Java\\JavaApplication1\\src\\Assignment\\input3.txt");
        Scanner scan = new Scanner(f);
        int n = scan.nextInt();
        int[] id = new int[n];
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = scan.nextInt();
        }

        for (int i = 0; i < n; i++) {
            num[i] = scan.nextInt();
        }

        sort(num, id);
        FileWriter wr = new FileWriter("D:\\Coding_Code\\Java\\JavaApplication1\\src\\Assignment\\output3.txt");
        for (int i = 0; i < n; i++) {
            wr.write(id[i] + " ");
        }
        wr.close();
    }
}
