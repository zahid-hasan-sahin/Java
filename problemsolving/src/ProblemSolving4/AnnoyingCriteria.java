package ProblemSolving4;

import java.util.Scanner;

public class AnnoyingCriteria {

    static long divCount(long n) {
        long c = 0;
        for (int i = 1; i *i<= n; i++) {
            if(n%i==0){
                if(n/i!=i){
                    c+=2;
                }else{
                    ++c;
                }
            }
        }
        return c ;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            String s = scan.next();
            long c = 0;
            int n = s.length();
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                    c += s.charAt(i) - 'A' + 1;
                } else {
                    c += s.charAt(i) - 'a' + 1;
                }
            }
            long d = divCount(c);
            if(d>=n){
                System.out.println("IN");
            }else{
                System.out.println("OUT");
            }
        }

    }

}
