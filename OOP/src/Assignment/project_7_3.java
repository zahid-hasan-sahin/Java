package Assignment;

/**
 * Class for sorting an array of base type int from smallest to largest.
 */
public class project_7_3 {

    static void bubbleSort(int[] a) {
        int n = a.length;
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n - 1; i++) {
                if (a[i] > a[i + 1]) {
                    interchange(i, i + 1, a);
                }
            }
        }

    }

    private static void interchange(int i, int j, int[] a) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp; //original value of a[i]
    }
}

class Tester6 {

    public static void main(String[] args) {

        int[] a = {3, -5, 6, 1, -3, 5, 6};
        project_7_3.bubbleSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

    }
}
