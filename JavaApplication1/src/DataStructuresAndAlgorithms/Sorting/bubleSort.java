package DataStructuresAndAlgorithms.Sorting;

public class bubleSort {

    static void bubleSorting(int arra[]) {
        int n = arra.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arra[j] > arra[j + 1]) {
                    int temp = arra[j];
                    arra[j] = arra[j + 1];
                    arra[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String args[]) {
        int arra[] = {45, 5, 4};
        bubleSorting(arra);
        for (int i = 0; i < arra.length; i++) {
            System.out.print(arra[i] + " ");

        }
        System.out.println();

    }

}
