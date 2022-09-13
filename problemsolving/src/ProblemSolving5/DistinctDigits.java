package ProblemSolving5;

import java.util.HashSet;
import java.util.Scanner;

public class DistinctDigits {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        for (int i = a; i <= b; i++) {
            String s = String.valueOf(i);
            HashSet<Character> h = new HashSet<Character>();
            for (int j = 0; j < s.length(); j++) {
                h.add(s.charAt(j));
            }
            if(s.length()==h.size()){
                System.out.println(s);
                return;
            }
        }
        
        System.out.println(-1);
    }
}
