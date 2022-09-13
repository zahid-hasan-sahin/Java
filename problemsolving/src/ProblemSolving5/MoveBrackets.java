package ProblemSolving5;

import java.util.Scanner;
import java.util.Stack;

public class MoveBrackets {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            Stack<Character> st = new Stack<Character>();
            int k = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '(') {
                    st.add('(');
                } else {

                    if (!st.isEmpty() && st.peek() == '(') {
                        st.pop();
                    } else {
                        ++k;
                    }

                }
            }
            System.out.println(k);
        }
    }
}
