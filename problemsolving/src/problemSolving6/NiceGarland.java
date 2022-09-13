package problemSolving6;

import java.util.Scanner;

public class NiceGarland {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        int res = 1000000000;
        int c = 0;
        StringBuilder sb = new StringBuilder();
        StringBuilder t = new StringBuilder();

        for (int i = 0; i < n; i += 3) {
            String k = s.substring(i, Math.min(n, i + 3));
            String r = "BGR";
            for (int j = 0; j < k.length(); j++) {
                sb.append(r.charAt(j));
                if (k.charAt(j) != r.charAt(j)) {
                    ++c;
                }
            }
        }

        if (res > c) {
    
            t = new StringBuilder(sb);
           
            res = c;
        }
        sb.delete(0, sb.length());

        c = 0;
        for (int i = 0; i < n; i += 3) {
            String k = s.substring(i, Math.min(n, i + 3));
            String r = "BRG";
            for (int j = 0; j < k.length(); j++) {
                sb.append(r.charAt(j));
                if (k.charAt(j) != r.charAt(j)) {
                    ++c;
                }
            }
        }

        if (res > c) {
           t = new StringBuilder(sb);
            res = c;
        }
        sb.delete(0, sb.length());
        c = 0;
        for (int i = 0; i < n; i += 3) {
            String k = s.substring(i, Math.min(n, i + 3));
            String r = "RBG";
            for (int j = 0; j < k.length(); j++) {
                sb.append(r.charAt(j));
                if (k.charAt(j) != r.charAt(j)) {
                    ++c;
                }
            }
        }
        if (res > c) {
           t = new StringBuilder(sb);
            res = c;
        }
        sb.delete(0, sb.length());
        c = 0;
        for (int i = 0; i < n; i += 3) {
            String k = s.substring(i, Math.min(n, i + 3));
            String r = "RGB";
            for (int j = 0; j < k.length(); j++) {
                sb.append(r.charAt(j));
                if (k.charAt(j) != r.charAt(j)) {
                    ++c;
                }
            }
        }
        if (res > c) {
           t = new StringBuilder(sb);
            res = c;
        }
        sb.delete(0, sb.length());
        c = 0;
        for (int i = 0; i < n; i += 3) {
            String k = s.substring(i, Math.min(n, i + 3));
            String r = "GRB";
            for (int j = 0; j < k.length(); j++) {
                sb.append(r.charAt(j));
                if (k.charAt(j) != r.charAt(j)) {
                    ++c;
                }
            }
        }
        if (res > c) {

            t = new StringBuilder(sb);
            res = c;
        }
        sb.delete(0, sb.length());
        c = 0;
        for (int i = 0; i < n; i += 3) {
            String k = s.substring(i, Math.min(n, i + 3));
            String r = "GBR";
            for (int j = 0; j < k.length(); j++) {
                sb.append(r.charAt(j));
                if (k.charAt(j) != r.charAt(j)) {
                    ++c;
                }
            }
        }

        if (res > c) {
            t = new StringBuilder(sb);
            res = c;
        }
        System.out.println(res);
        System.out.println(t);

    }
}
