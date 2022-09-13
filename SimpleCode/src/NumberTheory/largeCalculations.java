package NumberTheory;

public class largeCalculations {

    static String sum(String a, String b) {
        String res = "";
        int c = 0;
        int an = a.length();
        int bn = b.length();
        for (int i = an - 1; i >= 0; i--) {
            res += a.charAt(i);
        }
        a = res;
        res = "";;
        for (int i = bn - 1; i >= 0; i--) {
            res += b.charAt(i);
        }
        b = res;
        res = "";
        int i;
        for (i = 0; i < Math.min(an, bn); i++) {
            if (an == bn && i == bn - 1) {
                res = (c + a.charAt(i) + b.charAt(i) - '0' - '0') + res;
            } else {
                int k = (c + a.charAt(i) + b.charAt(i) - '0' - '0');
                res = (k % 10) + res;
                c = k / 10;
            }
        }

        if (an > bn) {
            for (i = i; i < an; i++) {
                if (i == an - 1) {
                    res = (c + a.charAt(i) - '0') + res;

                } else {
                    int k = (c + a.charAt(i) - '0');
                    res = (k % 10) + res;
                    c = k / 10;
                }
            }

        } else {
            for (i = i; i < bn; i++) {
                if (i == bn - 1) {
                    res = (c + b.charAt(i) - '0') + res;

                } else {
                    int k = (c + b.charAt(i) - '0');
                    res = (k % 10) + res;
                    c = k / 10;
                }
            }

        }
        return res;
    }

    static String mul(String a, String b) {
        String res = "0";
        int an = a.length();
        int bn = b.length();
        a = new StringBuilder(a).reverse().toString();
        b = new StringBuilder(b).reverse().toString();
        int k = 0;
        for (int i = 0; i < an; i++) {
            String t = "";
            int c = 0;
            for (int j = 0; j < bn; j++) {

                if (bn - 1 == j) {
                    t = (c + ((b.charAt(j) - '0') * (a.charAt(i) - '0'))) + t;

                } else {
                    int tmp = (c + ((b.charAt(j) - '0') * (a.charAt(i) - '0')));
                    t = (tmp % 10) + t;
                    c = tmp / 10;
                }
            }
            for (int j = 0; j < k; j++) {
                t += "0";
            }

            ++k;
            res = sum(res, t);
        }
        return res;

    }

    static String mul(String a, long b) {
        String res = "";
        a = new StringBuilder(a).reverse().toString();
        int c = 0;
        int n = a.length();
        for (int i = 0; i < n; i++) {
            c += (a.charAt(i) - '0') * b;
            res = (c % 10) + res;
            c = c / 10;
        }
        if (c != 0) {
            res = c + res;
        }
        return res;
    }

}
