package ProblemSolving4;

import java.util.Scanner;

public class InterviewwithOleg {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();

        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == 'o' && s.charAt(i + 1) == 'g' && s.charAt(i + 2) == 'o') {
                int c = 3;
                while(i+c+1<s.length() && s.charAt(i+c)=='g' && s.charAt(i+c+1)=='o'){
                    c+=2;
                }
                if(i+c<s.length()){
                    s = s.substring(0, i) + "***" + s.substring(i + c);
                }else{
                    s = s.substring(0, i) + "***";
                }

            }

        }

        System.out.println(s);
    }

}
