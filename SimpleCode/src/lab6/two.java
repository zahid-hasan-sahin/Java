package lab6;

public class two {

    static void insertionSort(int a[], int n) {
        if (n == 0 || n == 1) {
            return;
        }

        insertionSort(a, n - 1);
        int last = a[n];
        int j = n - 1;
        while (j >= 0 && a[j] >= last) {
            a[j + 1] = a[j];
            j--;
        }
        a[j + 1] = last;
    }

    public static void main(String args[]) {
        int[] a = {3, 5, 3, 5, 6, 1, 6, 8, 9};
        insertionSort(a, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
