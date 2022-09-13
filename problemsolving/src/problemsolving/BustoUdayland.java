package problemsolving;

import java.util.ArrayList;
import java.util.Scanner;

public class BustoUdayland {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<String> sit = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            sit.add(scan.next());
        }
        int c = 0;
        String s = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                if (sit.get(i).charAt(j) == 'O' && sit.get(i).charAt(j + 1) == 'O') {
                    s = sit.get(i);
                    if (j == 0) {
                        s = "++|" + s.substring(j + 3, j + 5);
                    } else {
                        s = s.substring(j - 3, j - 1) + "|++";
                    }
                    sit.set(i, s);
                    ++c;
                    break;

                }

            }
            if (c > 0) {
                break;
            }
        }
        if (c > 0) {
            System.out.println("YES");

            for (int i = 0; i < sit.size(); i++) {
                System.out.println(sit.get(i));
            }
        } else {
            System.out.println("NO");
        }

    }

}
