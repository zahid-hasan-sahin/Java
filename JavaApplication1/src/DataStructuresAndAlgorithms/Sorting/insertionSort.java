package DataStructuresAndAlgorithms.Sorting;

public class insertionSort {

    static void insetionSorting(int arra[]) {
        int n = arra.length;
        for (int i = 1; i < n; i++) {
            int cur = arra[i];
            int j = i - 1;
            while (j >= 0 && arra[j] > cur) {
                arra[j + 1] = arra[j];
                --j;
            }
            arra[j + 1] = cur;
        }
    }

    public static void main(String args[]) {
        int arra[] = {5, 8, 6, 7};
        insetionSorting(arra);
        for (int i = 0; i < arra.length; i++) {
            System.out.print(arra[i] + " ");
        }
    }

}
