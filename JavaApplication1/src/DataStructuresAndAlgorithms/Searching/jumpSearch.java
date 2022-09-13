package DataStructuresAndAlgorithms.Searching;

public class jumpSearch {

    public static int jumpSearching(int[] arra, int k) {
        int f = 0;
        int n = arra.length;
        int l = (int) Math.floor(Math.sqrt(n));
        while (arra[Math.min(l, n) - 1] < k) {
            f = l;
            l += (int) Math.floor(Math.sqrt(n));
            if (f >= n) {
                return -1;
            }
        }
        while(arra[Math.min(f, n)]<k){
            ++f;
            if(f>=n){
                return -1;
            }
        }
        if(arra[f]==k){
            return f;
        }
        return -1;
    }

    public static void main(String args[]) {
        int[] arra = {3, 4, 5, 7, 8, 10};
        System.out.println(jumpSearching(arra, 9));

    }

}
