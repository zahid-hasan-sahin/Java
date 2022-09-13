package problemsolving;

import java.util.Arrays;
import java.util.Scanner;

public class ShuffleHashing {

    public static String sortString(String inputString) {

        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);

        return new String(tempArray);
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        StringBuffer sb = new StringBuffer();
        while (t-- > 0) {
            
            String s = scan.next();
            s = sortString(s);
            String h = scan.next();
            int k = s.length();
            boolean res = false;
            for (int i = 0; i < h.length() - (k-1); i++) {
                if (sortString(h.substring(i, i + k)).equalsIgnoreCase(s)) {
                    res = true;
                    break;
                }
            }
            if (res) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }
        System.out.println(sb);

    }
}
