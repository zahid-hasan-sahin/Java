package javaapplication1;

import java.util.Scanner;

class NewClass {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Enter First Number: ");
        String f = scan.next();
        System.out.print("Please Enter Second Number: ");
        String l = scan.next();
        int fn = Integer.valueOf(f);
        int c = 0;
        int ln = Integer.valueOf(l);
        for (int i = f.length() - 1; i >= 0; i--) {
            for (int j = l.length() - 1; j >= 0; j--) {
                int n = Character.getNumericValue(f.charAt(i));
                int m = Character.getNumericValue(l.charAt(j));
                if (f.length() > l.length()) {
                    c = f.length() - l.length();
                    if (i == (j + c)) {
                        if (m + n >= 10) {
                            System.out.println("carray");
                            break;
                        } else {
                            System.out.println("no carry");
                            break;
                        }

                    }

                } else {
                    c = (l.length() - f.length());
                    if ((i + c) == j) {
                        if (m + n >= 10) {
                            System.out.println("carray");
                            break;
                        } else {
                            System.out.println("no carry");
                            break;
                        }
                    }

                }

            }

        }

    }

}
