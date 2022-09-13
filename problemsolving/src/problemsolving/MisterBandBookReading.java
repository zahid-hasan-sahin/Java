package problemsolving;

import java.util.Scanner;

public class MisterBandBookReading {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int c = scan.nextInt();
        int v1 = scan.nextInt();
        int v2 = scan.nextInt();
        int a = scan.nextInt();
        int l = scan.nextInt();
        int countReadedPages = 0;
        int readingSpeed = 0;
        int reRead = 0;
        int day = 1;
        while (c > countReadedPages) {
            if (v1 + (day * readingSpeed) - (reRead) <= v2 && v1 <= v2) {
                countReadedPages += v1 + (day * readingSpeed) - (reRead);
                System.out.println("hjdaskl");
            } else {
                countReadedPages += (v2 - (reRead));
            }
            System.out.println(countReadedPages);
            ++day;
            readingSpeed = a;
            reRead = l;

        }
        System.out.println(day);
    }

}
