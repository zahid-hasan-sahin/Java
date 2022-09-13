package Lab4;

import java.util.Scanner;

public class Four {

    static void sort(String[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[j - 1].compareTo(arr[j]) > 0) {
                    String temp1 = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp1;
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many Strings: ");
        int n = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter " + n + " words: ");
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextLine();
        }
        sort(arr,n);
        System.out.println("In the lexicographical order:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
}
