package ProblemSolving4;

import java.util.Scanner;

public class Letter {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String p = scan.nextLine();
        int[] a = new int[60];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                ++a[s.charAt(i) - 'A'];
            }
        }
        
        for (int i = 0; i < p.length(); i++) {
            if(p.charAt(i)!=' '){
                int n = p.charAt(i)-'A';
                --a[n];
                if(a[n]<0){
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");

    }
}
