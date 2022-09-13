package problemsolving;

import java.util.ArrayList;
import java.util.Scanner;

public class BeautifulDivisors {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> bn = new ArrayList<Integer>();
        int n = scan.nextInt();
        for (int i = 1; i < 10; i++) {
            int temp = (int) ((Math.pow(2, i) - 1) * (Math.pow(2, i - 1)));
            bn.add(temp);
        }
        int res = 0;
        for (int i = 0; i < 9; i++) {
            if(n%bn.get(i)==0){
                res = bn.get(i);
            }
        }
        System.out.println(res);

    }
}
