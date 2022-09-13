package lab6;

public class one {

    static int min(int[] a, int l, int r) {
        if (l == r) {
            return l;
        }
        if (a[l] < a[r]) {
            --r;
        } else {
            ++l;
        }
        return min(a, l, r);
    }

    static void selectionSort(int a[], int currIndex) {
        if (currIndex == a.length) {
            return;
        }
        int mn = min(a, currIndex, a.length - 1);
        int temp = a[currIndex];
        a[currIndex] = a[mn];
        a[mn] = temp;
        selectionSort(a, currIndex + 1);

    }

    public static void main(String args[]) {
        int[] a = {3, 5, 3, 5, 6, 1, 6, 8, 9};
        selectionSort(a, 0);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

}
