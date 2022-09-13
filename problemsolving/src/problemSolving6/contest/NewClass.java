package problemSolving6;

import java.util.Scanner;
import java.util.Stack;

public class NewClass {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int q = scan.nextInt();
        a:
        while (q-- > 0) {
            String s = scan.next();
            Stack<Character> st = new Stack<Character>();

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    if (st.size() == 0) {
                        System.out.println("NO");
                        continue a;
                    }
                    char c = st.peek();
                    if (c == ')' || c == '?') {
                        st.pop();
                    } else {
                        System.out.println("NO");
                        continue a;
                    }
                } else if (s.charAt(i) == ')') {
                    if (st.size() == 0) {
                        System.out.println("NO");
                        continue a;
                    }
                    char c = st.peek();
                    if (c == '(' || c == '?') {
                        st.pop();
                    } else {
                        System.out.println("NO");
                        continue a;
                    }
                } else {
                    st.add('?');
                }

            }
            if (st.size() == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}
