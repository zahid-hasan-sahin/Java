package problemSolving2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;
public class CollectingPackages {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();
        while (testCase-- > 0) {
            int n = scan.nextInt();
            TreeMap<Integer, String> temp = new TreeMap<Integer, String>();
            ArrayList<String> pos = new ArrayList<String>();
            for (int i = 0; i < n; i++) {
                int x = scan.nextInt();
                int y = scan.nextInt();
                temp.put((x + y), x + " " + y);

            }
            pos.addAll(temp.values());
            String res = "";
            boolean ch = false;
            int x = 0;
            int y = 0;
            try {
                for (int i = 0; i < n; i++) {
                    String[] t1 = pos.get(i).split(" ");
                    if (x > Integer.valueOf(t1[0]) || y > Integer.valueOf(t1[1])) {
                        ch = true;
                        break;
                    } else {
                        x = Integer.valueOf(t1[0]);
                        y = Integer.valueOf(t1[1]);
                    }

                }
                if (ch) {
                    System.out.println("NO");
                } else {
                    x = 0;
                    y = 0;
                    for (int i = 0; i < n; i++) {
                        String[] t = pos.get(i).split(" ");
                        res += "R".repeat(Integer.valueOf(t[0]) - x);
                        res += "U".repeat(Integer.valueOf(t[1]) - y);
                        x = Integer.valueOf(t[0]);
                        y = Integer.valueOf(t[1]);

                    }
                    System.out.println("YES");
                    System.out.println(res);
                }

            } catch (Exception e) {
                System.out.println("NO");
            }

        }

    }
}
