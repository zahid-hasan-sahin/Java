package problemSolving2;

import java.util.ArrayList;
import java.util.Scanner;

public class TavasandSaDDas {

    public static int ch(int n) {
        ArrayList<Integer> ln = new ArrayList<Integer>();
        ln.add(4);
        ln.add(7);
        int res = 0;
        
        for (int i = 0; i < ln.size(); i++) {
            for (int j = 0; j < 2; j++) {
                ln.add(Integer.valueOf(ln.get(i) + "" + ln.get(j)));
                if (ln.contains(n)) {
                    return ln.indexOf(n)+1;
                }
                ++res;
            }
        }
        return 0;

    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        System.out.println(ch(n));
    }

}
