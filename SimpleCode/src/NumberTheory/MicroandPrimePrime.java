package NumberTheory;

import java.util.Scanner;

public class MicroandPrimePrime {

    boolean[] prime = new boolean[1000001];
    boolean[] primePrime = new boolean[1000001];
    int k = 1000001;
    int[] p = new int[1000001];

    public void primeGen() {
        prime[0] = prime[1] = true;
        for (int i = 2; i * i < k; i++) {
            if (prime[i] == false) {
                for (int j = i + i; j < k; j += i) {
                    prime[j] = true;
                }
            }
        }
        int c = 0;
        for (int i = 1; i < k; i++) {
            if (!prime[i]) {
                ++c;
            }
            if (!prime[c]) {
                primePrime[i] = true;
            }
        }
        int q = 0;
        for (int i = 0; i < k; i++) {
            if (primePrime[i]) {
                ++q;
            }
            p[i] = q;
        }

    }

    public static void main(String args[]) {
        MicroandPrimePrime ob = new MicroandPrimePrime();
        Scanner scan = new Scanner(System.in);
        ob.primeGen();
        int t = scan.nextInt();
        while (t-- > 0) {
            int l = scan.nextInt();
            int r = scan.nextInt();     
            System.out.println(ob.p[r]-ob.p[l-1]);
        }

    }

}
