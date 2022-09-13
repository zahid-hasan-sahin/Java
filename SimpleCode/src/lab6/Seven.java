package lab6;

public class Seven {

    static int[] mem = new int[100000];

    static int fibo(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }
        if (mem[n] != -1) {
            return mem[n];
        }
        return mem[n] = fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String args[]) {
        for (int i = 0; i < 100000; i++) {
            mem[i] = -1;
        }
        System.out.println(fibo(10));
    }
}
