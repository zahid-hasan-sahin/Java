package problemsolving;

import java.util.HashMap;
import java.util.Scanner;

public class Registrationsystem {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> name = new HashMap<String, Integer>();
        StringBuilder sb = new StringBuilder();
        int total = scan.nextInt();
        while (total-- > 0) {
            String s = scan.next();
            if (name.get(s) == null) {
                sb.append("OK\n");
                name.put(s,1);
            }else{
                int pos = name.get(s);
                sb.append(s+pos+"\n");
                name.put(s, ++pos);
            }

        }
        System.out.print(sb);

    }
}
