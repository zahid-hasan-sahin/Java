package problemsolving;

import java.util.ArrayList;
import java.util.Scanner;

public class TVSubscriptions {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int d = scan.nextInt();
        ArrayList<Integer> val = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            val.add(scan.nextInt());
        }
        ArrayList<Integer> t = new ArrayList<Integer>();
        int j = 0;
        int jt = j + d;
        int c = 0;
        int r = d;

        while (true) {
            for (int i = j; i < jt; i++) {
                for (int l = j; l < jt; l++) {
                    if (i != l) {
                        if (val.get(i) == val.get(l)) {
                            c++;
                         // System.out.println("i="+val.get(i));
                     //   System.out.println("j"+val.get(l));

                        }
                    }

                }

            }
            if (d - (c/2) < r) {
               // System.out.println(c/2);
                r = (c/2);
              

            }
            j++;
            c=0;
            System.out.println(jt);
            
        }
      

    }

}
