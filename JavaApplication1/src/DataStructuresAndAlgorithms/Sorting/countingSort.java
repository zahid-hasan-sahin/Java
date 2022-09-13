package DataStructuresAndAlgorithms.Sorting;

public class countingSort {

    public static void sort(int[] arra) {
        int n = arra.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            min = Math.min(min, arra[i]);
            max = Math.max(max, arra[i]);
        }
        int[] count = new int[max - min + 1];
        
        
        int[] out = new int[n];
        for (int i = 0; i < n; i++) {
            ++count[arra[i] - min];
            System.out.println(arra[i]+" "+(arra[i]-min));
        }

    }

    public static void main(String args[]) {

        int[][] arra = new int[3][3];
        arra[0][1] = 6;

    }

}
