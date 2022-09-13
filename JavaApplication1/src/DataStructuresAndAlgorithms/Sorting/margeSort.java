package DataStructuresAndAlgorithms.Sorting;

public class margeSort {

    public int marge(int[] arra, int l, int m, int r) {
        int f, s, i;
        f = l;
        s = m + 1;
        int temp[] = new int[r + 1];
        for (i = l; l <= m && s <= r; i++) {
            if (arra[l] < arra[s]) {
                temp[i] = arra[l++];
            } else {
                temp[i] = arra[s++];
            }
        }
        
        while (l <= m) {
            temp[i++] = arra[l++];
        }
        while (s <= r) {
            temp[i++] = arra[s++];
        }
        for (int j = f; j <= r; j++) {
            arra[j] = temp[j];
        }
        return 0;
     

    }

    public void sort(int[] arra, int l, int r) {
        if (l >= r) {
            return;
        }
        int m = (l + r) / 2;
        sort(arra, l, m);
        sort(arra, m + 1, r);
        marge(arra, l, m, r);
    }

    public static void main(String args[]) {
        int[] arra = {3, 2, 7, 3, 8, 1, 9, 5, 4};
        margeSort ob = new margeSort();
        ob.sort(arra, 0, arra.length - 1);
        for (int i = 0; i < arra.length; i++) {
            System.out.print(arra[i]+" ");
        }
        System.out.println();
    }

}
