package javaapplication1;

public class NewClass20 {

    public static void main(String args[]) {
        int n = 20;
        int res = n + 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i != i) {
                    res += i;
                    res += n / i;
                } else {
                    res += i;
                }
            }

        }
        System.out.println(res);
    }
}
