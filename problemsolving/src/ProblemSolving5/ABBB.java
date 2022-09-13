package ProblemSolving5;

import java.util.Scanner;
import java.util.Stack;

public class ABBB {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            String s = scan.next();
            Stack<Character> st = new Stack<Character>();
            for (int i = 0; i < s.length(); i++) {
                if (!st.isEmpty() && st.peek() == 'A' && s.charAt(i) == 'B') {
                    st.pop();

                } else if (!st.isEmpty() && st.peek() == 'B' && s.charAt(i) == 'B') {
                    st.pop();

                } else {

                    st.add(s.charAt(i));
                }
            }
            System.out.println(st.size());

        }
    }

}
