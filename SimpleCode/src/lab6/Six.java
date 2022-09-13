package lab6;

public class Six {

    static int binarySearch(int a[], int l, int r, int data) {
        if (l > r) {
            return -1;
        }
        int mid = (l + r) / 2;
        if (a[mid] == data) {
            return mid;
        } else if (a[mid] > data) {
            r = mid - 1;
        } else {
            l = mid + 1;
        }
        return binarySearch(a, l, r, data);
    }

    public static void main(String args[]) {
        int[] a = {10, 20, 40, 50, 60, 70, 80};
        System.out.println(binarySearch(a, 0, a.length - 1, 70));
    }
}
