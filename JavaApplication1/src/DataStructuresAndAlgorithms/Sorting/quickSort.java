package DataStructuresAndAlgorithms.Sorting;

public class quickSort {

    public void swap(int[] arra, int l, int j) {
        int temp = arra[l];
        arra[l] = arra[j];
        arra[j] = temp;
    }

    public int quick(int[] arra, int l, int r, int p) {
        int f = l;
        int s = r;
        while (true) {
            while (arra[f] <= p && f < r) {
                ++f;
            }
            while (arra[s] >= p && s > 0) {
                --s;
            }

            if (f >= s) {
                break;
            } else {
                swap(arra, f, s);

            }

        }
        swap(arra, f, r);
        return f;

    }

    public void sort(int[] arra, int l, int r) {
        if (r - l <= 0) {
            return;
        }
        int pivot = arra[r];
        int next = quick(arra, l, r, pivot);
        sort(arra, l, next - 1);
        sort(arra, next + 1, r);

    }

    public static void main(String args[]) {
        int[] arra = {7, 6, 9, 3, 9, 4};
        quickSort ob = new quickSort();
        ob.sort(arra, 0, arra.length - 1);
        for (int i = 0; i < arra.length; i++) {
            System.out.print(arra[i] + " ");
        }
    }
}
