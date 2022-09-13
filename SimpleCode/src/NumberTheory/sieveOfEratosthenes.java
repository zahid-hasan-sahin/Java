package NumberTheory;

public class sieveOfEratosthenes {

    public static void makePrimeGen(int[] q) {
        q[0] = 1;
        q[0] = 1;
        int n = q.length;
        for (int i = 2; i * i < n; i++) {
            if (q[i] == 0) {
                for (int j = i * i; j < n; j += i) {
                    q[j] = 1;
                }
            }
        }
    }

    public static void main(String args[]) {
        int[] p = new int[26];

        makePrimeGen(p);

       
    }

}
