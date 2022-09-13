
package DataStructuresAndAlgorithms.Searching;



class ternarySearch {

    public static void main(String[] args) {

    int arra[]= {5,7,8,9,10};
    System.out.println(ternarySearching(arra,0,arra.length,4));
    }

    static int ternarySearching(int arr[], int l,
            int r, int x) {
        int n = arr.length;
        if (r >= l) {
            int mid1 = l + (r - l) / 3;
            int mid2 = mid1 + (r - l) / 3;
            if(mid1>=n || mid2>=n){
                return -1;
            }
            // If x is present at the mid1 
            if (arr[mid1] == x) {
                return mid1;
            }

            // If x is present at the mid2 
            if (arr[mid2] == x) {
                return mid2;
            }

            // If x is present in left one-third 
            if (arr[mid1] > x) {
                return ternarySearching(arr, l, mid1 - 1, x);
            }

            // If x is present in right one-third 
            if (arr[mid2] < x) {
                return ternarySearching(arr, mid2 + 1, r, x);
            }

            // If x is present in middle one-third 
            return ternarySearching(arr, mid1 + 1,
                    mid2 - 1, x);
        }

// We reach here when element is 
// not present in array 
        return -1;
    }
}
