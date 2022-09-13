package problemSolving2;

import java.util.Scanner;

public class DivisibilitybyEight {

    static void combinationUtil(char arr[], int n, int r,
            int index, char data[], int i) {
        if (index == r) {
            for (int j = 0; j < r; j++) {
                System.out.print(data[j] + " ");
            }
            System.out.println("");
            return;
        }
        if (i >= n) {
            return;
        }
        data[index] = arr[i];
        combinationUtil(arr, n, r, index + 1,
                data, i + 1);

        combinationUtil(arr, n, r, index, data, i + 1);
    }

    static void printCombination(char arr[], int n, int r) {

        char data[] = new char[r];

        combinationUtil(arr, n, r, 0, data, 0);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int r = 3;
        int n = s.length();
        printCombination(s.toCharArray(), n, r);
    }
}
