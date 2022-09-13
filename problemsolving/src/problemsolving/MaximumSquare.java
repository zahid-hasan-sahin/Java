package problemsolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaximumSquare {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        ArrayList<Integer> val = new ArrayList<Integer>();
        while (total-- > 0) {
            int n = scan.nextInt();
            for (int i = 0; i < n; i++) {
                val.add(scan.nextInt());

            }
            int c = 0;
            int r = 0;
            Collections.sort(val);
            for (int i = n - 1; i >= 0; i--) {
                for (int j = 0; j < n; j++) {
                    if (val.get(j) >= val.get(i)) {
                        c++;

                    }
                }
                if (val.get(i) <= c) {               
                   System.out.println(c );
                   break;
                }else if(val.get(i)>=c && val.size()-c<c){
                    System.out.println(c);
                    break;
                }

                c = 0;

            }
            val.clear();
            c = 0;
        }
    }
}
