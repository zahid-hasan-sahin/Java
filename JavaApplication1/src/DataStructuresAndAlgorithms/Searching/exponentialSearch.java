package DataStructuresAndAlgorithms.Searching;

public class exponentialSearch {

    static int exponetialSearching(int[] arra, int k) {
        if (arra[0] == k) {
            return 0;
        }
        int i = 1;
        int n = arra.length;
        while (i < n && arra[i] < k) {
            i *= 2;
        }
        exponentialSearch p = new exponentialSearch();
        return p.binarySearching(arra, i / 2, Math.min(n - 1, i), k);
    }

    int binarySearching(int[] arra, int l, int r, int k) {
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arra[mid] == k) {
                return mid;
            } else if (arra[mid] < k) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arra[] = {4, 5, 7, 9, 10};
        System.out.println(exponetialSearching(arra, 9));

    }

}
