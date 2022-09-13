package ProblemSolving4;

import java.util.Scanner;

public class Divisibilityby25 {

    public static String rem(String str, int p) {
        return str.substring(0, p) + str.substring(p + 1);
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String k = "";
        String t = s;
        long q = Long.valueOf(s);
        if (q % 25 == 0) {
            System.out.println(0);
            return;
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            k += s.charAt(i);
        }
        s = k;
        int r = 100;
        int[] a = new int[10];
        for (int i = 0; i < s.length(); i++) {
            ++a[s.charAt(i) - '0'];
        }
        if (a[2] != 0 && a[5] != 0) {
            int p = 0;
            String u = t;
            p = p + (s.indexOf('2') > 0 ? s.indexOf('2') - 1 : 0);
            p += s.indexOf('5');
            if (s.indexOf('5') > s.indexOf('2') && s.indexOf('2') != 0) {
                ++p;
            }
            u = rem(u, u.indexOf('2'));
            u = rem(u, u.indexOf('5'));

            if (u.length() >= 2 && u.charAt(0) == '0') {
                int i = 0;
                boolean b = false;
                while (u.charAt(i) == '0') {
                    ++i;
                    ++p;
                    if (i >= u.length()) {
                        b = true;
                        break;
                    }
                }
                if (!b) {
                    r = Math.min(p, r);
                }
            } else if (u.length() == 0 || u.charAt(0) != '0') {
                r = Math.min(p, r);
            }

        }
        if (a[5] != 0 && a[0] != 0) {
            int p = 0;
            String u = t;
            p = p + (s.indexOf('5') > 0 ? s.indexOf('5') - 1 : 0);
            p += s.indexOf('0');
            if (s.indexOf('0') > s.indexOf('5') && s.indexOf('5') != 0) {
                ++p;
            }
            u = rem(u, u.indexOf('5'));
            u = rem(u, u.indexOf('0'));
            if (u.length() >= 2 && u.charAt(0) == '0') {
                int i = 0;
                boolean b = false;
                while (u.charAt(i) == '0') {
                    ++i;
                    ++p;
                    if (i >= u.length()) {
                        b = true;
                        break;
                    }
                }
                if (!b) {
                    r = Math.min(p, r);
                }
            } else if (u.length() == 0 || u.charAt(0) != '0') {
                r = Math.min(p, r);
            }
        }
        if (a[7] != 0 && a[5] != 0) {
            int p = 0;
            String u = t;
            p = p + (s.indexOf('7') > 0 ? s.indexOf('7') - 1 : 0);
            p += s.indexOf('5');
            if (s.indexOf('5') > s.indexOf('7') && s.indexOf('7') != 0) {
                ++p;
            }
            u = rem(u, u.indexOf('7'));
            u = rem(u, u.indexOf('5'));
            if (u.length() >= 2 && u.charAt(0) == '0') {
                int i = 0;
                boolean b = false;
                while (u.charAt(i) == '0') {
                    ++i;
                    ++p;
                    if (i >= u.length()) {
                        b = true;
                        break;
                    }
                }
                if (!b) {
                    r = Math.min(p, r);
                }
            } else if (u.length() == 0 || u.charAt(0) != '0') {
                r = Math.min(p, r);
            }

        }
        if (a[0] >= 2) {
            int p = 0;
            p = p + s.indexOf('0');
            s = rem(s, s.indexOf('0'));
            p += s.indexOf('0');
            s = rem(s, s.indexOf('0'));
            if (s.length() >= 2 && s.charAt(0) == '0') {
                int i = 0;
                boolean b = false;
                while (s.charAt(i) == '0') {
                    ++i;
                    ++p;
                    if (i >= s.length()) {
                        b = true;
                        break;
                    }
                }
                if (!b) {
                    r = Math.min(p, r);
                }
            } else if (s.length() == 0 || s.charAt(0) != '0') {
                r = Math.min(p, r);
            }

        }
        if (r == 100) {
            System.out.println(-1);
        } else {
            System.out.println(r);
        }
    }

}
