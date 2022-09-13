package Task;

public class OneD {

    static int pow(int base, int power) {
        if (power == 0) {
            return 1;
        }
        return pow(base, power - 1) * base;
    }

    public static void main(String args[]) {
        System.out.println(pow(3,3));
    }

}
