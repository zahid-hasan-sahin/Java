package DataStructuresAndAlgorithms.Sorting;

public class selectionSort {

    public static void selectionSorting(int[] arra) {
        int n = arra.length;
        for (int i = 0; i < n; i++) {
            int m = i;
            for (int j = i; j < n; j++) {
                if (arra[m] > arra[j]) {
                    m = j;
                }
            }
            if (m != i) {
                int t = arra[i];
                arra[i] = arra[m];
                arra[m] = t;
           
            }
        }

    }

    public static void main(String args[]) {
        int[] arra = {4, 5, 67, 76, 3, 6, 3, 6, 1};
        selectionSorting(arra);
        int n = arra.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arra[i] + " ");
        }
    }
}
