package problemSolving8;

import java.util.Scanner;
import java.util.Stack;

public class CatchOverflow {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long curr = 1;
        long res = 0;
        Stack<Long> st = new Stack<Long>();
        st.add((long) 1);
        long p = (long) Math.pow(2, 32) - 1;
        for (int i = 0; i < n; i++) {
            String s = scan.next();
            if (s.equals("for")) {
                long in = scan.nextInt();
                st.add(Math.min(p + 10, st.peek() * in));
            } else if (s.equals("add")) {
                res += st.peek();
            } else {
                st.pop();
            }

        }
        if(res>p){
            System.out.println("OVERFLOW!!!");
        }else{
            System.out.println(res);
        }

    }

}
