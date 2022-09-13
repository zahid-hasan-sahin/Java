package Task;

public class TwoA {

    static String decimalToBinary(int n, String res) {
        if (n == 0) {
            return res;
        }
        res = (n % 2) + res;
        return decimalToBinary(n / 2, res);

    }

    public static void main(String args[]) {
        System.out.println(decimalToBinary(20, ""));
    }

}
