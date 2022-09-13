package problemSolving2;

import java.util.Scanner;

public class Spreadsheets {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        StringBuffer sb = new StringBuffer();
        while (t-- > 0) {
            String s = scan.next();
            if (s.contains("R") && s.contains("C") && s.charAt(s.indexOf("R") + 1) >= '0' && s.charAt(s.indexOf("R") + 1) <= '9' &&  s.charAt(s.indexOf("C") + 1) >= '0' && s.charAt(s.indexOf("C") + 1) <= '9') {
                String left = s.split("C")[0];
                String row = left.split("R")[1];
                String col = s.split("C")[1];
                int tcol = Integer.valueOf(col);
                col = "";
                while (tcol > 0) {
                    col += (char) (tcol % 26 + 64);
                    if (tcol % 26 == 0) {
                        tcol = (tcol - 1) / 26;
                    } else {
                        tcol = tcol / 26;
                    }
                }
                String column = "";
                for (int j = col.length() - 1; j >= 0; j--) {
                    if (col.charAt(j) == '@') {
                        column += "Z";
                    } else {
                        column += col.charAt(j);

                    }
                }

                sb.append(column + "" + row + "\n");

            } else {
                int i = 0;
                int col = 0;
                String row = "";
                while (s.charAt(i) > '9') {
                    col += (s.charAt(i) - 64);
                    if (s.charAt(i + 1) <= '9') {
                        for (i = i + 1; i < s.length(); i++) {
                            row += s.charAt(i);
                        }
                        break;
                    }
                    col = col * 26;
                    ++i;
                }
                sb.append("R" + row + "C" + col + "\n");
            }

        }
        System.out.println(sb);

    }

}
