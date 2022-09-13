package DataStructuresAndAlgorithms.Searching;

public class binarySearch {

    public static int binarySearch(int[] arra, int n, int k) {
        int l = 0;
        int r = n - 1;
        while (l <=r) {
            int mid = (l + r) / 2;
            if (arra[mid] == k) {
                return mid + 1;
            } else if (arra[mid] < k) {
                l = mid+1;
            } else {
                r = mid-1;
            }        
        }
        return -1;
    }

    public static void main(String args[]) {
        int[] arra = {2, 5, 6, 7, 8, 10, 13, 56};
        System.out.println(binarySearch(arra, arra.length, 143));
    }

}
