package problemSolving2;

import java.util.Scanner;

public class CompetitiveProgrammer {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            String s = scan.next();
            int sumOfDigit = 0;
            boolean isContain0 = false;
            int isContainEvenNum = 0;
            for (int i = 0; i < s.length(); i++) {
                sumOfDigit += (s.charAt(i) - '0');
                if (s.charAt(i) == '0') {
                    isContain0 = true;
                }  if ((s.charAt(i) - '0') % 2 == 0) {
                    isContainEvenNum++;
                }
            }
            if ((sumOfDigit % 3 == 0 && isContain0 && isContainEvenNum>1) ){
                System.out.println("red");
            } else {
                System.out.println("cyan");
            }

        }

    }

}
